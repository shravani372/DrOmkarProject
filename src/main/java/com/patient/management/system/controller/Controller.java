package com.patient.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.management.system.dto.CaseHistory;
import com.patient.management.system.service.CaseHistoryService;

@RestController
public class Controller {

	@Autowired
	CaseHistoryService caseHistoryService;
	
	@GetMapping("/patient")
	private List<CaseHistory> getAllPatients() {
		return caseHistoryService.getAllPatients();
	}
	
	@GetMapping("/patient/{patientid}")
	private CaseHistory getPatientById(@PathVariable("patientid") int patientid) {
		return caseHistoryService.getPatientById(patientid);
	}

	@PostMapping("/patient")
	private ResponseEntity<CaseHistory> savePatientData(@RequestBody CaseHistory caseHistory) {
		return  ResponseEntity.status(HttpStatus.CREATED).body(caseHistoryService.savePatientData(caseHistory));
		
	}
	
	@PatchMapping("/patient/{patientid}")
	private ResponseEntity<CaseHistory> updatePatientData(@PathVariable("patientid") int patientid,
			@RequestBody CaseHistory caseHistory) {
		caseHistoryService.updatePatientData(caseHistory,patientid);
		return  ResponseEntity.status(HttpStatus.OK).build();
		
	}

		@DeleteMapping("/patient/{patientid}")
	private void deleteBook(@PathVariable("patientid") int patientid) {
		caseHistoryService.delete(patientid);
	}

}
