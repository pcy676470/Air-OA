package com.oa.entityVo;

/**
 * 
 * @Description 类描述: 员工信息
 * @author liang
 * @date 时间: 2019年3月4日 上午10:16:56
 */
public class OrgGroupUserVo {

	private int grpId;
	private int pgrpId;
	private int grpLevel;

	private String grpName;
	private String grpType;
	private String leafFlag;
	private String deptId;
	private String userId;// 用户ID(负责人关联ID)
	private String userName;// 用户名字
	private String userName2Id;// 姓名(员工号)

	public OrgGroupUserVo() {
		super();
	}

	public OrgGroupUserVo(int grpId, int pgrpId, int grpLevel, String grpName, String grpType, String leafFlag,
			String deptId, String userId, String userName) {
		super();
		this.grpId = grpId;
		this.pgrpId = pgrpId;
		this.grpLevel = grpLevel;
		this.grpName = grpName;
		this.grpType = grpType;
		this.leafFlag = leafFlag;
		this.deptId = deptId;
		this.userId = userId;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if (this.userId!=null) {
			this.userName2Id = userName+"("+this.userId+")"; //姓名(员工号)
		}
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
		if (this.userName!=null) {
			this.userName2Id = this.userName+"("+userId+")"; //姓名(员工号)
		}
	}
	
	public String getUserName2Id() {
		return userName2Id;
	}

	public void setUserName2Id(String userName2Id) {
		this.userName2Id = userName2Id;
	}

	@Override
	public String toString() {
		return "OrgGroupUserVo [grpId=" + grpId + ", pgrpId=" + pgrpId + ", grpLevel=" + grpLevel + ", grpName="
				+ grpName + ", grpType=" + grpType + ", leafFlag=" + leafFlag + ", deptId=" + deptId + ", userId="
				+ userId + ", userName=" + userName + "]";
	}

}
