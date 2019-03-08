
$(document).ready(function() {

	//生成一个汇报树
	$('#reportTree').tree({    
		url : "/AppOrgGroup/getReportTree",
		dnd : true, //定义是否启用拖拽功能。 
	    loadFilter: function(data){ 
	        if (data.d){    
	            return data.d;    
	        } else {    
	            return data;    
	        }    
	    },
	    onClick: function(node){// 在用户点击的时候提示
	    	treeonClickFunction(node);
		},
	    onContextMenu: function(e, node){//右键点击节点并显示快捷菜单
			e.preventDefault();
			// 查找节点
			$('#reportTree').tree('select', node.target);
			treeonClickFunction(node);
//			console.log(node);
			// 显示快捷菜单
			$('#mm_grg').menu('show', {
				left: e.pageX,
				top: e.pageY
			});
		}
		,onBeforeDrop: function(target, source, point){//在onDrop前调用
			if (!confirm("确认拖拽组...")) {
				return false;
			}
			var pNode = $('#reportTree').tree('getNode',target);
			alert(pNode.id);
			$.ajax({
				 dataType:'json',
				 data: {
					 grpId : source.id,
					 pgrpId : pNode.id
				 }, 
				 url:"/AppOrgGroup/moveGroup",
				 success:function(result){
					 if (result != "200") {
						alert(result);
					}
				 } 
			});
		}
		,onDragEnter: function(target, source){//source 移动的node节点
			$('#reportTree').tree('expand',target);
		}
	});  
	
});

/* 员工号: 姓名:  职务:部门ID: 部门名称: */
function dlEmployeeFuntion(employee_id, name, rank, dept_id, dept_name, _this){ 
  
    $("#dlEmployee").find("a[class='groupmembers']").removeClass("groupmembers");
    $("#dlEmployee").find('input').prop('checked', false)  //true选中,false不选中
    $(_this).find('a').attr("class","groupmembers");
    $(_this).find('input').prop('checked', true)  //true选中,false不选中
    $("#txtEmployeeID").attr("value",employee_id);
	$("#txtEmployeeName").attr("value",name);
	$("#txtRank").attr("value",rank);
	$("#txtDeptID").attr("value",dept_id);
	$("#txtDeptName").attr("value",dept_name);
	
	$.ajax({
		 dataType:'json',
		 data: {id:employee_id},//测试 
		 url:"/AppOrgGroup/getGroupNameId",
		 success:function(result){
			$("#memberGroups").html("");
			var htmlDept ="";
			 $.each(result,function(){
				 htmlDept = htmlDept +"<span><a href='javascript:;' style='cursor: pointer; padding: 2px; display: inline-block;'>";
				 htmlDept = htmlDept +this;//综合管理部主管（公务票审批组）#8695
				 htmlDept = htmlDept +"</a></span><br/>";
			 })
		 	$("#memberGroups").html(htmlDept);
		 } 
	});
}
 
function OnGroupClicked(_this){ 
    $("#memberGroups").find("a[class='groupmembers']").removeClass("groupmembers");
    $(_this).attr("class","groupmembers");
}

/* 树点击事件函数 */
function treeonClickFunction(node){
	
	$("#grpId").attr("value",node.attributes.grpId);
	$("#grpName").attr("value",node.attributes.grpName);
	$("#grpType").attr("value",node.attributes.grpType);
	$("#grpLevel").attr("value",node.attributes.grpLevel);
	$("#deptId").attr("value",node.attributes.deptId);
	$("#groupUpdate").prop("disabled",false);//true选中,不选中
	/* 清空数据 */
	$("#dlEmployee").html(""); 
	$("#memberGroups").html("");
		$("#txtEmployeeID").attr("value","");
	$("#txtEmployeeName").attr("value","");
	$("#txtRank").attr("value","");
	$("#txtDeptID").attr("value","");
	$("#txtDeptName").attr("value","");
	$.ajax({
		dataType:'json',
		data: {grpId : node.attributes.grpId},//组ID
		url:"/AppOrgGroup/getReportUserTree",
		success:function(result){
		var _html ="";
		 $.each(result,function(){
		 	_html = _html+ " <span style='background-color: white;' onclick='dlEmployeeFuntion(\""+this.employee_id+"\", \""
					+this.name+"\", \""+this.rank+"\", \""+this.dept_id+"\", \""+this.dept_name+"\", this)'> ";
			_html = _html+" <span disabled='disabled'><input type='checkbox' disabled='disabled'></span> ";
			_html = _html+"<a id='"+this.employee_id+"' href='javascript:;' style='cursor: pointer;'>"+this.name+"("+this.employee_id+")</a></span><br>";
			
		 })
			$("#dlEmployee").html( _html);
		} 
	});
}

