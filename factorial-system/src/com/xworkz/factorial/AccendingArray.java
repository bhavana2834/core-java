package com.xworkz.factorial;

public class AccendingArray {
	   
	    public static void main(String[] args) {        
	            
	          
	        int [] arr = new int [] {37,85,12,45,95,65,30,98,73,20,19};     
	        int accend = 0;    
	            
	        
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	         
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   accend = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = accend;    
	               }     
	            }     
	        }      
	        System.out.println();    
	            
	        
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}    

