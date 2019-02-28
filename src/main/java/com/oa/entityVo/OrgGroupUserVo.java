package com.oa.entityVo;

public class OrgGroupUserVo {

	private int grpId;
	private int pgrpId;
	private int grpLevel;
	
	private String grpName;
	private String grpType;
	private String leafFlag;
	private String deptId;
	private String userId;// 用户ID(负责人关联ID)

	public OrgGroupUserVo() {
		super();
	}



	public OrgGroupUserVo(int grpId, int pgrpId, int grpLevel, String grpName, String grpType, String leafFlag,
			String deptId, String userId) {
		super();
		this.grpId = grpId;
		this.pgrpId = pgrpId;
		this.grpLevel = grpLevel;
		this.grpName = grpName;
		this.grpType = grpType;
		this.leafFlag = leafFlag;
		this.deptId = deptId;
		this.userId = userId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "OrgGroupUserVo [grpId=" + grpId + ", pgrpId=" + pgrpId + ", grpName=" + grpName + ", grpType=" + grpType
				+ ", grpLevel=" + grpLevel + ", leafFlag=" + leafFlag + ", deptId=" + deptId + ", userId=" + userId
				+ "]";
	}
 

}
