class RupeeTester{

		public static void main(String a[]){
		
		System.out.println("the main method started");
		
		IndianRupee.noOfLanguages = 15;
		IndianRupee indian = new IndianRupee(1,  "84P32352",  "100 rupees" , 2020 , "paper" , "purple", "Rajan");
		
		System.out.println(indian.indianRuppeesId + " " + indian.noOfLanguages + " " +indian.serialNo + " " + indian.ruppeName + " " + indian.yearOfPrinting + " " + indian.type + " " + indian.color + " " + indian.governorName);
		
		
		IndianRupee indian1 = new IndianRupee(2,  "54T7664", "200 rupees", 2021 , "paper" , "orange","Rajan" );
		System.out.println(indian1.indianRuppeesId + " " + indian1.noOfLanguages + " " +indian1.serialNo + " " + indian1.ruppeName + " " + indian1.yearOfPrinting + " " + indian1.type + " " + indian1.color + " " + indian1.governorName);
		
		IndianRupee indian2 = new IndianRupee(3,  "15P6436", "500 rupees", 2021 ,"paper",  "cement", "Rajan");
		
		System.out.println(indian2.indianRuppeesId + " " + indian2.noOfLanguages + " " + indian2.serialNo + " " + indian2.ruppeName + " " + indian2.yearOfPrinting + " " + indian2.type + " " + indian2.color + " " + indian2.governorName);
		
		IndianRupee indian3 = new IndianRupee(4, "665O7878" , "10 rupees" , 2022 , "paper" ,"cream", "Rajan");
		
		System.out.println(indian3.indianRuppeesId + " " + indian3.noOfLanguages + " " + indian3.serialNo + " " + indian3.ruppeName + " " + indian3.yearOfPrinting + " " + indian3.type + " " + indian3.color + " " + indian3.governorName);
		 
		System.out.println("the main method ended");
		
		
		
		}




}