package com.xworkz.spring_qualifier.restuarant;

public interface Restuarant {
	
	
	default String serveFood() {
		
		return "Restuarant serve food";
		
	}

}
