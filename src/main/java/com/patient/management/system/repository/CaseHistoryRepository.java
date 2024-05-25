package com.patient.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.patient.management.system.dto.CaseHistory;

@Repository
public interface CaseHistoryRepository extends JpaRepository<CaseHistory, Integer>{

	@Query(nativeQuery = true, value ="update CaseHistory set  ")
	CaseHistory updatePatientData();

	CaseHistory findByPatientId(int patientid);

}
