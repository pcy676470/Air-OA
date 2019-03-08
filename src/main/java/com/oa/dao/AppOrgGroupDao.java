package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.oa.entityVo.EmployeesDeptVo;
import com.oa.entityVo.OrgGroupUserVo;
import com.oa.javaBean.AppOrgGroup;
import com.oa.javaBean.AppOrgGroupUser;

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
	
	@Select(" SELECT * FROM app_org_group_user WHERE isDelete='0' AND GRP_ID=#{grpId}  AND User_ID=#{userId}")
	@Results({
		@Result(id = true, property = "recID", column = "RecID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "userId", column = "User_ID", jdbcType = JdbcType.VARCHAR),
		@Result(property = "isDelete", column = "isDelete", jdbcType = JdbcType.VARCHAR),
		@Result(property = "lastUpdateTime", column = "lastUpdateTime", jdbcType = JdbcType.DATE)
		})
	AppOrgGroupUser getOrgGroupUser(int grpId, String userId);
	
	@Select(" SELECT o.GRP_ID, o.PGRP_ID, o.GRP_Name, o.GRP_Type, o.GRP_Level, o.Leaf_Flag, o.DEPT_ID FROM  APP_ORG_Group o  WHERE o.isDelete= '0'  ")
	@Results({ @Result(id = true, property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "pgrpId", column = "PGRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpName", column = "GRP_Name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpType", column = "GRP_Type", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpLevel", column = "GRP_Level", jdbcType = JdbcType.INTEGER),
		@Result(property = "leafFlag", column = "Leaf_Flag", jdbcType = JdbcType.VARCHAR),
		@Result(property = "deptId", column = "DEPT_ID", jdbcType = JdbcType.VARCHAR)})
	List<AppOrgGroup> getOrgGroupTree();
	
	@Select("<script>"
			+ " SELECT GRP_ID, PGRP_ID, GRP_Name, GRP_Type, GRP_Level, Leaf_Flag, DEPT_ID FROM  APP_ORG_Group "
			+ " WHERE isDelete= '0' "
			+ " <if test='CPM_grpId !=null and CPM_grpId.length()>0'> AND GRP_ID LIKE CONCAT('%',#{CPM_grpId},'%')</if> "
			+ " <if test='CPM_grpName !=null and CPM_grpName.length()>0'> AND GRP_Name LIKE CONCAT('%',#{CPM_grpName},'%') </if> "
			+ " <if test='CPM_deptId !=null and CPM_deptId.length()>0'> AND DEPT_ID LIKE CONCAT('%',#{CPM_deptId},'%') </if> "
			+ "</script>")
	@Results({ @Result(id = true, property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "pgrpId", column = "PGRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpName", column = "GRP_Name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpType", column = "GRP_Type", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpLevel", column = "GRP_Level", jdbcType = JdbcType.INTEGER),
		@Result(property = "leafFlag", column = "Leaf_Flag", jdbcType = JdbcType.VARCHAR),
		@Result(property = "deptId", column = "DEPT_ID", jdbcType = JdbcType.VARCHAR)})
	List<AppOrgGroup> getCPMGroup(String CPM_grpId, String CPM_grpName, String CPM_deptId);
	
	@SelectProvider(type = TrendsParamSql.class, method = "getCPMGroupUser") 
	@Results({ 
		@Result(property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "pgrpId", column = "PGRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpName", column = "GRP_Name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpType", column = "GRP_Type", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpLevel", column = "GRP_Level", jdbcType = JdbcType.INTEGER),
		@Result(property = "leafFlag", column = "Leaf_Flag", jdbcType = JdbcType.VARCHAR),
		@Result(property = "deptId", column = "DEPT_ID", jdbcType = JdbcType.VARCHAR),
		@Result(property = "userId", column = "employee_id", jdbcType = JdbcType.VARCHAR),
		@Result(property = "userName", column = "name", jdbcType = JdbcType.VARCHAR)
		})
	List<OrgGroupUserVo> getCPMGroupUser(String CPM_userId, String CPM_name);

	@Insert("INSERT INTO APP_ORG_Group(PGRP_ID,GRP_Name,GRP_Type,GRP_Level,Leaf_Flag,DEPT_ID,isDelete) "
			+ "VALUES(#{pgrpId}, #{grpName}, #{grpType}, #{grpLevel}, #{leafFlag}, #{deptId}, #{isDelete} ) ")
	@Options(useGeneratedKeys=true, keyProperty="grpId")
	void addGroup(AppOrgGroup appOrgGroup);
	
	@Insert("INSERT INTO APP_ORG_Group(GRP_ID,PGRP_ID,GRP_Name,GRP_Type,GRP_Level,Leaf_Flag,DEPT_ID,isDelete) "
			+ "VALUES(#{grpId},#{pgrpId}, #{grpName}, #{grpType}, #{grpLevel}, #{leafFlag}, #{deptId}, #{isDelete} ) ")
	@Options(useGeneratedKeys=true, keyProperty="grpId")
	void addGroupById(AppOrgGroup appOrgGroup);
	
	@Update(" UPDATE APP_ORG_Group SET "
			+ " GRP_Name = #{grpName},"
			+ " GRP_Type = #{grpType},"
			+ " GRP_Level = #{grpLevel},"
			+ " DEPT_ID=#{deptId} "
			+ " where GRP_ID=#{grpId} ")
	void updateGroup(AppOrgGroup appOrgGroup);
	
	@Update(" UPDATE APP_ORG_Group SET PGRP_ID=#{pgrpId} where GRP_ID = #{grpId} ")
	void moveGroup(int grpId, int pgrpId);

	@Select(" SELECT * FROM  APP_ORG_Group WHERE isDelete= '0' and GRP_ID=#{grpId} ")
	@Results({ 
		@Result(property = "grpId", column = "GRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "pgrpId", column = "PGRP_ID", jdbcType = JdbcType.INTEGER),
		@Result(property = "grpName", column = "GRP_Name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpType", column = "GRP_Type", jdbcType = JdbcType.VARCHAR),
		@Result(property = "grpLevel", column = "GRP_Level", jdbcType = JdbcType.INTEGER),
		@Result(property = "leafFlag", column = "Leaf_Flag", jdbcType = JdbcType.VARCHAR),
		@Result(property = "deptId", column = "DEPT_ID", jdbcType = JdbcType.VARCHAR),
		@Result(property = "isDelete", column = "isDelete", jdbcType = JdbcType.VARCHAR),
		@Result(property = "lastUpdateTime", column = "lastUpdateTime", jdbcType = JdbcType.DATE)
		})
	AppOrgGroup getGroupById(int grpId);
	
	@Update("UPDATE APP_ORG_Group SET "
			+ " PGRP_ID=#{pgrpId},"
			+ " GRP_Name=#{grpName},"
			+ " GRP_Type=#{grpType},"
			+ " GRP_Level=#{grpLevel},"
			+ " DEPT_ID=#{deptId},"
			+ " Leaf_Flag=#{leafFlag},"
			+ " isDelete=#{isDelete}, lastUpdateTime=#{lastUpdateTime} where GRP_ID=#{grpId}")
	void updateGroupAll(AppOrgGroup appOrgGroup);

	@Update(" UPDATE APP_ORG_Group SET isDelete='1' where GRP_ID=#{grpId} ")
	void deleteGroup(int grpId);
	
	
	@Update(" UPDATE app_org_group_user SET isDelete='1' where GRP_ID=#{grpId} and User_ID=#{userId} ")
	void deleteGroupUser(int grpId, String userId);
 
	
	@Select(" SELECT a.employee_id, a. NAME, a.rank, b.dept_id, b.dept_name "
			+ " FROM OA_Employees a, OA_DEFINITION_DEPT b WHERE a.dept_id = b.dept_id "
			+ " AND a.employee_id=#{userId} ")
	@Results({
		@Result(id = true, property = "employee_id", column = "employee_id", jdbcType = JdbcType.VARCHAR),
		@Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR),
		@Result(property = "rank", column = "rank", jdbcType = JdbcType.VARCHAR),
		@Result(property = "dept_id", column = "dept_id", jdbcType = JdbcType.INTEGER),
		@Result(property = "dept_name", column = "dept_name", jdbcType = JdbcType.VARCHAR)
	})
	EmployeesDeptVo getEmp2User(String userId);
	
	@Insert("INSERT INTO app_org_group_user(GRP_ID, User_ID, isDelete) "
			+ "VALUES(#{grpId}, #{userId}, #{isDelete}) ")
	@Options(useGeneratedKeys=true, keyProperty="recID")
	void insertAppOrgGroupUser(AppOrgGroupUser appOrgGroupUser);
	
}
