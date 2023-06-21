package com.xworkz.mvcapp.controller.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Setter
@Getter
@Data
@AllArgsConstructor
public class AmusementParkDto implements Serializable{
	
	
	private int amusementParkId;
	private String amusementParkName;
	private String cityName;
	private String adress;
	private String area;
	private int enytryFee;
	
	
	 
		
		
		
		
		
	}
	
	
	
	
	
	
	


