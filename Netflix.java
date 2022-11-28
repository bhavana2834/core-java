class Netflix{

    static String kannadaWebSeries[]  =  {"Sakath","Minal murali","Kurup","Sooryavamshi","Anatthe","Wild Dog","Mundina Nildana","Govinda Govinda ", "Minchu Murali ", " Nathicharami", " U-Turn ","Ayana","Nishabdan","French Biryani","Dia"};
	
	static String hindiWebSeries[]  =  {"Mismatched","Jamtara - Sabka Number Ayega","Laal Singh Chaddha","Ek Villain Returns","Delhi Crime","HIT: The First Case","Dobaaraa","Plan A Plan B","She","Bard Of Blood","Scared Games","Heyy Khalli Khalli Ankhey","Taj Mahal","Hasmukh","Masaba masaba","Alma Matters"};
	
	static String foriegnWebSeries[]  =  {"Manifest","Lucifer","Money Heist","Stranger Things","Mismatched","Grizzy and the Lemmings","Sex Education","Jamtara - Sabka Number Ayega","Descedent Of the sun","Healer","My Girlfriend Is an Alein","Money Heist","Boys Over Flowers","King","Vincenzo"};

    public static void main(String a[]){
	
	System.out.println("kannada web series are " );
	
	System.out.println("=========-----------");
	// System.out.println(kannadaWebSeries[0]+" "+kannadaWebSeries[1]+" "+kannadaWebSeries[2]+" "+kannadaWebSeries[3]+" "+kannadaWebSeries[4]+" "+kannadaWebSeries[5]+" "+kannadaWebSeries[6]+" "+kannadaWebSeries[7]+" "+kannadaWebSeries[8]+" "+kannadaWebSeries[9]+" "+kannadaWebSeries[10]+" "+kannadaWebSeries[11]+" "+kannadaWebSeries[12]+" "+kannadaWebSeries[13]+" "+kannadaWebSeries[14]);
	
	System.out.println("=========-----------");
	for(int index = 0; index < kannadaWebSeries.length ; index++){
		System.out.println(kannadaWebSeries[index]);
	}
	
	System.out.println("hindi web series are  ");
	
	System.out.println("=========-----------");
	// System.out.println(hindiWebSeries[0]+" "+hindiWebSeries[1]+" "+hindiWebSeries[2]+" "+hindiWebSeries[3]+" "+hindiWebSeries[4]+" "+hindiWebSeries[5]+" "+hindiWebSeries[6]+" "+hindiWebSeries[7]+" "+hindiWebSeries[8]+" "+hindiWebSeries[9]+" "+hindiWebSeries[10]+" "+hindiWebSeries[11]+" "+hindiWebSeries[12]+" "+hindiWebSeries[13]+" "+hindiWebSeries[14]);
	
	System.out.println("=========-----------");
	
	for(int i = 0; i< hindiWebSeries.length ; i++){
		System.out.println(hindiWebSeries[i]);
	}

	System.out.println("foriegn web series are  ");
	
	System.out.println("=========-----------");
	// System.out.println(foriegnWebSeries[0]+" "+foriegnWebSeries[1]+" "+foriegnWebSeries[2]+" "+foriegnWebSeries[3]+" "+foriegnWebSeries[4]+" "+foriegnWebSeries[5]+" "+foriegnWebSeries[6]+" "+foriegnWebSeries[7]+" "+foriegnWebSeries[8]+" "+foriegnWebSeries[9]+" "+foriegnWebSeries[10]+" "+foriegnWebSeries[11]+" "+foriegnWebSeries[12]+" "+foriegnWebSeries[13]+" "+foriegnWebSeries[14]);
	
	for(int j = 0; j < foriegnWebSeries.length ; j++){
		System.out.println(foriegnWebSeries[j]);
	}

}

}