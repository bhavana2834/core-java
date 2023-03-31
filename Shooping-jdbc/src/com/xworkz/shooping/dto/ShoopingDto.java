package com.xworkz.shooping.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@AllArgsConstructor


public class ShoopingDto {
	
	private int id;
	@NotNull
	@NotBlank
	@NotEmpty
	@Size(min=1 ,max=20)
	private String shopName;
	
	private String email;
	
	
	
	
	

}
