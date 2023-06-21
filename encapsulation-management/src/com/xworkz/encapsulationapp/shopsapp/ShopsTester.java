package com.xworkz.encapsulationapp.shopsapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.shopsapp.shops.Shops;


public class ShopsTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
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
	}
}
