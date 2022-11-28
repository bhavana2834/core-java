class OdiBowlers{

	static String bowlerNames[] = {"M Muralitharan"," Wasim Akram","Waqar Younis","Chaminda Vaas","Shahid Afridi"};
	static int wickets[] = {534 ,502,416,400,395};
	
	public static void main(String a[]){
	
	getbowlersNames();
	// System.out.println("Men's top 5 Odibowlers" );
	//System.out.println(bowlerNames[0]+" "+bowlerNames[1]+" "+bowlerNames[2]+" "+bowlerNames[3]+" "+bowlerNames[4]);
	
	//System.out.println("No of Wickets ");
	//System.out.println(wickets[0]+" "+wickets[1]+" "+wickets[2]+" "+wickets[3]+" "+wickets[4]);

}

      public static void getbowlerNames(){
		System.out.println("getbowlerNames method is started");
		for(int i = 0; i< bowlerNames.length ; i++){
		System.out.println(bowlerNames[i]);
	    }
		System.out.println("getbowlerNames method is ended");
		}
}