package com.xworkz.mavenspring.train;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class SpringConfiguration {
	
	
	@Bean(name="train")
	public Train getTrain() { 	

		Train train=new Train();
		train.setId(1);
		train.setSource("bangalore");
		train.setDestination("mangalore");
		train.setNOofEntry(10);
	return train;

}
	
	@Bean(name="train1")
	public Train getTrain1() { 	

		Train train=new Train();
		train.setId(2);
		train.setSource("mumbai");
		train.setDestination("pune");
		train.setNOofEntry(54);
	return train;

  }
	
	@Bean(name="train2")
	public Train getTrain2() { 	

		Train train=new Train();
		train.setId(3);
		train.setSource("pune");
		train.setDestination("delhi");
		train.setNOofEntry(78);
	return train;

   }
	
	@Bean(name="train3")
	public Train getTrain3() { 	

		Train train=new Train();
		train.setId(4);
		train.setSource("pune");
		train.setDestination("delhi");
		train.setNOofEntry(78);
	return train;

   }
	@Bean(name="train4")
	public Train getTrain4() { 	

		Train train=new Train();
		train.setId(5);
		train.setSource("chennai");
		train.setDestination("hyderabad");
		train.setNOofEntry(90);
	return train;

   }
	
	
	
	
	

}
