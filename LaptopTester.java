class LaptopTester{

		public static void main(String a[]){
		
		Laptop web =new Laptop();
		web.color="black";
		web.brand ="dell";
		web.price =27777.00;
		web.type ="metal";
		
		System.out.println(web.color + " " + web.brand + " " + web.price + " " + web.type );
		
	    Laptop games=new Laptop();
		games.color="grey";
		games.brand ="acer123";
		games.price =65446.00;
		games.type ="plastic";
		
		System.out.println(games.color + " " + games.brand + " " + games.price + " " + games.type );
		
		Laptop multiMedia =new Laptop();
		multiMedia.color="black";
	    multiMedia.brand ="lenovo";
		multiMedia.price =34788.00;
		multiMedia.type ="metal";
		
		System.out.println(multiMedia.color + " " + multiMedia.brand + " " + multiMedia.price + " " + multiMedia.type );
		
		Laptop storing=new Laptop();
		storing.color="black";
		storing.brand ="hp";
		storing.price =20000.00;
		storing.type ="plastic";
		
		System.out.println(storing.color + " " + storing.brand + " " + storing.price + " " +storing.type );
		
		Laptop collection = new Laptop();
		collection.color="cement ";
		collection.brand ="apple";
		collection.price =30000.00;
		collection.type ="plastic";
		
		System.out.println(collection.color + " " + collection.brand + " " + collection.price + " " + collection.type );
		
		}





}