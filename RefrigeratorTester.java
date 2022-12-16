class RefrigeratorTester{

		public static void main(String a[]){
		
		Refrigerator fridge = new Refrigerator("LG" , 30000.00d , "grey" , "20 KGs" , "150 ltrs");
		
		System.out.println(fridge.brandName + " " + fridge.price + " " + fridge.weight + " " + fridge.capacity + " " + fridge.color);
		
		Refrigerator refri= new Refrigerator("Samsung" , 54655.00d , "black" , "23 kgs" , "250 ltrs");
		
		System.out.println(refri.brandName + " " + refri.price + " " + refri.weight + " " + refri.capacity + " " + refri.color);
		
		
		}



}