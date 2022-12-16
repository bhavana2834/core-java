class MobileTester{

		public static void main(String a[]){
		
		Mobile screenTouch=new Mobile();
		System.out.println(screenTouch.color + " " + screenTouch.brand + " " + screenTouch.price + " " + screenTouch.type );
		screenTouch.color="black";
		screenTouch.brand ="vivo";
	    screenTouch.price =24409.00;
		screenTouch.type ="metal";
		
		System.out.println(screenTouch.color + " " + screenTouch.brand + " " + screenTouch.price + " " + screenTouch.type );
		
	    Mobile iphone=new Mobile();
		System.out.println(iphone.color + " " + iphone.brand + " " + iphone.price + " " + iphone.type );
		iphone.color="grey";
		iphone.brand ="iphone";
		iphone.price =65446.00;
		iphone.type ="plastic";
		
		System.out.println(iphone.color + " " + iphone.brand + " " + iphone.price + " " + iphone.type );
		
		Mobile information =new Mobile();
		System.out.println(information.color + " " + information.brand + " " + information.price + " " + information.type );
		
		information.color="black";
	    information.brand ="samsung";
		information.price =34788.00;
	    information.type ="metal";
		
		System.out.println(information.color + " " + information.brand + " " + information.price + " " + information.type );
		
		Mobile chatting=new Mobile();
		System.out.println(chatting.color + " " + chatting.brand + " " + chatting.price + " " +chatting.type );
		chatting.color="black";
		chatting.brand ="redmi";
		chatting.price =20000.00;
		chatting.type ="plastic";
		
		System.out.println(chatting.color + " " + chatting.brand + " " + chatting.price + " " +chatting.type );
		
		Mobile pictures = new Mobile();
		System.out.println(pictures.color + " " + pictures.brand + " " + pictures.price + " " + pictures.type );
		pictures.color="cement ";
		pictures.brand ="karbon";
		pictures.price =30000.00;
		pictures.type ="plastic";
		
		System.out.println(pictures.color + " " + pictures.brand + " " + pictures.price + " " + pictures.type );
		
		}





}