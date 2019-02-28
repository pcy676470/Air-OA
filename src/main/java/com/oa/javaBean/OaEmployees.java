package com.oa.javaBean;

import java.io.Serializable;
import java.util.Date;

public class OaEmployees implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;
	private String employeeId;
	private String deptId;
	private String name;
	private String sex;
	private String rank;
	private String phone;
	private String mobilephone;
	private String signPict;
	private String activityFlag;
	private String email;
	private String password;
	private String externalAccess;
	private String oldSign;
	private int oldDeptSequenceID;
	private String mphoneAccess;
	private int canTicketSMS;
	private String isLeader;
	private String isLevelTwoManagerMasterOrUpper;
	private Date updateTime;
	private String nameForTicket;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getSignPict() {
		return signPict;
	}

	public void setSignPict(String signPict) {
		this.signPict = signPict;
	}

	public String getActivityFlag() {
		return activityFlag;
	}

	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExternalAccess() {
		return externalAccess;
	}

	public void setExternalAccess(String externalAccess) {
		this.externalAccess = externalAccess;
	}

	public String getOldSign() {
		return oldSign;
	}

	public void setOldSign(String oldSign) {
		this.oldSign = oldSign;
	}

	public int getOldDeptSequenceID() {
		return oldDeptSequenceID;
	}

	public void setOldDeptSequenceID(int oldDeptSequenceID) {
		this.oldDeptSequenceID = oldDeptSequenceID;
	}

	public String getMphoneAccess() {
		return mphoneAccess;
	}

	public void setMphoneAccess(String mphoneAccess) {
		this.mphoneAccess = mphoneAccess;
	}

	public int getCanTicketSMS() {
		return canTicketSMS;
	}

	public void setCanTicketSMS(int canTicketSMS) {
		this.canTicketSMS = canTicketSMS;
	}

	public String getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(String isLeader) {
		this.isLeader = isLeader;
	}

	public String getIsLevelTwoManagerMasterOrUpper() {
		return isLevelTwoManagerMasterOrUpper;
	}

	public void setIsLevelTwoManagerMasterOrUpper(String isLevelTwoManagerMasterOrUpper) {
		this.isLevelTwoManagerMasterOrUpper = isLevelTwoManagerMasterOrUpper;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getNameForTicket() {
		return nameForTicket;
	}

	public void setNameForTicket(String nameForTicket) {
		this.nameForTicket = nameForTicket;
	}

	public OaEmployees(String employeeId, String deptId, String name, String sex, String rank, String phone,
			String mobilephone, String signPict, String activityFlag, String email, String password,
			String externalAccess, String oldSign, int oldDeptSequenceID, String mphoneAccess, int canTicketSMS,
			String isLeader, String isLevelTwoManagerMasterOrUpper, Date updateTime, String nameForTicket) {
		super();
		this.employeeId = employeeId;
		this.deptId = deptId;
		this.name = name;
		this.sex = sex;
		this.rank = rank;
		this.phone = phone;
		this.mobilephone = mobilephone;
		this.signPict = signPict;
		this.activityFlag = activityFlag;
		this.email = email;
		this.password = password;
		this.externalAccess = externalAccess;
		this.oldSign = oldSign;
		this.oldDeptSequenceID = oldDeptSequenceID;
		this.mphoneAccess = mphoneAccess;
		this.canTicketSMS = canTicketSMS;
		this.isLeader = isLeader;
		this.isLevelTwoManagerMasterOrUpper = isLevelTwoManagerMasterOrUpper;
		this.updateTime = updateTime;
		this.nameForTicket = nameForTicket;
	}

	public OaEmployees() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OaEmployees [employeeId=" + employeeId + ", deptId=" + deptId + ", name=" + name + ", sex=" + sex
				+ ", rank=" + rank + ", phone=" + phone + ", mobilephone=" + mobilephone + ", signPict=" + signPict
				+ ", activityFlag=" + activityFlag + ", email=" + email + ", password=" + password + ", externalAccess="
				+ externalAccess + ", oldSign=" + oldSign + ", oldDeptSequenceID=" + oldDeptSequenceID
				+ ", mphoneAccess=" + mphoneAccess + ", canTicketSMS=" + canTicketSMS + ", isLeader=" + isLeader
				+ ", isLevelTwoManagerMasterOrUpper=" + isLevelTwoManagerMasterOrUpper + ", updateTime=" + updateTime
				+ ", nameForTicket=" + nameForTicket + "]";
	}

}
