class SamsungTester{

		public static void main(String arg[]){
		System.out.println("main method started");

		Samsung sam = new Samsung();
		String data = sam.gaming();
		String data1 = sam.browse();
		
		System.out.println("gaming is for "+data);
		System.out.println("browse is for "+data1);
		
		System.out.println("main method started");
		}
}