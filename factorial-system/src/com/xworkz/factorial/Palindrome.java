package com.xworkz.factorial;

import java.util.Scanner;

public class Palindrome {
	 public static void main(String[] args) {
         
        
		 String A = "madam" ;
         String rev=""; 
          
          
        char ch[]=A.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
        		
         rev=rev+A.charAt(i);
         
        }
         if(A.equals(rev)){
        	 
         System.out.print("string is a palindrome");
         }else{
         System.out.println("string is not a palindrome");
     
         }
      }                
}
