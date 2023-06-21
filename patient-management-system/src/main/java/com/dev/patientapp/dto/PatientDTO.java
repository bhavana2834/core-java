package com.dev.patientapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
	
	
	private int id;
	private String patientName;
	private String age;
	private String bloodGroup;
	private String email;
	

}
