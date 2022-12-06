class ZomatoTester{



		public static void main(String a[]){
		System.out.println("findItem main method started");
		
		double priceOfItem =   Zomato. findItem ("Biryani");
		System.out.println("the item price is:"  +priceOfItem);
		double itemWithQuantity=Zomato.findItem("Biryani",2);
		System.out.println("the price of selected item is :"+itemWithQuantity);
		
		
		double priceOfItem1 = Zomato.findItem ("Pizza");
		System.out.println("the item price is :" +priceOfItem1);
		double itemWithQuantity1=Zomato.findItem("Pizza",3);
		System.out.println("the price of item selected is:"+itemWithQuantity1);
		
		double priceOfItem2 = Zomato.findItem ("Burger");
		System.out.println("the item price is :" +priceOfItem2);
		double itemWithQuantity2=Zomato.findItem("Burger",4);
		System.out.println("the price of item selected is:"+itemWithQuantity2);
		
		
		double priceOfItem3 = Zomato.findItem ("puliogere");
		System.out.println("the item price is :" +priceOfItem3);
		double itemWithQuantity3=Zomato.findItem("puliogere",5);
		System.out.println("the price of item selected is:"+itemWithQuantity3);
		
		double priceOfItem4 = Zomato.findItem ("Idly");
		System.out.println("the item price is :" +priceOfItem4);
		double itemWithQuantity4=Zomato.findItem("Idly",4);
		System.out.println("the price of item selected is:"+itemWithQuantity4);
		
		double priceOfItem5 = Zomato.findItem ("Butter Masala Dosa");
		System.out.println("the item price is :" +priceOfItem5);
		double itemWithQuantity5=Zomato.findItem("Butter Masala Dosa",4);
		System.out.println("the price of item selected is:"+itemWithQuantity5);
		
		double priceOfItem6 = Zomato.findItem ("Veg Biryani");
		System.out.println("the item price is :" +priceOfItem6);
		double itemWithQuantity6=Zomato.findItem("Veg Biryani",6);
		System.out.println("the price of the selected item is:"+itemWithQuantity6);
		
		
		double priceOfItem7 = Zomato.findItem ("Roti");
		System.out.println("the item price is :" +priceOfItem7);
		double itemWithQuantity7=Zomato.findItem("Roti",7);
		System.out.println("the price of the selected item:"+itemWithQuantity7);
		
		double priceOfItem8 = Zomato.findItem ("kabab");
		System.out.println("the item price is :" +priceOfItem8);
		double itemWithQuantity8=Zomato.findItem("kabab",4);
		System.out.println("the price of the selected item:"+itemWithQuantity8);
		
		double priceOfItem9 = Zomato.findItem ("Chapati And Dal");
		System.out.println("the item price is :" +priceOfItem9);
		double itemWithQuantity9=Zomato.findItem("Chapati And Dal",5);
		System.out.println("the price of the selected item:"+itemWithQuantity9);
		
		double priceOfItem10 = Zomato.findItem ("Lemon Rice");
		System.out.println("the item price is :" +priceOfItem10);
		double itemWithQuantity10=Zomato.findItem("Lemon Rice",6);
		System.out.println("the price of the selected item is:"+itemWithQuantity10);
		
		System.out.println("findItem main method is ended");
		
		}


}