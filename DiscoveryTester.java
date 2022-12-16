class DiscoveryTester{

		public static void main(String arg[]){
		
		System.out.println("main method started");
		
		Discovery disc= new Discovery();
		String data =disc.watch();
		
		System.out.println("the channel is used to:"+data);
		System.out.println("main method ended");
		
		}





}