package com.xworkz.foodstall.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FoodDto {
	
	
	private int id;
	 @NotBlank
	 @NotEmpty
	 @NotNull
	 @Size(min=2,max=10)
	private String storeName;
	private String foodItem;
	private int price;
	
	
	

}
