class FinolexTester{

		public static void main(String arg[]){
		
		System.out.println("main method started");
		
		Finolex  fin = new Finolex();
		String data = fin.current();
		
		System.out.println("the energy drink  is used to:"+data);
		System.out.println("main method ended");
		
		}




}