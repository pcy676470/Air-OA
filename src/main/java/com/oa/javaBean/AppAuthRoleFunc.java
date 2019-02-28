package com.oa.javaBean;

import java.io.Serializable;

public class AppAuthRoleFunc implements Serializable{

	/** */
	private static final long serialVersionUID = 1L;
 
	private int roleId;
	private int funcId;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getFuncId() {
		return funcId;
	}
	public void setFuncId(int funcId) {
		this.funcId = funcId;
	}
	public AppAuthRoleFunc(int roleId, int funcId) {
		super();
		this.roleId = roleId;
		this.funcId = funcId;
	}
	public AppAuthRoleFunc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AppAuthRoleFunc [roleId=" + roleId + ", funcId=" + funcId + "]";
	}
	
	
	
}
