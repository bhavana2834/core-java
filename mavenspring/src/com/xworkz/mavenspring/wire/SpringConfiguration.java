package com.xworkz.mavenspring.wire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	
	@Bean(name="wire")
	public Wire getWire() {
		
	 Wire wire =new Wire();
	 wire.setId(1);
	 wire.setBrand("phenolex");
	 wire.setPrice(800);	
		
	return wire;	
	}
	
	@Bean(name="wire1")
	public Wire getWire1() {
		
	 Wire wire =new Wire();
	 wire.setId(2);
	 wire.setBrand("havells");
	 wire.setPrice(852);	
		
	return wire;	
	}
	
	@Bean(name="wire2")
	public Wire getWire2() {
		
	 Wire wire =new Wire();
	 wire.setId(3);
	 wire.setBrand("phenolex1");
	 wire.setPrice(8732);	
		
	return wire;	
	}
	
	@Bean(name="wire3")
	public Wire getWire3() {
		
	 Wire wire =new Wire();
	 wire.setId(4);
	 wire.setBrand("havelse1");
	 wire.setPrice(500);	
		
	return wire;	
	}

	@Bean(name="wire4")
	public Wire getWire4() {
		
	 Wire wire =new Wire();
	 wire.setId(5);
	 wire.setBrand("phenolex2");
	 wire.setPrice(456);	
		
	return wire;	
	}
}
