package com.oa.javaBean;

import java.io.Serializable;

public class AppAuthUserRole implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private int roleId;
	private String deptId;
	private int isShow;
	public AppAuthUserRole(String userId, int roleId, String deptId, int isShow) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.deptId = deptId;
		this.isShow = isShow;
	}
	public AppAuthUserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	@Override
	public String toString() {
		return "AppAuthUserRole [userId=" + userId + ", roleId=" + roleId + ", deptId=" + deptId + ", isShow=" + isShow
				+ "]";
	}
 
	
}
