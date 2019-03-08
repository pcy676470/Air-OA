package com.oa.javaBean;

import java.io.Serializable;

public class AppAuthRoleDefine implements Serializable{

	/** */
	private static final long serialVersionUID = 1L;
 
	private int roleId;
	private String roleName;
	private String roleDes;
	private String AppId;
	public AppAuthRoleDefine(int roleId, String roleName, String roleDes, String appId) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDes = roleDes;
		AppId = appId;
	}
	public AppAuthRoleDefine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDes() {
		return roleDes;
	}
	public void setRoleDes(String roleDes) {
		this.roleDes = roleDes;
	}
	public String getAppId() {
		return AppId;
	}
	public void setAppId(String appId) {
		AppId = appId;
	}
	@Override
	public String toString() {
		return "AppAuthRoleDefine [roleId=" + roleId + ", roleName=" + roleName + ", roleDes=" + roleDes + ", AppId="
				+ AppId + "]";
	}
	
	
	
}
