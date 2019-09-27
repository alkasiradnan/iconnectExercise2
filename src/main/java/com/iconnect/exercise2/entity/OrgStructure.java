package com.iconnect.exercise2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrgStructure {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long orgStructureId;
private String divisionCode;
private String divisionName;
private String sectionCode;
private String sectionName;
public Long getOrgStructureId() {
	return orgStructureId;
}
public void setOrgStructureId(Long orgStructureId) {
	this.orgStructureId = orgStructureId;
}
public String getDivisionCode() {
	return divisionCode;
}
public void setDivisionCode(String divisionCode) {
	this.divisionCode = divisionCode;
}
public String getDivisionName() {
	return divisionName;
}
public void setDivisionName(String divisionName) {
	this.divisionName = divisionName;
}
public String getSectionCode() {
	return sectionCode;
}
public void setSectionCode(String sectionCode) {
	this.sectionCode = sectionCode;
}
public String getSectionName() {
	return sectionName;
}
public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}
	

}
 