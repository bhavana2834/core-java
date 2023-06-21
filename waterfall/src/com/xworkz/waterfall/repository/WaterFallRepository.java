package com.xworkz.waterfall.repository;

import com.xworkz.waterfall.dto.WaterFallDto;

public interface WaterFallRepository {
	abstract boolean onSave(WaterFallDto dto); 
}
