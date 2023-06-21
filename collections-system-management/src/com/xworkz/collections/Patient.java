package com.xworkz.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class Patient {
	private int patientId;
	private String patientName;
	private  String bloodGroup;
	private int age;
	private String gender;
}
