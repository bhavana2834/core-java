package com.xworkz.mavenspring.glass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SpringConfiguration {

	@Bean(name="glass")
	public Glass getGlass() { 	

	Glass glass=new Glass();
	glass.setId(1);
	glass.setCompanyName("agc");
	glass.setPrice(67);
	return glass;
}
	
	@Bean(name="glass1")
	public Glass getGlass1() { 	

	Glass glass=new Glass();
	glass.setId(2);
	glass.setCompanyName("agc");
	glass.setPrice(679);
	return glass;
}
	
	@Bean(name="glass2")
	public Glass getGlass2() { 	

	Glass glass=new Glass();
	glass.setId(3);
	glass.setCompanyName("pioneer");
	glass.setPrice(778);
	return glass;
}
	@Bean(name="glass3")
	public Glass getGlass3() { 	

	Glass glass=new Glass();
	glass.setId(4);
	glass.setCompanyName("yasir");
	glass.setPrice(352);
	return glass;
}
	@Bean(name="glass4")
	public Glass getGlass4() { 	

	Glass glass=new Glass();
	glass.setId(5);
	glass.setCompanyName("shree");
	glass.setPrice(964);
	return glass;
}
	
}
