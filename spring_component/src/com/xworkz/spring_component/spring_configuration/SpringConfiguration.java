package com.xworkz.spring_component.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring_component.internet.Bar;
import com.xworkz.spring_component.internet.Building;
import com.xworkz.spring_component.internet.Channel;
import com.xworkz.spring_component.internet.Company;
import com.xworkz.spring_component.internet.Gun;
import com.xworkz.spring_component.internet.Hotel;
import com.xworkz.spring_component.internet.House;
import com.xworkz.spring_component.internet.Institute;
import com.xworkz.spring_component.internet.Internet;
import com.xworkz.spring_component.internet.Juice;
import com.xworkz.spring_component.internet.Phone;
import com.xworkz.spring_component.internet.Team;


@Configuration
@ComponentScan(basePackages = "package com.xworkz.spring_component.internet")

public class SpringConfiguration {
	

	@Bean(name="internet")
	public Internet getInternet() {
				
		return new Internet();
	}
	
	
	@Bean(name="house")
	public House getHouse() {
				
		return new House();
	}
	
	@Bean(name="team")
	public Team getTeam() {	
		return new Team();
	}
	
	@Bean(name="channel")
	public Channel getChannel() {
				
		return new Channel();
	}
	
	@Bean(name="phone")
	public Phone getPhone() {
				
		return new Phone();
	}
	@Bean(name="hotel")
	public Hotel getHotel() {
				
		return new Hotel();
	}
	
	@Bean(name="institute")
	public Institute getInstitute() {
				
		return new Institute();
	}
	@Bean(name="juice")
	public Juice getJuice() {
				
		return new Juice();
	}
	
	@Bean(name="building")
	public Building getBuilding() {
				
		return new Building();
	}
	
	@Bean(name="company")
	public Company getCompany() {
				
		return new Company();
	}
	
	@Bean(name="gun")
	public Gun getGun() {
				
		return new Gun();
	}
	
	@Bean(name="bar")
	public Bar getBar() {
				
		return new Bar();
	}
}
