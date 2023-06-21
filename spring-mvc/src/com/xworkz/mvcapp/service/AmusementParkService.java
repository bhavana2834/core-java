package com.xworkz.mvcapp.service;


import com.xworkz.mvcapp.controller.dto.AmusementParkDto;
import com.xworkz.mvcapp.exception.AmusementParkException;

public interface AmusementParkService {
	
	
	    AmusementParkDto validateAnsSave(AmusementParkDto dto) throws AmusementParkException;
	
	

}
