class Dunzo{


		public static double findItem(String item){
		  System.out.println("invoked findItem");
		  if(item == "Fruites"){
		  System.out.println("the item is available");
		     return 100.00;
		  }
		  if(item == "Vegetables"){
			  System.out.println("the item is available");
			  return 54.00 ;
		  }
		  if(item == "Medicine"){
			  System.out.println("the item is available");
			  return 259.00 ;
		  }
		  if(item == "Groceries"){
			  System.out.println("the item is available");
			  return 859.00 ;
		  }
		  if(item == "Cosmetics"){
			  System.out.println("the item is available");
			  return 284.00 ;
		  }
		  if(item == "Baby Products"){
			  System.out.println("the item is available");
			  return 315.00 ;
		  }
		  if(item == "Fish"){
			  System.out.println("the item is available");
			  return 350.00 ;
		  }
		  if(item == "Pet Supplies"){
			  System.out.println("the item is available");
			  return 249.00 ;
		  }
		  if(item == "Meat"){
			  System.out.println("the item is available");
			  return 749.00 ;
		  }
		  if(item == "Food Products"){
			  System.out.println("the item is available");
			  return 489.00 ;
		  }
		  if(item == "Soaps"){
			  System.out.println("the item is available");
			  return 150.00 ;
		  }
		  
		else{
		System.out.println("the item is not available");
		
		}
		return 0.0;
		}
		
		public static double findItem(String item ,int quantity){
			
		if(item == "Fruites"){
		  System.out.println("the item is available");
		     return 100.00*quantity;
		  }
		  if(item == "Vegetables"){
			  System.out.println("the item is available");
			  return 54.00*quantity ;
		  }
		  if(item == "Medicine"){
			  System.out.println("the item is available");
			  return 259.00*quantity ;
		  }
		  if(item == "Groceries"){
			  System.out.println("the item is available");
			  return 859.00*quantity ;
		  }
		  if(item == "Cosmetics"){
			  System.out.println("the item is available");
			  return 284.00*quantity ;
		  }
		  if(item == "Baby Products"){
			  System.out.println("the item is available");
			  return 315.00*quantity ;
		  }
		  if(item == "Fish"){
			  System.out.println("the item is available");
			  return 350.00*quantity ;
		  }
		  if(item == "Pet Supplies"){
			  System.out.println("the item is available");
			  return 249.00*quantity ;
		  }
		  if(item == "Meat"){
			  System.out.println("the item is available");
			  return 749.00*quantity ;
		  }
		  if(item == "Food Products"){
			  System.out.println("the item is available");
			  return 489.00*quantity ;
		  }
		  if(item == "Soaps"){
			  System.out.println("the item is available");
			  return 150.00*quantity ;
		  }
		  
		else{
		System.out.println("the item is not available");
		
		}
		return 0.0;
			
		}
}