package com.xworkz.exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	
	
              public static void main(String create[]) {
            	  System.out.println("main method started");
            	  
            	 // m1();//for main method throw
            	  
            	  
            	  try {  // for handling inside the main
					m1();
				} catch (ClassNotFoundException | IOException | NullPointerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	  System.out.println("main method ended");
              
              }
            	  

			private static void m1() throws ClassNotFoundException ,IOException,NullPointerException{
				
				System.out.println("m1 started");
				m2();
				System.out.println("m1 ended");
			}

			private static void m2() throws ClassNotFoundException ,IOException,NullPointerException{
				
				System.out.println("m2 started");
				m3();
				System.out.println("m2 ended");
				
				
			}

			private static void m3() throws ClassNotFoundException ,IOException,NullPointerException{
				System.out.println("m3 started");
				Class.forName("com.xworkz.exception.CreateFile");
				
				File file= new File("myfile.txt");
				file.createNewFile();
				
				String str=null;
				System.out.println(str.charAt(6));
				System.out.println("m3 ended");
				
			}
			
			 /*
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("main method started");
    	    for(int i=0;i<10;i++) {
    	    	System.out.println("enter the file name");
    	    	File file= new File(sc.next());
    	    	try {
    	   
    	    	file.createNewFile();
    	    	}catch(IOException e) {
    	    		e.printStackTrace();
    	    		
    	    	}
    	    	
    	    	
    	    }
    	  System.out.println("main method ended");
    	  
    	  
      }*/
}
