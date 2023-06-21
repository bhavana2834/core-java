package com.xworkz.springcomponent.addess;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Books {
	
	
	
	public Books() {
		System.out.println(this.getClass().getSimpleName()+"Object is created");
	}
	
	
	
	@Value("1")
	private int id;
	@Value("Chethan Bhagat")
	private String authorName;
	@Value("Two States")
	private String bookName;
	@Value("2005")
	private String yearOfPublish;
	@Value("200")
	private int price;
	
	

}
