package com.xworkz.mavenspring.foodstall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfiguration {
	

	@Bean(name="foodStall")
	public FoodStall getFoodStall() { 	

	FoodStall foodStall=new FoodStall();
	foodStall.setId(1);
	foodStall.setFoodItem("agc");
	foodStall.setShopName("a2b");
	
	return foodStall;

}
	@Bean(name="foodStall1")
	public FoodStall getFoodStall1() { 	

	FoodStall foodStall=new FoodStall();
	foodStall.setId(2);
	foodStall.setFoodItem("puliogere");
	foodStall.setShopName("udupi hotel");
	
	
	return foodStall;

}
	@Bean(name="food2")
	public FoodStall getFoodStall2() { 	

	FoodStall foodStall=new FoodStall();
	foodStall.setId(3);
	foodStall.setFoodItem("BisibeleBath");
	foodStall.setShopName("venkateshwara");	
	return foodStall;
}
	@Bean(name="food3")
	public FoodStall getFoodStall3() { 	

	FoodStall foodStall=new FoodStall();
	foodStall.setId(4);
	foodStall.setFoodItem("Biryani");
	foodStall.setShopName("Hasanamba");
	
	
	return foodStall;

}
	
	@Bean(name="food4")
	public FoodStall getFoodStall4() { 	

	FoodStall foodStall=new FoodStall();
	foodStall.setId(5);
	foodStall.setFoodItem("Fried Rice");
	foodStall.setShopName("veena");
	
	
	return foodStall;

}
	
	@Bean(name="string")
	public String getString() {
		return "to be managed by the spring by applicationcontext";
	}
	@Bean(name="string1")
	public String getString1() {
		return "Configuration accept the class file";
	}
	@Bean(name="string2")
	public String getString2() {
		return "bean accept the .class and .java file";
	}
	@Bean(name="string3")
	public String getString3() {
		return "ApplicationContext interface is used for spring";
	}
	@Bean(name="string4")
	public String getString4() {
		return "spring manages the object";
	}
	
	@Bean(name="integer")
	public Integer getInteger() {
		return 78;
		
	}
	@Bean(name="integer1")
	public Integer getInteger1() {
		return 987;
		
	}
	@Bean(name="integer2")
	public Integer getInteger2() {
		return 13;
		
	}
	@Bean(name="integer3")
	public Integer getInteger3() {
		return 076;
		
	}
	@Bean(name="integer4")
	public Integer getInteger4() {
		return 6725;
		
	}
	
	@Bean(name="short1")
	public Short getShort1() {
		
		return 36;
	}
	@Bean(name="short2")
	public Short getShort2() {
		
		return 69;
	}
	@Bean(name="short3")
	public Short getShort3() {
		
		return 90;
	}
	@Bean(name="short4")
	public Short getShort4() {
		
		return 234;
	}
	@Bean(name="short5")
	public Short getShort5() {
		
		return 678;
	}
	
	
	

}
