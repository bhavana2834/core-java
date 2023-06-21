package com.xworkz.spring_depency.restuarant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class Restuarant {
	
	public Restuarant() {
		System.out.println(this.getClass().getSimpleName()+"  Object is created");
	}
	
	@Autowired
	private List<Food> food;
	
	

}
