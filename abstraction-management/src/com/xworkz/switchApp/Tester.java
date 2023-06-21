package com.xworkz.switchApp;

public class Tester {
              public static void main(String arg[]) {
            	  System.out.println("main method started");
            	  try {
			Class cls  = Class.forName("com.xworkz.switchApp.Tester");
					System.out.println(cls);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	  
            	  
            	  System.out.println("main method ended");  
            	  
            	  
              }
              
              
              
              
              
}
