package com.xworkz.spring_qualifier.ashoka;

import org.springframework.stereotype.Component;

import com.xworkz.spring_qualifier.restuarant.Restuarant;


@Component(value="ashoka")
public class Ashoka implements Restuarant{
	
	@Override
	public String serveFood() {
		System.out.println("Serve the quality food");
		return Restuarant.super.serveFood();
	}
	
	

}
