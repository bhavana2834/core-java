package com.xworkz.factorial;

public class ProductOfArray {
				public static void main(String arg[]) {
					int arr[]=new int[] {4,3,5};
					int product=1;
					
					for(int i=0;i<arr.length;i++) {
						
						product=product+arr[i];
					}
					System.out.println("product of the array:"+product);
					
					
					
				}
}
