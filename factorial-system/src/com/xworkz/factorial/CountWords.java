package com.xworkz.factorial;

import java.util.Scanner;

public class CountWords {
                    
	public static void main(String arg[]) {
                    	
		
		               Scanner sc= new Scanner(System.in);
		         
                    	System.out.println("enter the name");
                    	String name= sc.next();
                    	//int z=0;
                    	char ch[]= name.toCharArray();
                    	for(int i=0;i<ch.length;i++) {
                    		
                    		int z=0;
                    		for(int j=0;j<ch.length;j++) {
                    			
                    			if(ch[i] == ch[j]) {
                    				
                    				z++;
                    			}
                    			
                    		}
                    		System.out.println(ch[i] + " " +z);
                    	}
                    	
                    	
                    	
                    }
}



