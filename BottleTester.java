class BottleTester{

		public static void main(String bottle[]){
		
		TupperwareBottle tupperWareBottle = new TupperwareBottle();
		
		tupperWareBottle.color="blue";
		tupperWareBottle.shape="cylinderical";
		tupperWareBottle.price=99.00;
		tupperWareBottle.type="metal";
		
		System.out.println(tupperWareBottle.color +" " +tupperWareBottle.shape+" "+tupperWareBottle.price+" "+tupperWareBottle.type);
		
		TupperwareBottle bottle1 = new TupperwareBottle();
		bottle1.color="purple";
		bottle1.shape="Rectangle";
		bottle1.price=78.00;
		bottle1.type="Plastic";
		
		System.out.println(bottle1.color + " " + bottle1.shape + " " + bottle1.price + " " + bottle1.type);
		
		TupperwareBottle tupperWare = new TupperwareBottle();
		tupperWare.color =  "green";
		tupperWare.shape = "Square";
		tupperWare.price = 345.00;
		tupperWare.type = "tupperware";
		
		System.out.println(tupperWare.color + " " + tupperWare.shape + " "+ tupperWare.price + " "+ tupperWare.type);
		
		
		
		
		}



}