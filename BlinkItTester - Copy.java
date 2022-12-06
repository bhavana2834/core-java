class BlinkItTester{



		public static void main(String a[]){
		System.out.println("findItem main method started");
		double priceOfItem = BlinkIt  . findItem ("Grains");
		System.out.println("the item price is:"  +priceOfItem);
		double itemWithQuantity=BlinkIt.findItem("Grains",2);
		System.out.println("the price of selected item is :"+itemWithQuantity);
		
		double priceOfItem1 = BlinkIt.findItem ("Flours");
		System.out.println("the item price is :" +priceOfItem1);
		double itemWithQuantity1=BlinkIt.findItem("Flours",5);
		System.out.println("the price of selected item is :"+itemWithQuantity1);
		
		double priceOfItem2 = BlinkIt.findItem ("Snacks");
		System.out.println("the item price is :" +priceOfItem2);
		double itemWithQuantity2=BlinkIt.findItem("Snacks",3);
		System.out.println("the price of selected item is :"+itemWithQuantity2);
		
		double priceOfItem3 = BlinkIt .findItem ("Cookies");
		System.out.println("the item price is :" +priceOfItem3);
		double itemWithQuantity3=BlinkIt.findItem("Cookies",4);
		System.out.println("the price of selected item is :"+itemWithQuantity3);
		
		double priceOfItem4 =BlinkIt .findItem ("Oil");
		System.out.println("the item price is :" +priceOfItem4);
		double itemWithQuantity4=BlinkIt.findItem("Oil",8);
		System.out.println("the price of selected item is :"+itemWithQuantity4);
		
		double priceOfItem5 = BlinkIt .findItem ("Ghee");
		System.out.println("the item price is :" +priceOfItem5);
		double itemWithQuantity5=BlinkIt.findItem("Ghee",7);
		System.out.println("the price of selected item is :"+itemWithQuantity5);
		
		double priceOfItem6 = BlinkIt .findItem ("Coffee And Tea Powder");
		System.out.println("the item price is :" +priceOfItem6);
		double itemWithQuantity6=BlinkIt.findItem("Coffee And Tea Powder",3);
		System.out.println("the price of selected item is :"+itemWithQuantity6);
		
		double priceOfItem7 = BlinkIt.findItem ("Lotions");
		System.out.println("the item price is :" +priceOfItem7);
		double itemWithQuantity7=BlinkIt.findItem("Lotions",5);
		System.out.println("the price of selected item is :"+itemWithQuantity7);
		
		double priceOfItem8 = BlinkIt .findItem ("Home Appliance");
		System.out.println("the item price is :" +priceOfItem8);
		double itemWithQuantity8=BlinkIt.findItem("Home Appliance",7);
		System.out.println("the price of selected item is :"+itemWithQuantity8);
		
		double priceOfItem9 = BlinkIt.findItem ("Accessories");
		System.out.println("the item price is :" +priceOfItem9);
		double itemWithQuantity9=BlinkIt.findItem("Accessories",2);
		System.out.println("the price of selected item is :"+itemWithQuantity9);
		
		double priceOfItem10 = BlinkIt.findItem ("Chocolates");
		System.out.println("the item price is :" +priceOfItem10);
		double itemWithQuantity10=BlinkIt.findItem("Chocolates",4);
		System.out.println("the price of selected item is :"+itemWithQuantity10);
		
		System.out.println("findItem main method is ended");
		
		}
}