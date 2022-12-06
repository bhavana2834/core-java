class BlinkIt{


		public static double findItem(String item){
		  System.out.println("invoked findItem");
		  if(item == "Grains"){
		  System.out.println("the item is available");
		     return 379.00;
		  }
		  if(item == "Flours"){
			  System.out.println("the item is available");
			  return 450.00 ;
		  }
		  if(item == "Snacks"){
			  System.out.println("the item is available");
			  return 379.00 ;
		  }
		  if(item == "Cookies"){
			  System.out.println("the item is available");
			  return 350.00 ;
		  }
		  if(item == "Oil"){
			  System.out.println("the item is available");
			  return 450.00 ;
		  }
		  if(item == "Ghee"){
			  System.out.println("the item is available");
			  return 476.00 ;
		  }
		  if(item == "Coffee And Tea Powder"){
			  System.out.println("the item is available");
			  return 760.00 ;
		  }
		  if(item == "Lotions"){
			  System.out.println("the item is available");
			  return 280.00 ;
		  }
		  if(item == "Home Appliance"){
			  System.out.println("the item is available");
			  return 627.00 ;
		  }
		  if(item == "Accessories"){
			  System.out.println("the item is available");
			  return 836.00 ;
		  }
		  if(item == "Chocolates"){
			  System.out.println("the item is available");
			  return 307.00 ;
		  }
		  
		else{
		System.out.println("the item is not available");
		
		}
		return 0.0;
		}
		
		public static double findItem(String item,int quantity){
			
			if(item == "Grains"){
		  System.out.println("the item is available");
		     return 379.00*quantity;
		  }
		  if(item == "Flours"){
			  System.out.println("the item is available");
			  return 450.00*quantity ;
		  }
		  if(item == "Snacks"){
			  System.out.println("the item is available");
			  return 379.00*quantity ;
		  }
		  if(item == "Cookies"){
			  System.out.println("the item is available");
			  return 350.00*quantity ;
		  }
		  if(item == "Oil"){
			  System.out.println("the item is available");
			  return 450.00*quantity ;
		  }
		  if(item == "Ghee"){
			  System.out.println("the item is available");
			  return 476.00*quantity ;
		  }
		  if(item == "Coffee And Tea Powder"){
			  System.out.println("the item is available");
			  return 760.00*quantity ;
		  }
		  if(item == "Lotions"){
			  System.out.println("the item is available");
			  return 280.00*quantity ;
		  }
		  if(item == "Home Appliance"){
			  System.out.println("the item is available");
			  return 627.00*quantity ;
		  }
		  if(item == "Accessories"){
			  System.out.println("the item is available");
			  return 836.00*quantity ;
		  }
		  if(item == "Chocolates"){
			  System.out.println("the item is available");
			  return 307.00*quantity ;
		  }
		  
		else{
		System.out.println("the item is not available");
		
		}
		return 0.0;
		}
}