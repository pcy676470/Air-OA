package com.oa.dao;

/**
 * @Description 类描述:动态拼接sql类
 * @author liang
 * @date 时间: 2019年2月28日 下午2:46:15
 */
public class TrendsParamSql {
	
	 /**
	  * 
	  * @param CPM_userId
	  * @param CPM_name
	  * @return
	  * @Description 方法描述:   @SelectProvider(type = TrendsParamSql.class, method = "getCPMGroupUser") 
	  * @author liang
	  * @date 时间: 2019年3月4日 上午10:05:08
	  */
	public String getCPMGroupUser(String CPM_userId, String CPM_name){
		
		 String sql = " SELECT e.employee_id, e.name, o.GRP_ID, o.GRP_Name, o.GRP_Level "
		 		+ " FROM oa_employees e "
		 		+ " LEFT OUTER JOIN app_org_group_user ou "
		 		+ " ON  ou.User_ID=e.employee_id "
		 		+ " LEFT OUTER JOIN app_org_group o "
		 		+ " ON  ou.GRP_ID = o.GRP_ID "
		 		+ " WHERE ou.isDelete='0' ";  
		 
		 if(CPM_userId!=null&& CPM_userId.length()>0){  
			 sql = sql +" AND e.employee_id=#{CPM_userId} ";
         }  
		 
		 if(CPM_name!=null&& CPM_name!=""&& CPM_name.length()>0){ 
			 sql = sql +"  AND e.name LIKE CONCAT('%',#{CPM_name},'%') ";
		 } 
		 sql = sql +" AND o.isDelete='0' ";
		 
         return sql;
	}
	
	
	
}
