package com.xworkz.spring_depency.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@Component
@ToString
@AllArgsConstructor
@Setter

public class Books {
	
	
	public Books() {
		System.out.println(this.getClass().getSimpleName()+"  Object is created");
	}
	
     
	@Value("1")
	private int id;
	@Value("Ravindranath Tagore")
	private String authorName;
	@Value("Gitanjali")
	private String bookName;
     @Value("1910")
	private String yearOfPublish;
	@Value("450")
	private int price;

	
}
