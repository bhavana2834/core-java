package com.xworkz.spring_depency;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring_depency.automobile.Automobile;
import com.xworkz.spring_depency.config.SpringConfig;

import com.xworkz.spring_depency.kanti.Kanti;
import com.xworkz.spring_depency.kanti.Sweets;
import com.xworkz.spring_depency.library.Library;
import com.xworkz.spring_depency.restuarant.Food;
import com.xworkz.spring_depency.restuarant.Restuarant;
import com.xworkz.spring_depency.teashop.Category;
import com.xworkz.spring_depency.teashop.TeaShop;


public class Tester {
	
	public static void main(String arg[]) {
		
	      ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		    
	      Automobile mobile=context.getBean(Automobile.class);
	      System.out.println(mobile);
	      
	     Kanti kanti=context.getBean(Kanti.class);
	  	List<Sweets> list=new SpringConfig().getSweets();
	  	kanti.setSweets(list);
	  	System.out.println(kanti);
	  	
	  	Library library=context.getBean(Library.class);
		System.out.println(library);
			
		/*Restuarant restuarant=context.getBean(Restuarant.class);
		List<Food> list1=new SpringConfig().getFood();
		restuarant.setFood(list1);
		System.out.println(restuarant);*/
		
		TeaShop tea=context.getBean(TeaShop.class);
		List<Category> list2=new SpringConfig().getCategory();
		tea.setCategory(list2);
		System.out.println(tea);
	      
		}

	
	
	
	
	
	
	

}
