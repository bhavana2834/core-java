package com.xworkz.airport.repository;

import com.xworkz.airport.dto.AirportDto;

public interface AirportRepository {
	
	
	
             abstract boolean onSave(AirportDto dto);  
             abstract boolean updateById(int i);
}
