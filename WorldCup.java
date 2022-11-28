class WorldCup{

	static String teamNames[] = {"Australia","India","West Indies","England","Pakistan"};
	static int noOfTimes[] = {5 ,2,2,1,1};
	
	
	public static void main(String a[]){
	
	getteamNames();
	//System.out.println("World Cup Teams " );
	//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]);
	
	//System.out.println("No of times  ");
	//System.out.println(noOfTimes[0]+" "+noOfTimes[1]+" "+noOfTimes[2]+" "+noOfTimes[3]+" "+noOfTimes[4]);

}

        public static void getbowlerNames(){
		System.out.println("getbowlerNames method is started");
		for(int i = 0; i< teamNames.length ; i++){
		System.out.println(teamNames[i]);
	    }
		System.out.println("getbowlerNames method is ended");
		}
}