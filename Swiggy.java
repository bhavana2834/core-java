class Swiggy{

        
		public static double findItem(String item){
		  System.out.println("invoked findItem");
		  if(item == "Biryani"){
		  System.out.println("the item is available");
		     return 359.00;
		  }
		  if(item == "Pizza"){
			  System.out.println("the item is available");
			  return 420.00 ;
		  }
		  if(item == "Burger"){
			  System.out.println("the item is available");
			  return 500.00 ;
		  }
		  if(item == "Puliogere"){
			  System.out.println("the item is available");
			  return 100.00 ;
		  }
		  if(item == "Idly"){
			  System.out.println("the item is available");
			  return 85.00 ;
		  }
		  if(item == "Butter Masala Dosa"){
			  System.out.println("the item is available");
			  return 159.00 ;
		  }
		  if(item == "Veg Biryani"){
			  System.out.println("the item is available");
			  return 295.00 ;
		  }
		  if(item == "Roti"){
			  System.out.println("the item is available");
			  return 95.00 ;
		  }
		  if(item == "kabab"){
			  System.out.println("the item is available");
			  return 200.00 ;
		  }
		  if(item == "Chapati And Dal"){
			  System.out.println("the item is available");
			  return 250.00 ;
		  }
		  if(item == "Lemon Rice"){
			  System.out.println("the item is available");
			  return 85.00 ;
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
				return 359.00*quantity ;	
			}
			if (item=="Pizza"){
				System.out.println("the item is available");
				return 420.00*quantity;       
			}
			if(item=="Burger"){
				System.out.println("the item is available");
				return 500.00*quantity;
			}
			if(item=="puliogere"){
				System.out.println("the item is available");
				return 100.00*quantity ;
			}
			if(item=="Idly"){
				System.out.println("the item is available");
				return 85.00*quantity;
				
			}
			if(item=="Butter Masala Dosa"){
				System.out.println("the item is available");
				return 159.00*quantity;
			}
			if(item=="Veg Biryani"){
				System.out.println("the item is available");
				return 295.00*quantity ;	
			}
			if(item=="Roti"){
				System.out.println("the item is available");
				return  95.00*quantity ;
			}
			if(item=="kabab"){
				System.out.println("the item is avIlable");
				return 200.00*quantity;
				
			}
			if(item=="Chapati And Dal"){
				System.out.println("the item is available");
				return 250.00*quantity;
			}
			if(item=="Lemon Rice"){
				System.out.println("the item is available");
				return 85.00*quantity;
				
			}
			
		
		else{
			System.out.println("the item is not available");
		}
		return 0.0;
		}
}