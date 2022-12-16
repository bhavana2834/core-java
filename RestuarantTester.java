class RestuarantTester{

		public static void main(String rest[]){
		
			System.out.println("...Main method started...");
			
		   String workers[] = {"Balaji", "Hemanth","Kishore", "Babu"};
		   String menu[] = {"gobi","masala papad","biryani"};
		
		Restuarant rest = new Restuarant(1 , "MgRoad","Sagar",workers,menu);
		 
		   rest.displayDetails();
		   
		   System.out.println("...Main method ended..."); 
		}




}