package com.xworkz.spring_depency.restuarant;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.spring_depency.library.Books;
import com.xworkz.spring_depency.library.Library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Component
@ToString
@AllArgsConstructor
@Setter
@Getter
public class Food {
	
	
	
	public Food() {
		System.out.println(this.getClass().getSimpleName()+"  Object is created");
	}

	
	private int id;
	
	private String FoodName;
	private String type;
	
	
}
