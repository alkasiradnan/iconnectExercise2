package com.iconnect.exercise2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Analyst {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;

private String roleUser;
private Long authorSequenceNumber;
private Long phoneNumber;
private String email;
private String dn;
private String jobTitle;
private String active;
private String fullName;
private String userName;
private String firstName;
private String lastName;
private String signature;
private String commonGroups;

@ManyToOne(cascade = {CascadeType.ALL})
private OrgStructure orgStructure;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getRoleUser() {
	return roleUser;
}

public void setRoleUser(String roleUser) {
	this.roleUser = roleUser;
}

public Long getAuthorSequenceNumber() {
	return authorSequenceNumber;
}

public void setAuthorSequenceNumber(Long authorSequenceNumber) {
	this.authorSequenceNumber = authorSequenceNumber;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDn() {
	return dn;
}

public void setDn(String dn) {
	this.dn = dn;
}

public String getJobTitle() {
	return jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public String getActive() {
	return active;
}

public void setActive(String active) {
	this.active = active;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSignature() {
	return signature;
}

public void setSignature(String signature) {
	this.signature = signature;
}

public String getCommonGroups() {
	return commonGroups;
}

public void setCommonGroups(String commonGroups) {
	this.commonGroups = commonGroups;
}

public OrgStructure getOrgStructure() {
	return orgStructure;
}

public void setOrgStructure(OrgStructure orgStructure) {
	this.orgStructure = orgStructure;
}

public Long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}




}
 
