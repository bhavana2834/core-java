package com.xworkz.mvcapp.repository;


import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;

public interface AmusementParkRepository {
	
	
	
	AmusementParkDto save(AmusementParkDto dto) throws AmusementParkException;
	

}
