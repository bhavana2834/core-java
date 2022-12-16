class FridgeTester{

		public static void main(String a[]){
		
		Fridge cooler=new Fridge();
		cooler.color="black";
		cooler.shape ="rectangle";
	    cooler.price =35679.00;
		cooler.capacity ="190 ltrs";
		
		System.out.println(cooler.color + " " + cooler.capacity + " " + cooler.price + " " + cooler.type );
		
	    Fridge refrigerator=new Fridge();
		refrigerator.color="grey";
		refrigerator.shape ="Square";
		refrigerator.price =44565.00;
		refrigerator.capacity ="200 ltrs";
		
		System.out.println(refrigerator.color + " " + refrigerator.capacity + " " + refrigerator.price + " " + refrigerator.type );
		
		Fridge coolbox =new Fridge();
	    coolbox.color="black";
	    coolbox.shape ="Rectangle";
		coolbox.price =34788.00;
	    coolbox.capacity ="150 ltrs";
		
		System.out.println(coolbox.color + " " + coolbox.capacity + " " + coolbox.price + " " + coolbox.type );
		
		Fridge icebox=new Fridge();
		icebox.color="black";
		icebox.shape ="rectangle";
		icebox.price =20000.00;
		icebox.capacity ="100 ltrs";
		
		System.out.println(icebox.color + " " + icebox.capacity+ " " + icebox.price + " " +icebox.type );
		
		Fridge coolitem = new Fridge();
		coolitem.color="cement ";
		coolitem.shape ="rectangle";
		coolitem.price =30000.00;
		coolitem.capacity ="150 ltrs";
		
		System.out.println(coolitem.color + " " + coolitem.capacity + " " + coolitem.price + " " + coolitem.type );
		
		}





}