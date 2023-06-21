package com.xworkz.springcomponent.addess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Library {
	
      public Library() {
		System.out.println(this.getClass().getSimpleName()+"Object is created");
	}
      
      @Autowired
      public Books books;
      
}
