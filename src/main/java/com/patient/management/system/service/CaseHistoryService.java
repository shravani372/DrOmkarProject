package com.patient.management.system.service;

import java.util.List;

import com.patient.management.system.dto.CaseHistory;

public interface CaseHistoryService {

	
	

	public CaseHistory savePatientData(CaseHistory caseHistory);

	public List<CaseHistory> getAllPatients();

	public void delete(int patientid);

	public CaseHistory getPatientById(int patientid);

	public CaseHistory updatePatientData(CaseHistory caseHistory, int patientid);

}
