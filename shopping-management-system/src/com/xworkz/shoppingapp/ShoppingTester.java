package com.xworkz.shoppingapp;

import java.util.Scanner;


import com.xworkz.shoppingapp.shops.Shops;

import com.xworkz.shoppingapp.shoppingmall.ShoppingMall;

public class ShoppingTester {
       
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		ShoppingMall shoppingMall=new ShoppingMall(size);
		Shops shops=new Shops();
		System.out.println("enter the shopsId");
		int shopsId=sc.nextInt();
		shops.setShopsId(shopsId);
		
		System.out.println("enter the shops name");
		String shopsName=sc.next();
		shops.setShopsName(shopsName);
		
		System.out.println("enter the noOf shops");
		int noOfShops=sc.nextInt();
		shops.setNoOfShops(noOfShops);
		
		System.out.println(shops.getShopsId() + " " +shops.getShopsName() + " " + shops.getNoOfShops() );
		
		 System.out.println("Enter 1 to fetch all the shops");
         System.out.println("Enter 2 to fetch shop id");
         System.out.println("Enter 3 to update id by shops name ");
         
         
          int option = sc.nextInt();
        
          switch(option) {
           case 1: shoppingMall.getShop();
           break;

       case 2: System.out.println("Enter the Id to be fetched");

         int id = sc.nextInt();
         shoppingMall.getShopsByShopsId(id);
        break;
        
        case 3: System.out.println("Enter the updated name");
         int  updateId = sc.nextInt();
         System.out.println("Enter the patient name");
         String shopName = sc.next();
         shoppingMall.updateShopsIdByShopsName(updateId, shopName);
         break;
         }
         sc.close();	
		
	}
}	
		
		
		
		
	/*public static void main(String shops[]){
		
		
		System.out.println("main method started");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		ShoppingMall shoppingMall=new ShoppingMall(size);
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the shops Id");
			int shopsId=scanner.nextInt();
			System.out.println("Enter the screens Name");
			String shopsName=scanner.next();
			System.out.println("Enter the no of screens ");
			int noOfShops=scanner.nextInt();
			
			
	Shops shops=new Shops(shopsId,shopsName,noOfShops);
			ShoppingMall.purchase(shops);	
		}
		
		shoppingMall.getShops();*/
		
	
	

