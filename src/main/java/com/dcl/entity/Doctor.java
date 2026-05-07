package com.dcl.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer doctorId;
	
	@Column(nullable=true)
	@NotBlank(message = "name should be empty")
	private String doctorName;
	
	@NotBlank(message="email should not be empty")
	@Email(message="format is invalid")
	@Column(unique=true)
	private String emailId;
	
	@Column(nullable=true,unique=true)
	private Long phone;
	
	private Double consultationFee;
	
	private Integer experienceYears;
	
	private String password;
	
	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointment;
}
