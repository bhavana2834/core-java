package com.xworkz.abstr.patientapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor



public class Patient {
                   
	private int patientId;
	private String patientName;
	private String bloodGroup;
	private int age;
	private String gender;
	private String email;
	
	@Override
	public String toString() {
		
		return "Patient (Patient Id="+this.patientId+",Patient Name = "+this.patientName+", blood group="+this.bloodGroup+", age="+this.age+", Gender="+this.gender+",email="+this.email+") ";
	}
	
	
	
	
	
}
