class Speaker1Tester{


		public static void main(String a[]){
		
		Speaker1 volume =new Speaker1();
		volume.color="black";
		volume.shape ="rectangle";
		volume.price =20000.00;
		volume.type ="metal";
		
		System.out.println(volume.color + " " + volume.shape + " " + volume.price + " " + volume.type );
		
		Speaker1 connection =new Speaker1();
		connection.color="grey";
		connection.shape ="Square";
		connection.price =65446.00;
		connection.type ="plastic";
		
		System.out.println(connection.color + " " + connection.shape + " " + connection.price + " " + connection.type );
		
		Speaker1 onoroff =new Speaker1();
		onoroff.color="black";
		onoroff.shape ="cube";
		onoroff.price =34788.00;
		onoroff.type ="metal";
		
		System.out.println(onoroff.color + " " + onoroff.shape + " " + onoroff.price + " " + onoroff.type );
		
		Speaker1 battery =new Speaker1();
		battery.color="black";
		battery.shape ="rectangle";
		battery.price =20000.00;
		battery.type ="plastic";
		
		System.out.println(battery.color + " " + battery.shape + " " + battery.price + " " +battery.type );
		
		Speaker1 audio =new Speaker1();
		audio.color="cement ";
		audio.shape ="Cube";
		audio.price =30000.00;
		audio.type ="plastic";
		
		System.out.println(audio.color + " " + audio.shape + " " + audio.price + " " + audio.type );
		}



}