class StationaryTester{

		public static void main(String groc[]){
		
		System.out.println(".....main method started..");
		String pens[]={"Reynolds","Butterflow","cello bright","markers"};
		String charts[] ={"national","animals","flowers","fruits"};
		String notebooks[] ={"classmate","chandras","vidya","bhavani"};
		
		Stationary things =new Stationary(1 , "Book Shop",notebooks,pens,charts);
		   things.displayDetails();
		System.out.println(".....main method ended..");
		}
}