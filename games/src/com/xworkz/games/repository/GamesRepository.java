package com.xworkz.games.repository;

import com.xworkz.games.dto.GamesDto;

public interface GamesRepository {
	
	abstract boolean onSave(GamesDto dto); 
	
}
