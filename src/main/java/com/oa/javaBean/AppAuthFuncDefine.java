package com.oa.javaBean;

import java.io.Serializable;


public class AppAuthFuncDefine implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;
	
	private int funcId;
	private String funcName;// 50
	private String funcDes;// 200
	private String fromAppId;// 200

	public AppAuthFuncDefine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppAuthFuncDefine(int funcId, String funcName, String funcDes, String fromAppId) {
		super();
		this.funcId = funcId;
		this.funcName = funcName;
		this.funcDes = funcDes;
		this.fromAppId = fromAppId;
	}

	public int getFuncId() {
		return funcId;
	}

	public void setFuncId(int funcId) {
		this.funcId = funcId;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getFuncDes() {
		return funcDes;
	}

	public void setFuncDes(String funcDes) {
		this.funcDes = funcDes;
	}

	public String getFromAppId() {
		return fromAppId;
	}

	public void setFromAppId(String fromAppId) {
		this.fromAppId = fromAppId;
	}

	@Override
	public String toString() {
		return "HrEmpprofile2019 [funcId=" + funcId + ", funcName=" + funcName + ", funcDes=" + funcDes + ", fromAppId="
				+ fromAppId + "]";
	}

}
