package com.xworkz.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString


public class Manager {
          
	
	private int managerId;
	private String managerName;
	private String qualification;
    private long contactNo;
    private String gender;
}
