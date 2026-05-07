package com.dcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.PatientDetails;

@Repository
public interface PatientDetailsRepo extends JpaRepository<PatientDetails, Integer>{

}
