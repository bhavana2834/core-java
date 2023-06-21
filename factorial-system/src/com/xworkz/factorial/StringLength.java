package com.xworkz.factorial;



public class StringLength {
       
	    public static void main(String a[]){
		
		String name="Bhavana";
		
		int count=0;

		char ch[]=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
        
		count+=1;
		System.out.println(ch[i]);
		}
		
		System.out.println("length of the string is:"+count);

		}
	    
}






