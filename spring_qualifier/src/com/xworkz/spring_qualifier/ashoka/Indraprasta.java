package com.xworkz.spring_qualifier.ashoka;

import org.springframework.stereotype.Component;

import com.xworkz.spring_qualifier.restuarant.Restuarant;


@Component(value="indraprasta")
public class Indraprasta implements Restuarant{
	
	@Override
	public String serveFood() {
		System.out.println("Restuarant Serve good food and Quality food ");
		return Restuarant.super.serveFood();
	}
	
	

}
