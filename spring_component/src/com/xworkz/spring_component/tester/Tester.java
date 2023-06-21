package com.xworkz.spring_component.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
import com.xworkz.spring_component.spring_configuration.SpringConfiguration;




public class Tester {
	
	
	public static void main(String arg[]) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Internet internet=context.getBean("internet",Internet.class);
    System.out.println(internet);
	
	House house=context.getBean("house",House.class);
	System.out.println(house);
	
	Team team=context.getBean("team",Team.class);
	System.out.println(team);
	
	Channel channel=context.getBean("channel",Channel.class);
	System.out.println(channel);
	
	Phone phone=context.getBean("phone",Phone.class);
	System.out.println(phone);
	
	Hotel hotel=context.getBean("hotel",Hotel.class);
	System.out.println(house);
	
	Institute institute=context.getBean("institute",Institute.class);
	System.out.println(institute);
	
	Juice juice=context.getBean("juice",Juice.class);
	System.out.println(juice);
	
	Building building=context.getBean("building",Building.class);
	System.out.println(building);
	
	Company company=context.getBean("company",Company.class);
	System.out.println(company);
	
	Gun gun=context.getBean("gun",Gun.class);
	System.out.println(gun);
	
	Bar bar=context.getBean("bar",Bar.class);
	System.out.println(bar);
	
	
	}
}
