class Amazon{

	static String kannadaWebSeries[] = {"Tube light ","Ellinda Barthiro Neevella ","Dove Manja ","Kyaabre ","The Other Love story"," First Kiss ","Just Married","Inti Ninna ","Honeymoon","Malgudi Days","Tharle Box ","Nan Hudgi Heroine","Criminal Justice","Rahasya LOka ","Love MocktailS"};
	
	static String hindiWebSeries[] = {"Malgudi Days","Bandish Bandits","Mirzapur","Family Man","The Forgotten Army","BreatheBreathe","Into the Shadows","Guilty MindsInside Edge","Panchayat","Modern Love"," MumbaiAfsos","Made in Heaven","Hostel Daze","Mumbai Diaries 26/11","Pushpavalli "};
	
	static String foriegnWebSeries[] = {"luther","endeavour","doctor Who","good Omens","downton Abbey","gavin And Stacey","the Royal Bodyguard","the Grand Tour","grantchester","absolutely Fabulous","silent Witness","poldark","fleabag","line Of Duty","coupling"};
	
	
	public static void main(String a[]){
	
	System.out.println("kannada web series are " );
	
	for(int index = 0; index < kannadaWebSeries.length ; index++){
		System.out.println(kannadaWebSeries[index]);
	}
	
	
	
	System.out.println("hindi web series are  ");
	System.out.println("=========-----------");
	for(int i = 0; i< hindiWebSeries.length ; i++){
		System.out.println(hindiWebSeries[i]);
	}
	
	System.out.println("foriegn web series are  ");
	System.out.println("=========-----------");
	
	for(int j = 0; j < foriegnWebSeries.length ; j++){
		System.out.println(foriegnWebSeries[j]);
	}

}
}