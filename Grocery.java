class Grocery{

		public int id;
		public String name;
		public String[] location;
		public String ownerName;
		public String[] items;
		
		public Grocery(int id,String name,String[] location,String ownerName,String[] items){
		
		this.id=id;
		this.name=name;
		this.location=location;
		this.ownerName=ownerName;
		this.items=items;
		}
		public void displayDetails(){
		
		System.out.println("Displaying restuarant info");
			System.out.println("The grocery id is"+this.id);
			System.out.println("The grocery name is"+this.name);
			System.out.println("The grocery ownerName is"+this.ownerName);
		    System.out.println("the grocery location   are :");
			for(int index=0;index<location.length;index++){
				System.out.println(location[index]);	
			}
			System.out.println("the grocery items are:");
			for(int index=0;index<items.length;index++){
				System.out.println(items[index]);
			}
		
		}
}