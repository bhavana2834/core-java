package com.xworkz.spring_depency.library;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@Component
@ToString
@AllArgsConstructor
@Setter
@Getter

public class Library {
	
	
	
	           public Library() {
			    System.out.println(this.getClass().getSimpleName()+"  Object is created");
		        }

		  @Autowired
	      private List<Books> books;
	      
	      
}
