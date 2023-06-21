package com.xworkz.airport.service;

import com.xworkz.airport.dto.AirportDto;

public interface AirportService {
                 abstract boolean validateAndSave(AirportDto dto);
                 
                // abstract boolean updateById(int i);
}
