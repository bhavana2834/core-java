package com.xworkz.factorial;

public class Matrices {
              //two square braces for declaration of the 2dimensional array.
	        public static void main(String arg[]) {
	              int twod[][]= {{12,2,4,5,9,5,9},{12,3,6,4,3}};
	             // int temp=0;
	              
	              for(int i=0;i<2;i++) {
	            	  
	            	  System.out.println("the length of array:"+twod[i].length);
	            	  for(int j=0;j<5;j++) {
	            		  System.out.println(twod[i][j]*twod[i][j]);
	            		//multi[i][j]=0; 
	            		  
	            	  }
	            	  
	              }
	
}
}