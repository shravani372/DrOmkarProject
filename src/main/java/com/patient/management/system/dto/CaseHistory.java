package com.patient.management.system.dto;

import java.util.Map;

import org.hibernate.annotations.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class CaseHistory {

	@Id
	@Column
	private int patientId;
	@Column
	private String name;
	@Column
	private String date;
	@Column
	private String regNo;
	@Column
	private String address;
	@Column
	private String age;
	@Column
	private String sex;
	@Column
	private String occupation;
	@Column
	private String religion;
	@Column
	private String married;
	@Column
	private String contactNo;
	@Column
	private String complaint;
	@Column
	private String updatedDate;
	
//	@Column(name="patient_info")
//	@Type(type = "PatientInfo", value = null)
//	private Map<String,String> patientInfo;

	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
//	public Map<String, String> getPatientInfo() {
//		return patientInfo;
//	}
//	public void setPatientInfo(Map<String, String> patientInfo) {
//		this.patientInfo = patientInfo;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	
}
