class GroceryTester{

		public static void main(String groc[]){
		
		System.out.println(".....main method started..");
		String location[]={"Rajajinagar","Peenya","Nagarbavi","yeshwanthpur"};
		String items[] ={"Snacks","Biscuits","grains","chocolates"};
		
		Grocery things =new Grocery(1 , "MK",location,"ownerName",items);
		   things.displayDetails();
		System.out.println(".....main method ended..");
		}
}