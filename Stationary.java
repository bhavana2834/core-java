class Stationary{

		public int id;
		public String name;
		public String[] notebooks;
		public String[] pens;
		public String[] charts;
		
		public Stationary(int id,String name,String[] notebooks,String[] pens,String[] charts){
		
		this.id=id;
		this.name=name;
		this.notebooks=notebooks;
		this.pens=pens;
		this.charts=charts;
		}
		public void displayDetails(){
		
		System.out.println("Displaying restuarant info");
			System.out.println("The Stationaryid is"+this.id);
			System.out.println("The Stationary name is"+this.name);
			System.out.println("The Stationary notebooks are:");
			for(int index=0;index<notebooks.length;index++){
				System.out.println(notebooks[index]);	
			}
		    System.out.println("the Stationary pens are  :");
			for(int index=0;index<pens.length;index++){
				System.out.println(pens[index]);	
			}
			System.out.println("the Stationary chartsare:");
			for(int index=0;index<charts.length;index++){
				System.out.println(charts[index]);
			}
		
		}
}