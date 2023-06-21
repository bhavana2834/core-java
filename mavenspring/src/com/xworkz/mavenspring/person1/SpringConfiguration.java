package com.xworkz.mavenspring.person;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mavenspring.glass.Glass;

@Configuration

public class SpringConfiguration {
	
	@Bean(name="person")
	public Person getPerson() { 	

	Person person=new Person();
	person.setId(1);
	person.setName("roopa");
	person.setAge(34);
	
	
	return person;

     }
	
	@Bean(name="person1")
	public Person getPerson1() { 	

		Person person=new Person();
		person.setId(2);
		person.setName("Umesh");
		person.setAge(67);
		
		
		return person;

	}
	@Bean(name="person2")
	public Person getPerson2() { 	

		Person person=new Person();
		person.setId(3);
		person.setName("Balaji");
		person.setAge(16);
		
		
		return person;

	}
	@Bean(name="person3")
	public Person getPerson3() { 	

		Person person=new Person();
		person.setId(4);
		person.setName("Rashmi");
		person.setAge(25);
		
		
		return person;

	}
	@Bean(name="person4")
	public Person getPerson4() { 	

		Person person=new Person();
		person.setId(5);
		person.setName("Bhavana");
		person.setAge(22);
		
		
		return person;

	}
	@Bean
	public Boolean getBoolean() {
		return false;
	
	
	
	/*@Bean
	public Glass getGlass() { 	

	Glass glass=new Glass();
	glass.setId(1);
	glass.setCompanyName("agc");
	glass.setPrice(67);
	
	
	return glass;

}
	@Bean
	public String getString() {
		return "to be managed by the spring by applicationcontext";
	}
	@Bean
	public Integer getInteger() {
		return 67;
		
	}
	@Bean
	public Float getFloat() {
		
		return  345.0F;	
	}
	@Bean
	public Byte getByte() {
		return 3;
		
	}
	@Bean
	public Long getLong() {
		
		return 467467766L;
	}
	@Bean
	public Short getShort() {
		
		return 56;
	}
	
	
	@Bean
	public Boolean getBoolean() {
		return false;
	}
	
	@Bean
	public Character getCharacter() {
		return 'b';
	}
	
	@Bean
	public Double getDouble() {
		
		return 45676.56;
	}
	
	@Bean
	public Scanner getScanner() {
		
		return new Scanner(System.in);
	}
	*/
	
	
}
