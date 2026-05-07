package com.dcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
