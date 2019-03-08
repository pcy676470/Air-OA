package com.oa.javaBean;

import java.io.Serializable;
import java.util.Date;

public class OaDefinitionDept implements Serializable {

	/** */
	private static final long serialVersionUID = 1L;

	private String deptId;
	private String deptName;
	private String deptShortName;
	private String deptTYPE;
	private String virtualDept;
	private String activityFlag;
	private String visible;
	private String deptPrefix;
	private String deptLevel;
	private String oldDeptSequenceId;
	private String oldDeptId;
	private Date updateTime;
	private String deptGrade;
	private String deptNameForSign;
	private String deptNameForSignAttr;
	private String deptAttributePreFix;
	private String deptAttributeRole;
	private int deptAttributeSort;
	private String deptAttributeFirstLayer;
	private String deptAttributeHideForDoc;
	private String deptAttributeIsSecondLevel;
	private String deptAttributeSecondLevelDeptId;
	private String deptAttributeStandardNameForDocument;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptShortName() {
		return deptShortName;
	}

	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName;
	}

	public String getDeptTYPE() {
		return deptTYPE;
	}

	public void setDeptTYPE(String deptTYPE) {
		this.deptTYPE = deptTYPE;
	}

	public String getVirtualDept() {
		return virtualDept;
	}

	public void setVirtualDept(String virtualDept) {
		this.virtualDept = virtualDept;
	}

	public String getActivityFlag() {
		return activityFlag;
	}

	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getDeptPrefix() {
		return deptPrefix;
	}

	public void setDeptPrefix(String deptPrefix) {
		this.deptPrefix = deptPrefix;
	}

	public String getDeptLevel() {
		return deptLevel;
	}

	public void setDeptLevel(String deptLevel) {
		this.deptLevel = deptLevel;
	}

	public String getOldDeptSequenceId() {
		return oldDeptSequenceId;
	}

	public void setOldDeptSequenceId(String oldDeptSequenceId) {
		this.oldDeptSequenceId = oldDeptSequenceId;
	}

	public String getOldDeptId() {
		return oldDeptId;
	}

	public void setOldDeptId(String oldDeptId) {
		this.oldDeptId = oldDeptId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeptGrade() {
		return deptGrade;
	}

	public void setDeptGrade(String deptGrade) {
		this.deptGrade = deptGrade;
	}

	public String getDeptNameForSign() {
		return deptNameForSign;
	}

	public void setDeptNameForSign(String deptNameForSign) {
		this.deptNameForSign = deptNameForSign;
	}

	public String getDeptNameForSignAttr() {
		return deptNameForSignAttr;
	}

	public void setDeptNameForSignAttr(String deptNameForSignAttr) {
		this.deptNameForSignAttr = deptNameForSignAttr;
	}

	public String getDeptAttributePreFix() {
		return deptAttributePreFix;
	}

	public void setDeptAttributePreFix(String deptAttributePreFix) {
		this.deptAttributePreFix = deptAttributePreFix;
	}

	public String getDeptAttributeRole() {
		return deptAttributeRole;
	}

	public void setDeptAttributeRole(String deptAttributeRole) {
		this.deptAttributeRole = deptAttributeRole;
	}

	public int getDeptAttributeSort() {
		return deptAttributeSort;
	}

	public void setDeptAttributeSort(int deptAttributeSort) {
		this.deptAttributeSort = deptAttributeSort;
	}

	public String getDeptAttributeFirstLayer() {
		return deptAttributeFirstLayer;
	}

	public void setDeptAttributeFirstLayer(String deptAttributeFirstLayer) {
		this.deptAttributeFirstLayer = deptAttributeFirstLayer;
	}

	public String getDeptAttributeHideForDoc() {
		return deptAttributeHideForDoc;
	}

	public void setDeptAttributeHideForDoc(String deptAttributeHideForDoc) {
		this.deptAttributeHideForDoc = deptAttributeHideForDoc;
	}

	public String getDeptAttributeIsSecondLevel() {
		return deptAttributeIsSecondLevel;
	}

	public void setDeptAttributeIsSecondLevel(String deptAttributeIsSecondLevel) {
		this.deptAttributeIsSecondLevel = deptAttributeIsSecondLevel;
	}

	public String getDeptAttributeSecondLevelDeptId() {
		return deptAttributeSecondLevelDeptId;
	}

	public void setDeptAttributeSecondLevelDeptId(String deptAttributeSecondLevelDeptId) {
		this.deptAttributeSecondLevelDeptId = deptAttributeSecondLevelDeptId;
	}

	public String getDeptAttributeStandardNameForDocument() {
		return deptAttributeStandardNameForDocument;
	}

	public void setDeptAttributeStandardNameForDocument(String deptAttributeStandardNameForDocument) {
		this.deptAttributeStandardNameForDocument = deptAttributeStandardNameForDocument;
	}

	public OaDefinitionDept(String deptId, String deptName, String deptShortName, String deptTYPE, String virtualDept,
			String activityFlag, String visible, String deptPrefix, String deptLevel, String oldDeptSequenceId,
			String oldDeptId, Date updateTime, String deptGrade, String deptNameForSign, String deptNameForSignAttr,
			String deptAttributePreFix, String deptAttributeRole, int deptAttributeSort, String deptAttributeFirstLayer,
			String deptAttributeHideForDoc, String deptAttributeIsSecondLevel, String deptAttributeSecondLevelDeptId,
			String deptAttributeStandardNameForDocument) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptShortName = deptShortName;
		this.deptTYPE = deptTYPE;
		this.virtualDept = virtualDept;
		this.activityFlag = activityFlag;
		this.visible = visible;
		this.deptPrefix = deptPrefix;
		this.deptLevel = deptLevel;
		this.oldDeptSequenceId = oldDeptSequenceId;
		this.oldDeptId = oldDeptId;
		this.updateTime = updateTime;
		this.deptGrade = deptGrade;
		this.deptNameForSign = deptNameForSign;
		this.deptNameForSignAttr = deptNameForSignAttr;
		this.deptAttributePreFix = deptAttributePreFix;
		this.deptAttributeRole = deptAttributeRole;
		this.deptAttributeSort = deptAttributeSort;
		this.deptAttributeFirstLayer = deptAttributeFirstLayer;
		this.deptAttributeHideForDoc = deptAttributeHideForDoc;
		this.deptAttributeIsSecondLevel = deptAttributeIsSecondLevel;
		this.deptAttributeSecondLevelDeptId = deptAttributeSecondLevelDeptId;
		this.deptAttributeStandardNameForDocument = deptAttributeStandardNameForDocument;
	}

	public OaDefinitionDept() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OaDefinitionDept [deptId=" + deptId + ", deptName=" + deptName + ", deptShortName=" + deptShortName
				+ ", deptTYPE=" + deptTYPE + ", virtualDept=" + virtualDept + ", activityFlag=" + activityFlag
				+ ", visible=" + visible + ", deptPrefix=" + deptPrefix + ", deptLevel=" + deptLevel
				+ ", oldDeptSequenceId=" + oldDeptSequenceId + ", oldDeptId=" + oldDeptId + ", updateTime=" + updateTime
				+ ", deptGrade=" + deptGrade + ", deptNameForSign=" + deptNameForSign + ", deptNameForSignAttr="
				+ deptNameForSignAttr + ", deptAttributePreFix=" + deptAttributePreFix + ", deptAttributeRole="
				+ deptAttributeRole + ", deptAttributeSort=" + deptAttributeSort + ", deptAttributeFirstLayer="
				+ deptAttributeFirstLayer + ", deptAttributeHideForDoc=" + deptAttributeHideForDoc
				+ ", deptAttributeIsSecondLevel=" + deptAttributeIsSecondLevel + ", deptAttributeSecondLevelDeptId="
				+ deptAttributeSecondLevelDeptId + ", deptAttributeStandardNameForDocument="
				+ deptAttributeStandardNameForDocument + "]";
	}

}
