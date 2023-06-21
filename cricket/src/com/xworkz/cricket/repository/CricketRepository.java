package com.xworkz.cricket.repository;

import com.xworkz.cricket.dto.CricketDto;

public interface CricketRepository {
	
	
	abstract boolean onSave(CricketDto dto);  
	
	
	
}
