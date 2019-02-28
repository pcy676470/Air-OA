package com.oa.javaBean;

import java.io.Serializable;

public class AppOrgGroup implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;

	private int grpId;
	private int pgrpId;
	private String grpName;
	private String grpType;
	private int grpLevel;
	private String leafFlag;
	private String deptId;
	private String isDelete;
	private String lastUpdateTime;

	public AppOrgGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppOrgGroup(int grpId, int pgrpId, String grpName, String grpType, int grpLevel, String leafFlag,
			String deptId, String isDelete, String lastUpdateTime) {
		super();
		this.grpId = grpId;
		this.pgrpId = pgrpId;
		this.grpName = grpName;
		this.grpType = grpType;
		this.grpLevel = grpLevel;
		this.leafFlag = leafFlag;
		this.deptId = deptId;
		this.isDelete = isDelete;
		this.lastUpdateTime = lastUpdateTime;
	}

	public int getGrpId() {
		return grpId;
	}

	public void setGrpId(int grpId) {
		this.grpId = grpId;
	}

	public int getPgrpId() {
		return pgrpId;
	}

	public void setPgrpId(int pgrpId) {
		this.pgrpId = pgrpId;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getGrpType() {
		return grpType;
	}

	public void setGrpType(String grpType) {
		this.grpType = grpType;
	}

	public int getGrpLevel() {
		return grpLevel;
	}

	public void setGrpLevel(int grpLevel) {
		this.grpLevel = grpLevel;
	}

	public String getLeafFlag() {
		return leafFlag;
	}

	public void setLeafFlag(String leafFlag) {
		this.leafFlag = leafFlag;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
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
		return "AppOrgGroup [grpId=" + grpId + ", pgrpId=" + pgrpId + ", grpName=" + grpName + ", grpType=" + grpType
				+ ", grpLevel=" + grpLevel + ", leafFlag=" + leafFlag + ", deptId=" + deptId + ", isDelete=" + isDelete
				+ ", lastUpdateTime=" + lastUpdateTime + "]";
	}

}
