package com.patient.management.system.utility;

import java.time.LocalTime;

import com.patient.management.system.dto.CaseHistory;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Mapper {

	public static CaseHistory mapCaseHistory(CaseHistory caseHistory, CaseHistory byPatientId) {
		byPatientId.setFirstName(caseHistory.getFirstName());
		byPatientId.setLastName(caseHistory.getLastName());
		byPatientId.setCreationDate(caseHistory.getCreationDate());
		byPatientId.setAddress(caseHistory.getAddress());
		byPatientId.setBirthDate(caseHistory.getBirthDate());
		byPatientId.setComplaint(caseHistory.getComplaint());
		byPatientId.setPhone(caseHistory.getPhone());
		byPatientId.setMaritalStatus(caseHistory.getMaritalStatus());
		byPatientId.setOccupation(caseHistory.getOccupation());
		byPatientId.setCaseId(caseHistory.getCaseId());
		byPatientId.setRegistrationNo(caseHistory.getRegistrationNo());
		byPatientId.setReligion(caseHistory.getReligion());
		byPatientId.setSex(caseHistory.getSex());
		byPatientId.setUpdatedDate(LocalTime.now().toString());
		System.out.println("caseHistory: "+caseHistory.getFirstName());
		

		return byPatientId;
	}

	
}
