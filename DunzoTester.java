class DunzoTester{



		public static void main(String a[]){
		System.out.println("findItem main method started");
		
		double priceOfItem =   Dunzo. findItem ("Fruites");
		System.out.println("the item price is:"  +priceOfItem);
		double itemWithQuantity=Dunzo.findItem("Fruites",2);
		System.out.println("the price of selected item is :"+itemWithQuantity);
		
		
		double priceOfItem1 = Dunzo.findItem ("Vegetables");
		System.out.println("the item price is :" +priceOfItem1);
		double itemWithQuantity1=Dunzo.findItem("Vegetables",4);
		System.out.println("the price of selected item is :"+itemWithQuantity1);
		
		double priceOfItem2 = Dunzo.findItem ("Medicine");
		System.out.println("the item price is :" +priceOfItem2);
		double itemWithQuantity2=Dunzo.findItem("Medicine",6);
		System.out.println("the price of selected item is :"+itemWithQuantity2);
		
		double priceOfItem3 = Dunzo.findItem ("Groceries");
		System.out.println("the item price is :" +priceOfItem3);
		double itemWithQuantity3=Dunzo.findItem("Groceries",5);
		System.out.println("the price of selected item is :"+itemWithQuantity3);
		
		double priceOfItem4 = Dunzo.findItem ("Cosmetics");
		System.out.println("the item price is :" +priceOfItem4);
		double itemWithQuantity4=Dunzo.findItem("Cosmetics",3);
		System.out.println("the price of selected item is :"+itemWithQuantity4);
		
		double priceOfItem5 = Dunzo.findItem ("Baby Products");
		System.out.println("the item price is :" +priceOfItem5);
		double itemWithQuantity5=Dunzo.findItem("Baby Products",5);
		System.out.println("the price of selected item is :"+itemWithQuantity5);
		
		double priceOfItem6 = Dunzo.findItem ("Fish");
		System.out.println("the item price is :" +priceOfItem6);
		double itemWithQuantity6=Dunzo.findItem("Fish",8);
		System.out.println("the price of selected item is :"+itemWithQuantity6);
		
		double priceOfItem7 = Dunzo.findItem ("Pet Supplies");
		System.out.println("the item price is :" +priceOfItem7);
		double itemWithQuantity7=Dunzo.findItem("Pet Supplies",2);
		System.out.println("the price of selected item is :"+itemWithQuantity7);
		
		double priceOfItem8 = Dunzo.findItem ("Meat");
		System.out.println("the item price is :" +priceOfItem8);
		double itemWithQuantity8=Dunzo.findItem("Meat",5);
		System.out.println("the price of selected item is :"+itemWithQuantity8);
		
		double priceOfItem9 = Dunzo.findItem ("Food Products");
		System.out.println("the item price is :" +priceOfItem9);
		double itemWithQuantity9=Dunzo.findItem("Food Products",4);
		System.out.println("the price of selected item is :"+itemWithQuantity9);
		
		double priceOfItem10 = Dunzo.findItem ("Soaps");
		System.out.println("the item price is :" +priceOfItem10);
		double itemWithQuantity10=Dunzo.findItem("Soaps",9);
		System.out.println("the price of selected item is :"+itemWithQuantity10);
		
		System.out.println("findItem main method is ended");
		
		}
}