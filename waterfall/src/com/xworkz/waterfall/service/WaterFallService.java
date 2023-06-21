package com.xworkz.waterfall.service;

import com.xworkz.waterfall.dto.WaterFallDto;

public interface WaterFallService {
	  abstract boolean validateAndSave(WaterFallDto dto);
	  abstract boolean updateById(int id);
	  
}
