package com.xworkz.comparatorapp.dtoClasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Manager {
	
	private int managerId;
	private String managerName;
	private String qualification;
    private long contactNo;
    private String gender;
}
