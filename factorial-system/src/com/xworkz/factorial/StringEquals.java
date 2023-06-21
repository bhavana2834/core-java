package com.xworkz.factorial;

public class StringEquals {

                 
		public static void main(String[] args)
		
		{
			/*String s1 = null;
			String s2 = "HELLO";
			String s3 = new String("HELLO");

			System.out.println(s1 == s2); 
			System.out.println(s1 == s3); 
			System.out.println(s1.equals(s2)); 
			System.out.println(s1.equals(s3));*/
			
			String name="Bhavana";
			String name1="Bhavana Umesh";
			
			
			//char sequence is string
			System.out.println(name.contains(name1));
			
			System.out.println(name.length());
			
			System.out.println(name.indexOf('h'));
			
			// equalsignorecase (it will not consider the case )
			System.out.println(name.equalsIgnoreCase(name1));
			
			//name= name.concat("Umesh");
			System.out.println(name);
			System.out.println(name.substring(4));
			System.out.println(name.substring(0,5));
			
			//mutable: create by new 
			 
			//StringBuffer
			//StringBuilder
		    
			
			System.out.println(name1.replace("Umesh", "Roopa"));
			
			//char at individual character.t
			System.out.println(name.charAt(5));
			
			StringBuffer buffer=new StringBuffer();
			buffer.append("Bhavana").append("Umesh");
			System.out.println(buffer.reverse());
			//System.out.println(buffer);
			
			System.out.println(name.toLowerCase());
			System.out.println(name.toUpperCase());
			System.out.println(name.toCharArray());
			System.out.println(name.trim());
			System.out.println(name.subSequence(4, 6));
			
			
			
			
			
			
		}
		
		
		
	}


