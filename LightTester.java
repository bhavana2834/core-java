class LightTester{

		public static void main(String a[]){
		
		TubeLight lamp=new TubeLight();
		lamp.color="black";
		lamp.shape ="rectangle";
	    lamp.price =20000.00;
		lamp.voltage ="210 volts";
		
		System.out.println(lamp.color + " " + lamp.voltage + " " + lamp.price + " " + lamp.shape );
		
	    TubeLight switch1=new TubeLight();
		switch1.color="grey";
		switch1.shape ="Square";
		switch1.price =65446.00;
		switch1.voltage="210 volts";
		
		System.out.println(switch1.color + " " + switch1.voltage + " " + switch1.price + " " + switch1.shape );
		
		TubeLight transparent =new TubeLight();
	    transparent.color="black";
	    transparent.shape ="cube";
		transparent.price =34788.00;
	    transparent.voltage ="210 volts";
		
		System.out.println(transparent.color + " " + transparent.voltage+ " " + transparent.price + " " + transparent.shape );
		
		TubeLight florescent=new TubeLight();
	    florescent.color="black";
		florescent.shape ="rectangle";
		florescent.price =20000.00;
		florescent.voltage="210 volts";
		
		System.out.println(florescent.color + " " + florescent.voltage + " " + florescent.price + " " +florescent.shape);
		
		TubeLight light = new TubeLight ();
		light.color="cement ";
		light.shape ="Cube";
		light.price =30000.00;
		light.voltage ="210 volts";
		
		System.out.println(light.color + " " + light.voltage + " " + light.price + " " + light.shape);
		
		}





}