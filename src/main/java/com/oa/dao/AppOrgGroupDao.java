package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.oa.entityVo.EmployeesDeptVo;
import com.oa.javaBean.AppOrgGroup;

/**
 * @Description 类描述:用户组Dao
 * @author liang
 * @date 时间: 2019年2月28日 下午2:46:15
 */
public interface AppOrgGroupDao {
	
	@Select(" SELECT CONCAT(o.GRP_Name,' #', o.GRP_ID ) AS groupNameId FROM  APP_ORG_Group o, app_org_group_user ou "
			+ " WHERE o.isDelete= '0' AND o.GRP_ID=ou.GRP_ID AND  ou.User_ID=#{id}")
	@Results({ @Result(property = "groupNameId", column = "groupNameId", jdbcType = JdbcType.VARCHAR) })
	List<String> getGroupNameId(String id);
	
	
	@Select(" SELECT a.employee_id, a.name, a.rank, b.dept_id, b.dept_name "
			+ " FROM app_org_group_user ou "
			+ " LEFT OUTER JOIN oa_employees a "
			+ " ON  ou.User_ID=a.employee_id "
			+ " LEFT OUTER JOIN OA_DEFINITION_DEPT b "
			+ " ON a.dept_id=b.dept_id "
			+ " WHERE isDelete='0' AND GRP_ID=#{grpId} ")
	@Results({
		@Result(id = true, property = "employee_id", column = "employee_id", jdbcType = JdbcType.VARCHAR),
		@Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "rank", column = "rank", jdbcType = JdbcType.VARCHAR),
		@Result(property = "dept_id", column = "dept_id", jdbcType = JdbcType.INTEGER),
		@Result(property = "dept_name", column = "dept_name", jdbcType = JdbcType.VARCHAR)
		})
	List<EmployeesDeptVo> getOrgGroupUserTree(int grpId);
	
	
	@Select(" SELECT o.GRP_ID, o.PGRP_ID, o.GRP_Name, o.GRP_Type, o.GRP_Level, o.Leaf_Flag, o.DEPT_ID FROM  APP_ORG_Group o  WHERE o.isDelete= '0'  ")
	@Results({ @Result(id = true, property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "pgrpId", column = "PGRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpName", column = "GRP_Name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpType", column = "GRP_Type", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpLevel", column = "GRP_Level", jdbcType = JdbcType.INTEGER),
		@Result(property = "leafFlag", column = "Leaf_Flag", jdbcType = JdbcType.VARCHAR),
		@Result(property = "deptId", column = "DEPT_ID", jdbcType = JdbcType.VARCHAR)})
	List<AppOrgGroup> getOrgGroupTree();
	
}
