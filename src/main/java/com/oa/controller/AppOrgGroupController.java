package com.oa.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.dao.AppOrgGroupDao;
import com.oa.entityVo.EmployeesDeptVo;
import com.oa.entityVo.MenuTreeUtil;
import com.oa.entityVo.OrgGroupUserVo;
import com.oa.entityVo.TableResponseVo;
import com.oa.javaBean.AppOrgGroup;
import com.oa.javaBean.AppOrgGroupUser;

/**
 * @Description 类描述: 用户组
 * @author liang
 * @date 时间: 2019年2月28日 下午2:44:36
 */
@Controller
@RequestMapping("/AppOrgGroup")
public class AppOrgGroupController {

	@Autowired
	AppOrgGroupDao appOrgGroupDao;
	
	@ResponseBody
	@RequestMapping("/getReportTree")
	public List<Object> getReportTree(){
		 System.err.println("测试。。。。。。。。。。");
		List<AppOrgGroup> groupTree = appOrgGroupDao.getOrgGroupTree();
		MenuTreeUtil menuTree = new MenuTreeUtil();
		List<Object> menuList = menuTree.menuList(groupTree);
		return menuList;
	}
	
	
	@ResponseBody
	@RequestMapping("/getReportUserTree")
	public List<EmployeesDeptVo> getReportUserTree(int grpId){
		
		List<EmployeesDeptVo> employeesDeptVo = appOrgGroupDao.getOrgGroupUserTree(grpId);	
		return employeesDeptVo;
	}
	
	@ResponseBody
	@RequestMapping("/getGroupNameId")
	public List<String> getGroupNameId(String id){
		
		List<String> groupNameIdList = appOrgGroupDao.getGroupNameId(id);
		return groupNameIdList;
	}
	
	@ResponseBody
	@RequestMapping("/getCPMGroupUser")
	public TableResponseVo getCPMGroupUser(String CPM_userId, String CPM_name){
		
		List<OrgGroupUserVo> OrgGroupUserVoList = appOrgGroupDao.getCPMGroupUser(CPM_userId, CPM_name);
		TableResponseVo tableResponseVo = new TableResponseVo(OrgGroupUserVoList);
		
		return tableResponseVo;
	}
	
	@ResponseBody
	@RequestMapping("/getCPMGroup")
	public TableResponseVo getCPMGroup(String CPM_grpId, String CPM_grpName, String CPM_deptId){
		
		List<AppOrgGroup> cpmGroup = appOrgGroupDao.getCPMGroup(CPM_grpId, CPM_grpName, CPM_deptId);
		TableResponseVo tableResponseVo = new TableResponseVo(cpmGroup);
		if (cpmGroup!=null) {
			tableResponseVo.setCount(cpmGroup.size());
		}
		return tableResponseVo;
	}
	
	/**
	 * @param appOrgGroup
	 * @return
	 * @Description 方法描述: 增加用户组  
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:42:42
	 */
	@ResponseBody
	@RequestMapping("/addGroup")
	public TableResponseVo addGroup(AppOrgGroup appOrgGroup){
		 
		appOrgGroup.setIsDelete("0");
		appOrgGroupDao.addGroup(appOrgGroup);
		
		List<Object> list = new ArrayList<Object>();
		Map<String, Object> mapArr = new LinkedHashMap<String, Object>();
		mapArr.put("id",  appOrgGroup.getGrpId());
		mapArr.put("text", appOrgGroup.getGrpLevel()+""+appOrgGroup.getGrpName());
		mapArr.put("attributes", appOrgGroup);
		mapArr.put("children", null);
		list.add(mapArr);
		
		return new TableResponseVo(list);
	}
	
	/**
	 * @param appOrgGroup
	 * @return
	 * @Description 方法描述: 修改用户组
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:43:27
	 */
	@ResponseBody
	@RequestMapping("/updateGroup")
	public String updateGroup(AppOrgGroup appOrgGroup){
		
		appOrgGroupDao.updateGroup(appOrgGroup);
		return "200";
	}
	
	/**
	 * @param appOrgGroup
	 * @return
	 * @Description 方法描述: 移动用户组
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:43:27
	 */
	@ResponseBody
	@RequestMapping("/moveGroup")
	public String moveGroup(Integer grpId, Integer pgrpId){
		
//		//先备份数据，后再修改数据
//		AppOrgGroup group = appOrgGroupDao.getGroupById(grpId);
//		group.setIsDelete("1");
//		appOrgGroupDao.addGroupById(group);
		
		appOrgGroupDao.moveGroup(grpId, pgrpId);//修改数据
		
		return "200";
	}
	
	/**
	 * @param grpId
	 * @return
	 * @Description 方法描述: 删除用户组
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:43:27
	 */
	@ResponseBody
	@RequestMapping("/deleteGroup")
	public TableResponseVo deleteGroup(int grpId){
		appOrgGroupDao.deleteGroup(grpId);
		return new TableResponseVo();
	}
	
	
	
 ////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////
	
	 
	/**
	 * 
	 * @param appOrgGroupUser
	 * @return
	 * @Description 方法描述: 保存用户和组关联信息(添加员工到其它组)
	 * @author liang
	 * @date 时间: 2019年3月6日 下午2:29:33
	 */
	@ResponseBody
	@RequestMapping("/insertAppOrgGroupUser")
	public TableResponseVo insertAppOrgGroupUser(AppOrgGroupUser appOrgGroupUser){
		appOrgGroupDao.insertAppOrgGroupUser(appOrgGroupUser);//您无权添加非管理范围内的员工！
		
		return new TableResponseVo();
	}
	
	/**
	 * @param grpId
	 * @return
	 * @Description 方法描述: 删除用户关联用户组
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:43:27
	 */
	@ResponseBody
	@RequestMapping("/deleteGroupUser")
	public TableResponseVo deleteGroupUser(int grpId, String userId){
		
		appOrgGroupDao.deleteGroupUser(grpId,userId);
		return new TableResponseVo();
	}
	
	/**
	 * @param grpId
	 * @return
	 * @Description 方法描述: 查询用户信息
	 * @author liang
	 * @date 时间: 2019年3月5日 下午2:43:27
	 */
	@ResponseBody
	@RequestMapping("/getEmp2User")
	public Object getEmp2User(String userId){
		
		EmployeesDeptVo employeesDeptVo = appOrgGroupDao.getEmp2User(userId);
		if (employeesDeptVo==null) {
			return "404";//没有员工信息
		} 
		return employeesDeptVo;
	}
	
	 /**
	  * @param userId
	  * @param grpId
	  * @param oldGrpId
	  * @return
	  * @Description 方法描述:  移动员工到其它组
	  * @author liang
	  * @date 时间: 2019年3月6日 下午6:41:33
	  */
	@ResponseBody
	@RequestMapping("/moveGroupUser")
	public String moveGroupUser(String userId, int grpId, int oldGrpId){
		
		AppOrgGroupUser orgGroupUser = appOrgGroupDao.getOrgGroupUser(oldGrpId, userId);
		appOrgGroupDao.deleteGroupUser(oldGrpId, userId);
		
		orgGroupUser.setGrpId(grpId);
		orgGroupUser.setLastUpdateTime(null);
		appOrgGroupDao.insertAppOrgGroupUser(orgGroupUser);
		
		return "200";
	}
	
	
}
 
