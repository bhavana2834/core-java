package com.xworkz.factorial;

public class StringEquals {

                 
		public static void main(String[] args)
		
		{
			String s1 = null;
			String s2 = "HELLO";
			String s3 = new String("HELLO");

			System.out.println(s1 == s2); 
			System.out.println(s1 == s3); 
			System.out.println(s1.equals(s2)); 
			System.out.println(s1.equals(s3));
			
			String name="Bhavana Umesh";
			String name1="Umesh";
			
			
			//char sequence is string
			System.out.println(name.contains(name1));
			
			System.out.println(name.length());
			
			System.out.println(name.indexOf('U'));
			
			// equalsignorecase (it will not consider the case )
			System.out.println(name.equalsIgnoreCase(name1));
			
			name= name.concat("Umesh");
			System.out.println(name);
			System.out.println(name.substring(4));
			System.out.println(name.substring(0,5));
			
			//mutable: create by new 
			 
			//StringBuffer
			//StringBuilder
		
			StringBuffer buffer=new StringBuffer();
			buffer.append("Bhavana").append("Umesh");
			System.out.println(buffer);
		}
		
	}


