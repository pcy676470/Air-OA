package com.oa.javaBean;

import java.io.Serializable;

public class AppOrgGroupUser implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;

	private int recID;
	private int grpId;
	private String userId;
	private String isDelete;
	private String lastUpdateTime;

	public AppOrgGroupUser(int recID, int grpId, String userId, String isDelete, String lastUpdateTime) {
		super();
		this.recID = recID;
		this.grpId = grpId;
		this.userId = userId;
		this.isDelete = isDelete;
		this.lastUpdateTime = lastUpdateTime;
	}

	public AppOrgGroupUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRecID() {
		return recID;
	}

	public void setRecID(int recID) {
		this.recID = recID;
	}

	public int getGrpId() {
		return grpId;
	}

	public void setGrpId(int grpId) {
		this.grpId = grpId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
	public String toString() {
		return "AppAuthFuncDefine4 [recID=" + recID + ", grpId=" + grpId + ", userId=" + userId + ", isDelete="
				+ isDelete + ", lastUpdateTime=" + lastUpdateTime + "]";
	}

}
