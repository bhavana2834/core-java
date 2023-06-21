package com.xworkz.cricket.service;


import com.xworkz.cricket.dto.CricketDto;

public interface CricketService {
	
	
	
	
	  abstract boolean validateAndSave(CricketDto dto);
	  abstract boolean updateById(int id);

}
