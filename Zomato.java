class Zomato{

        
		public static double findItem(String item){
		  System.out.println("invoked findItem");
		  if(item == "Biryani"){
		  System.out.println("the item is available");
		     return 225.00;
		  }
		  
		  if(item == "Pizza"){
			  System.out.println("the item is available");
			  return 249.00 ;
		  }
		  if(item == "Burger"){
			  System.out.println("the item is available");
			  return 350.00 ;
		  }
		  if(item == "puliogere"){
			  System.out.println("the item is available");
			  return 50.00 ;
		  }
		  if(item == "Idly"){
			  System.out.println("the item is available");
			  return 90.00 ;
		  }
		  if(item == "Butter Masala Dosa"){
			  System.out.println("the item is available");
			  return 80.00 ;
		  }
		  if(item == "Veg Biryani"){
			  System.out.println("the item is available");
			  return 149.00 ;
		  }
		  if(item == "Roti"){
			  System.out.println("the item is available");
			  return 150.00 ;
		  }
		  if(item == "kabab"){
			  System.out.println("the item is available");
			  return 149.00 ;
		  }
		  if(item == "Chapati And Dal"){
			  System.out.println("the item is available");
			  return 385.00 ;
		  }
		  if(item == "Lemon Rice"){
			  System.out.println("the item is available");
			  return 95.00 ;
		  }
		  
		else{
		System.out.println("the item is not available");
		
		}
		return 0.0;
		}
		
		public static double findItem(String item,int quantity){
			
			System.out.println("invoked findItem()");
			if(item== "Biryani"){
				System.out.println("the item is available");
				return 225.00*quantity ;	
			}
			if (item=="Pizza"){
				System.out.println("the item is available");
				return 249.00*quantity;       
			}
			if(item=="Burger"){
				System.out.println("the item is available");
				return 350.00*quantity;
			}
			if(item=="puliogere"){
				System.out.println("the item is available");
				return 50.00*quantity ;
			}
			if(item=="Idly"){
				System.out.println("the item is available");
				return 90.00*quantity;
				
			}
			if(item=="Butter Masala Dosa"){
				System.out.println("the item is available");
				return 80.00*quantity;
			}
			if(item=="Veg Biryani"){
				System.out.println("the item is available");
				return 149.00*quantity ;	
			}
			if(item=="Roti"){
				System.out.println("the item is available");
				return  150.00*quantity ;
			}
			if(item=="kabab"){
				System.out.println("the item is avIlable");
				return 149.00*quantity;
				
			}
			if(item=="Chapati And Dal"){
				System.out.println("the item is available");
				return 385.00*quantity;
			}
			if(item=="Lemon Rice"){
				System.out.println("the item is available");
				return 95.00*quantity;
				
			}
			
		
		else{
			System.out.println("the item is not available");
		}
		return 0.0;
		}
		
		
}