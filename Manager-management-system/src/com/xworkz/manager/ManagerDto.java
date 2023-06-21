package com.xworkz.manager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ManagerDto {
	
	
	
	
	private int managerId;
	private String managerName;
	private String qualification;
    private long contactNo;
    private int salary;

}
