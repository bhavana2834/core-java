package com.xworkz.spring_depency.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.xworkz.spring_depency.automobile.SpareParts;
import com.xworkz.spring_depency.kanti.Sweets;
import com.xworkz.spring_depency.library.Books;
import com.xworkz.spring_depency.library.Library;
import com.xworkz.spring_depency.restuarant.Food;
import com.xworkz.spring_depency.teashop.Category;

import lombok.AllArgsConstructor;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring_depency")


public class SpringConfig {
	
	
	@Bean
	@Order
	public Books getBooks() { 
		
           return new Books(1,"chethan","two states","2006",1100);
	}
	
	@Bean
	@Order
	public Books getBooks1() {
           return new Books(2,"AbdulKalam","wings of Fire","1945",179);
	}
	
	
	@Bean
	@Order
	public Books getBooks2() {
		
		return new Books(3,"the guide","narayan","1976",300);
	}
	
	@Bean
	@Order(1)
	public SpareParts getSpareParts() {
		
		
		return new SpareParts(1,"car","air vent");
	}
	@Bean
	@Order(2)
	public SpareParts getSpareParts1() {
		return new SpareParts(2,"Car","alram");
		
		
	}
	@Bean
	@Order(3)
	public SpareParts getSpareParts2() {
		return new SpareParts(3,"Lorry","antenna");
		
		
	}
	@Bean
	@Order(4)
	public SpareParts getSpareParts3() {
		return new SpareParts(4,"TRuck","anti");
		
		
	}
	@Bean
	@Order(5)
	public SpareParts getSpareParts4() {
		return new SpareParts(5,"Byke","clucth");
		
		
	}
	@Bean
	@Order(6)
	public SpareParts getSpareParts5() {
		return new SpareParts(6,"Scooter","controller");		
	}
	@Bean
	@Order(7)
	public SpareParts getSpareParts6() {
		return new SpareParts(7,"Car","brake light");		
	}
	@Bean
	@Order(8)
	public SpareParts getSpareParts7() {
		return new SpareParts(8,"Lorry","cylinder");	
	}
	@Bean
	@Order(9)
	public SpareParts getSpareParts8() {
		return new SpareParts(9,"truck","valve");
		
		
	}
	@Bean
	@Order(10)
	public SpareParts getSpareParts9() {
		return new SpareParts(10,"Bicycle","wheel");
		
		
	}
	@Bean
	@Order(11)
	public SpareParts getSpareParts10() {
		return new SpareParts(11,"Auto","warning light");
		
		
	}
	@Bean
	@Order(12)
	public SpareParts getSpareParts11() {
		return new SpareParts(12,"MotorCycle","piston");
		
		
	}
	@Bean
	@Order(13)
	public SpareParts getSpareParts12() {
		return new SpareParts(13,"scooter","pedal");
		
		
	}
	@Bean
	@Order(14)
	public SpareParts getSpareParts13() {
		return new SpareParts(14,"Car","motor");
		
		
	}
	@Bean
	@Order(15)
	public SpareParts getSpareParts14() {
		return new SpareParts(15,"Bus","mirror");
		
		
	}
	
	@Bean
	public List<Sweets> getSweets(){
		
      List<Sweets> list=new ArrayList<Sweets>();
      
		list.add(new Sweets(1,"Jalebi","Kanthi"));
		list.add(new Sweets(2,"kaju barfi","Gourmet Candy Shop"));
		list.add(new Sweets(3,"jamun","Mexicandy Distributor"));
		list.add(new Sweets(4,"kheer","Kids Kon fections"));
		list.add(new Sweets(5,"rasgulla","Super Candylicious"));
		list.add(new Sweets(6,"choco lava cake","The Bob Stopper"));
		list.add(new Sweets(7,"ladu","Katherine Anne Confections"));
		list.add(new Sweets(8,"Sherra","Studio Sweets"));
		list.add(new Sweets(9,"Rasmalai","Chocolate Boulevard"));
		list.add(new Sweets(10,"sweet pancake","Philips Candy"));
		list.add(new Sweets(11,"pedha","Sugar Plum Fairy"));
		list.add(new Sweets(12,"dhood peda","Bags of Fun"));
		list.add(new Sweets(13,"jhangri","Sweet Box Candy"));
		list.add(new Sweets(14,"mysore pak","Economy Candy"));
		list.add(new Sweets(15,"basundi","Sweet Mania"));
		
		
		return list;
		
		
	}
	
	@Bean
	public List<Food> getFood(){
		
		List<Food> food=new ArrayList<Food>();
		food.add(new Food(1,"Puliogere","Indian"));
		food.add(new Food(2,"Bisibele bath","Indian"));
		food.add(new Food(3,"Palav","Indian"));
		food.add(new Food(4,"Noddles","Chinese"));
		food.add(new Food(5,"Ramen","KOrean"));
		food.add(new Food(6,"Fish","Indian"));
		food.add(new Food(7,"Biryani","Indian"));
		food.add(new Food(8,"pizza","german"));
		food.add(new Food(9,"momos","China"));
		food.add(new Food(10,"Aloo parota",""));
		food.add(new Food(11,"Idli","indian"));
		food.add(new Food(12,"poori","indian"));
		food.add(new Food(13,"masala dosa","indian"));
		food.add(new Food(14,"pongal","indian"));
		food.add(new Food(15,"suji","KOrean"));
		
		
		return food;
		
	}
	
	@Bean
	public List<Category> getCategory(){
		
		List<Category> list=new ArrayList<Category>();
		
		list.add(new Category(1,"Coffee",67,98));
		list.add(new Category(2,"Tea",68,436));
		list.add(new Category(3,"BlackTea",24,98));
		list.add(new Category(4,"Green Tea",477,578));
		list.add(new Category(5,"Sandwich",234,555));
		list.add(new Category(6,"Bread",578,134));
		list.add(new Category(7,"Butermilk",14,23));
		list.add(new Category(8,"Biscuit",43,244));
		list.add(new Category(9,"Boost",244,339));
		list.add(new Category(10,"Fries",075,15));
		list.add(new Category(11,"IceCReam",077,24));
		list.add(new Category(12,"tea powder",86,24));
		list.add(new Category(13,"Chocolates",766,62));
		list.add(new Category(14,"Milk",355,368));
		list.add(new Category(15,"FilterCoffee",367,457));
		
		
		return list;
		
		
	}
	
	
	
	
   
}
