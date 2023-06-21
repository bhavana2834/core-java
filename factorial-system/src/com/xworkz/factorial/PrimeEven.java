package com.xworkz.factorial;

import java.util.Scanner;

public class PrimeEven {
	public static void main(String arg[]) {
		
		      
		       
               Scanner sc=new Scanner(System.in);
               
               String answer ="yes";
               do {
               System.out.println("enter 1 to prime number");
               System.out.println("enter the 2 to even  number");
               System.out.println("enter the 3 to odd  number");
               
               
               int  n=sc.nextInt();
               
               switch(n) {
               case 1: System.out.println("enter the prime number");
               
               int n1=sc.nextInt();
               int count=0;
               
               
               for(int i=1;i<=n1;i++) {
            	   
            	   if(n1%i==0) {
            		   count++;
            		   
            	   }
               }
               if(count==2) {
            	   System.out.println("square of prime number");
            	 int   x=n1*n1;
            	   System.out.println(x);
               }
               
               break;
               case 2 :System.out.println("enter even  number");
              int n2=sc.nextInt();
            
            	   
            	   if(n%2==0) {
            		   System.out.println("square  a even number");
            		  int  y=(n2+2)*(n2+2);
            		   System.out.println(y);
            	   }
            	   break;
               case 3:System.out.println("enter the odd number");
               int n3=sc.nextInt();
               if(n3%2!=0)
               {
            		   System.out.println("square  sof odd number");
            		  int  z=(n3-2)*(n3-2);
            		   System.out.println(z);
            		   
            	   }
               break;
               }
              System.out.println("do you want to continue yes or no");
               }while(answer.equals(sc.next()));  
               System.out.println("the main method ended");
               sc.close();
	}
	
}
