class WhirlTester{

		public static void main(String arg[]){
		
		System.out.println("main method started");
		
		Fridge fridge = new Fridge();
		String data = fridge.toCool();
		System.out.println("the fridge is used to :"+data);
		
		System.out.println("main method ended");
		
		}



}