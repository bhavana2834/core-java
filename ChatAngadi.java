class ChatAngadi{

		public int id;
		public String name;
		public String[] chatNames;
		
		
		public ChatAngadi(int id,String name,String[] chatNames){
		
		this.id=id;
		this.name=name;
		this.chatNames=chatNames;
		
		}
		public void displayDetails(){
		
		System.out.println("Displaying restuarant info");
			System.out.println("The chatAngadi id is"+this.id);
			System.out.println("The chatAngadi name is"+this.name);
			System.out.println("The chatAngadi chatnames are:");
			for(int index=0;index<chatNames.length;index++){
				System.out.println(chatNames[index]);	
			}
		    
		
		}
}