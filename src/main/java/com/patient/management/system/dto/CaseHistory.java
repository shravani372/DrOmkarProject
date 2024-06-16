package com.patient.management.system.dto;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table
@Data
public class CaseHistory {

	@Id
	@GeneratedValue(generator = "sequence-generator")
	@GenericGenerator(name = "sequence-generator", parameters = {
			@Parameter(name = "sequence_name", value = "case_sequence"),
			@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1") })
	@Column
	private long caseId;
	
	@Column
	private String firstName;
	
	@Column
	private String middleName;
	
	@Column
	private String lastName;
	
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T00:00:00Z'")
	private LocalDate creationDate;
	
	@Column
	private String registrationNo;
	
	@Column
	private String address;
	
	@Column
	private LocalDate birthDate;
	
	@Column
	private String sex;
	
	@Column
	private String occupation;
	
	@Column
	private String religion;
	
	@Column
	private String maritalStatus;
	
	@Column
	private String phone;
	
	@Column
	private String complaint;
	
	@Column
	private String updatedDate;
	
	@Transient
	private String age;

	public String getAge() {
				
		if (Period.between(birthDate, LocalDate.now()).getYears() == 0) {
			return String.valueOf(Period.between(birthDate, LocalDate.now()).getDays() + " days");
		}
		
		return String.valueOf(Period.between(birthDate, LocalDate.now()).getYears() + " years");
	}

	public void setAge(String age) {
		this.age = age;
	}

	public long getCaseId() {
		return caseId;
	}

	public void setCaseId(long patientId) {
		this.caseId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

//	@Column(name="patient_info")
//	@Type(type = "PatientInfo", value = null)
//	private Map<String,String> patientInfo;

//	public Map<String, String> getPatientInfo() {
//		return patientInfo;
//	}
//	public void setPatientInfo(Map<String, String> patientInfo) {
//		this.patientInfo = patientInfo;
//	}
}
