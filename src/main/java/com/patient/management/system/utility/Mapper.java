package com.patient.management.system.utility;

import java.time.LocalTime;

import com.patient.management.system.dto.CaseHistory;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Mapper {

	public static CaseHistory mapCaseHistory(CaseHistory caseHistory, CaseHistory byPatientId) {
		byPatientId.setName(caseHistory.getName());
		byPatientId.setDate(caseHistory.getDate());
		byPatientId.setAddress(caseHistory.getAddress());
		byPatientId.setAge(caseHistory.getAge());
		byPatientId.setComplaint(caseHistory.getComplaint());
		byPatientId.setContactNo(caseHistory.getContactNo());
		byPatientId.setMarried(caseHistory.getMarried());
		byPatientId.setOccupation(caseHistory.getOccupation());
		byPatientId.setPatientId(caseHistory.getPatientId());
		byPatientId.setRegNo(caseHistory.getRegNo());
		byPatientId.setReligion(caseHistory.getReligion());
		byPatientId.setSex(caseHistory.getSex());
		byPatientId.setUpdatedDate(LocalTime.now().toString());
		System.out.println("caseHistory: "+caseHistory.getName());
		

		return byPatientId;
	}

	
}
