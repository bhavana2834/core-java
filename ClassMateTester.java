class ClassMateTester{

		public static void main(String arg[]){
		
		System.out.println("main method started");
		
		Book book = new Book();
		String data = book.toRead();
		
		System.out.println("the Book is used to:"+data);
		System.out.println("main method ended");
		
		}




}