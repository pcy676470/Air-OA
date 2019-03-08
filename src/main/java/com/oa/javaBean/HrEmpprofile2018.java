package com.oa.javaBean;

import java.io.Serializable;
import java.util.Date;

public class HrEmpprofile2018 implements Serializable{

	/** */
	private static final long serialVersionUID = 1L;
	
	private String empid ;
	private String personName ;//200
	private String gender ;//10
	private Date birthdate ;//10
	private String nationality ;//50
	private String nation ;//50
	private String birthPlace ;//200
	private String nativePlace ;//50
	private String residence ;//50
	private String typeOfResidence ;//50
	private String politicalStand ;//50
	private String educationlevel ;//50
	private String educationDegree ;//50
	private String marrigeStatus ;//50
	private String orgUnitID ;//50
	private String position ;//50
	private String postCode ;//50
	private String qualifyTitle ;//50
	private String rankCode ;//50
	private String appointRank ;//50
	private String occupation ;//50
	private Date dateofWork ;//'0000-00-00 00:00:00'
	private Date dateofHire ;//'0000-00-00 00:00:00'
	private String statusType ;//50
	private String personType ;//50
	private String activeStatus ;//50
	private String mobile ;//50
	private String oEmailAddress ;//50
	private String oTelephone ;//50
	private Date lastUpdatedTime ;//'0000-00-00 00:00:00',
	private String identityNum ;//50
	private String idType ;//50
	
	
	public HrEmpprofile2018() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HrEmpprofile2018(String empid, String personName, String gender, Date birthdate, String nationality,
			String nation, String birthPlace, String nativePlace, String residence, String typeOfResidence,
			String politicalStand, String educationlevel, String educationDegree, String marrigeStatus,
			String orgUnitID, String position, String postCode, String qualifyTitle, String rankCode,
			String appointRank, String occupation, Date dateofWork, Date dateofHire, String statusType,
			String personType, String activeStatus, String mobile, String oEmailAddress, String oTelephone,
			Date lastUpdatedTime, String identityNum, String idType) {
		super();
		this.empid = empid;
		this.personName = personName;
		this.gender = gender;
		this.birthdate = birthdate;
		this.nationality = nationality;
		this.nation = nation;
		this.birthPlace = birthPlace;
		this.nativePlace = nativePlace;
		this.residence = residence;
		this.typeOfResidence = typeOfResidence;
		this.politicalStand = politicalStand;
		this.educationlevel = educationlevel;
		this.educationDegree = educationDegree;
		this.marrigeStatus = marrigeStatus;
		this.orgUnitID = orgUnitID;
		this.position = position;
		this.postCode = postCode;
		this.qualifyTitle = qualifyTitle;
		this.rankCode = rankCode;
		this.appointRank = appointRank;
		this.occupation = occupation;
		this.dateofWork = dateofWork;
		this.dateofHire = dateofHire;
		this.statusType = statusType;
		this.personType = personType;
		this.activeStatus = activeStatus;
		this.mobile = mobile;
		this.oEmailAddress = oEmailAddress;
		this.oTelephone = oTelephone;
		this.lastUpdatedTime = lastUpdatedTime;
		this.identityNum = identityNum;
		this.idType = idType;
	}


	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getBirthPlace() {
		return birthPlace;
	}


	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	public String getNativePlace() {
		return nativePlace;
	}


	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}


	public String getResidence() {
		return residence;
	}


	public void setResidence(String residence) {
		this.residence = residence;
	}


	public String getTypeOfResidence() {
		return typeOfResidence;
	}


	public void setTypeOfResidence(String typeOfResidence) {
		this.typeOfResidence = typeOfResidence;
	}


	public String getPoliticalStand() {
		return politicalStand;
	}


	public void setPoliticalStand(String politicalStand) {
		this.politicalStand = politicalStand;
	}


	public String getEducationlevel() {
		return educationlevel;
	}


	public void setEducationlevel(String educationlevel) {
		this.educationlevel = educationlevel;
	}


	public String getEducationDegree() {
		return educationDegree;
	}


	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}


	public String getMarrigeStatus() {
		return marrigeStatus;
	}


	public void setMarrigeStatus(String marrigeStatus) {
		this.marrigeStatus = marrigeStatus;
	}


	public String getOrgUnitID() {
		return orgUnitID;
	}


	public void setOrgUnitID(String orgUnitID) {
		this.orgUnitID = orgUnitID;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getPostCode() {
		return postCode;
	}


	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	public String getQualifyTitle() {
		return qualifyTitle;
	}


	public void setQualifyTitle(String qualifyTitle) {
		this.qualifyTitle = qualifyTitle;
	}


	public String getRankCode() {
		return rankCode;
	}


	public void setRankCode(String rankCode) {
		this.rankCode = rankCode;
	}


	public String getAppointRank() {
		return appointRank;
	}


	public void setAppointRank(String appointRank) {
		this.appointRank = appointRank;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public Date getDateofWork() {
		return dateofWork;
	}


	public void setDateofWork(Date dateofWork) {
		this.dateofWork = dateofWork;
	}


	public Date getDateofHire() {
		return dateofHire;
	}


	public void setDateofHire(Date dateofHire) {
		this.dateofHire = dateofHire;
	}


	public String getStatusType() {
		return statusType;
	}


	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}


	public String getPersonType() {
		return personType;
	}


	public void setPersonType(String personType) {
		this.personType = personType;
	}


	public String getActiveStatus() {
		return activeStatus;
	}


	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getoEmailAddress() {
		return oEmailAddress;
	}


	public void setoEmailAddress(String oEmailAddress) {
		this.oEmailAddress = oEmailAddress;
	}


	public String getoTelephone() {
		return oTelephone;
	}


	public void setoTelephone(String oTelephone) {
		this.oTelephone = oTelephone;
	}


	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}


	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}


	public String getIdentityNum() {
		return identityNum;
	}


	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}


	@Override
	public String toString() {
		return "HrEmpprofile2018 [empid=" + empid + ", personName=" + personName + ", gender=" + gender + ", birthdate="
				+ birthdate + ", nationality=" + nationality + ", nation=" + nation + ", birthPlace=" + birthPlace
				+ ", nativePlace=" + nativePlace + ", residence=" + residence + ", typeOfResidence=" + typeOfResidence
				+ ", politicalStand=" + politicalStand + ", educationlevel=" + educationlevel + ", educationDegree="
				+ educationDegree + ", marrigeStatus=" + marrigeStatus + ", orgUnitID=" + orgUnitID + ", position="
				+ position + ", postCode=" + postCode + ", qualifyTitle=" + qualifyTitle + ", rankCode=" + rankCode
				+ ", appointRank=" + appointRank + ", occupation=" + occupation + ", dateofWork=" + dateofWork
				+ ", dateofHire=" + dateofHire + ", statusType=" + statusType + ", personType=" + personType
				+ ", activeStatus=" + activeStatus + ", mobile=" + mobile + ", oEmailAddress=" + oEmailAddress
				+ ", oTelephone=" + oTelephone + ", lastUpdatedTime=" + lastUpdatedTime + ", identityNum=" + identityNum
				+ ", idType=" + idType + "]";
	}
  
	
}
