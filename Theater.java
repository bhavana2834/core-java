class Theater{

		public int id;
		public String name;
		public int noOfScreens;
		public String[] typesOfScreens;
		
		
		public Theater(int id ,String name ,int noOfScreens ,String[] typesOfScreens){
		
		this.id=id;
		this.name=name;
		this.noOfScreens=noOfScreens;
		this.typesOfScreens=typesOfScreens;
		
		}
		public void displayDetails(){
		
		System.out.println("Displaying Theater info");
			System.out.println("The Theater id is"+this.id);
			System.out.println("The Theater name is"+this.name);
			System.out.println("The Theater noOfScreens is"+this.noOfScreens);
			
			System.out.println("the Theater types of screen are  :");
			for(int index=0;index<typesOfScreens.length;index++){
				System.out.println(typesOfScreens[index]);	
			}
		    
		
		}
}