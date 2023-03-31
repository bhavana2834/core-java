package com.xworkz.shooping.repository;

import com.xworkz.shooping.dto.ShoopingDto;

public interface ShoopingRepository {
	
	abstract boolean onSave(ShoopingDto dto);
	abstract boolean readByEmail(String email);
	abstract boolean readByName(String name);
	abstract boolean readAll(ShoopingDto dto);
	abstract boolean updateById(int id);
	abstract boolean updateByName(String shopName);
	abstract boolean updateByEmail(String email);
	abstract boolean deleteById(int id);
	abstract boolean deleteByEmail(String email);
	

}
