package com.patient.management.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.management.system.dto.CaseHistory;
import com.patient.management.system.repository.CaseHistoryRepository;
import com.patient.management.system.utility.Mapper;

@Service
public class CaseHistoryServiceImpl implements CaseHistoryService{

	@Autowired
	CaseHistoryRepository caseHistoryRepository;
	
	public CaseHistory savePatientData(CaseHistory caseHistory) {
		return caseHistoryRepository.save(caseHistory);
		
	}

	@Override
	public List<CaseHistory> getAllPatients() {
		List<CaseHistory> getAllPatients = caseHistoryRepository.findAll();
		return getAllPatients;
	}

	@Override
	public void delete(int patientid) {
		 caseHistoryRepository.deleteById(patientid);
		
	}

	@Override
	public CaseHistory getPatientById(int patientid) {
		return caseHistoryRepository.findById(patientid).get();
	}

	@Override
	public CaseHistory updatePatientData(CaseHistory caseHistory, int caseId) {
		CaseHistory byPatientId = caseHistoryRepository.findByCaseId(caseId);
		
		CaseHistory patchData = Mapper.mapCaseHistory(caseHistory,byPatientId);
		return caseHistoryRepository.save(patchData);
	}

}
