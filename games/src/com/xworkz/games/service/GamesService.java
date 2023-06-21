package com.xworkz.games.service;

import com.xworkz.games.dto.GamesDto;

public interface GamesService {

	  abstract boolean validateAndSave(GamesDto dto);
	  abstract boolean updateOnId(int id);
}
