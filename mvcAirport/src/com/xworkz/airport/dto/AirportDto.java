package com.xworkz.airport.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class AirportDto {
	
	
	
             private int id;
             
             @NotBlank
			 @NotEmpty
			 @NotNull
			 @Size(min=2,max=10)  
             private String airport_name;
             
             private String place;
             
             private int terminals;
             private int noOfPeoples;
             private int noOfinterNational;
             private int noOfCountry;
             
                         
             
}
