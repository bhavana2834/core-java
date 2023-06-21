package com.xworkz.cricket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data

public class CricketDto {
                
				 private int id;
				 @NotBlank
				 @NotEmpty
				 @NotNull
				 @Size(min=2,max=10)
                 private String gameName;
				
                 private String team;
				
                 private String place;
                 private String team2;
                 
}
