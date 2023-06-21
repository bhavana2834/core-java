package com.xworkz.shoppingapp.shoppingmall;

import com.xworkz.shoppingapp.shops.Shops;

public class ShoppingMall {
	
	
	Shops shops[];
	int index ;
	
	public ShoppingMall() {
			
	}
	
	public ShoppingMall(int size){
	
	System.out.println("ShoppingMall object is created");
	shops=new Shops[size];
	}
	
	public boolean purchase(Shops shops){
	
	System.out.println("purchase process started");
	boolean isPurchase = false;
	
	
	
	if(shops.getShopsName() != null ){
		
		this.shops[index++] = shops;
		System.out.println("purchase added succesfully");
		
		isPurchase = true;
		
		
	}
	System.out.println("purchase process ended");
	return isPurchase;
	}
	
	
	public  void getShop(){
		System.out.println("list of shops detail");
		for(int ind =0; ind<this.shops.length; ind++){
				System.out.println(shops[ind].getShopsId() + " " +shops[ind].getShopsName() + " " + shops[ind].getNoOfShops() );	
		}	
	}
	
	public Shops getShopsByShopsId(int shopsId) {
		System.out.println("inside getShopsByShopsId method");
		for(int in=0;in<shops.length;in++) {
			if(shops[in].getShopsId()==shopsId) {
				System.out.println("shops id matching.....proceed with data");
				System.out.println(shops[in].getShopsId() + " " +shops[in].getShopsName() + " " + shops[in].getNoOfShops() );				
				return  shops[in];
			}
		}
		return  null;
	}
	public Shops getShopsByShopsName(String shopsName) {
		System.out.println("inside getShopsByShopsId method");
		for(int in=0;in<shops.length;in++) {
			if(shops[in].getShopsName()==shopsName) {
				System.out.println("shops name matching.....proceed with data");
				System.out.println(shops[in].getShopsId() + " " +shops[in].getShopsName() + " " + shops[in].getNoOfShops() );	
				return  shops[in];
			}
		}
		return  null;
	}
	public Shops getShopsByNoOfShops(int noOfShops) {
		System.out.println("inside getShopsByShopsId method");
		for(int in=0;in<shops.length;in++) {
			if(shops[in].getNoOfShops()==noOfShops) {
				System.out.println("no of shops is  matching.....proceed with data");
				System.out.println(shops[in].getShopsId() + " " +shops[in].getShopsName() + " " + shops[in].getNoOfShops() );
				return  shops[in];
			}
		}
		return  null;
	}
	public boolean updateShopsIdByShopsName(int newId , String shopsName) {
		boolean isAgeUpdated = false;
		System.out.println("  updateShopsIdByShopsName is started");
		for(int i=0;i<shops.length;i++) {
			if(shops[i].getShopsName() == shopsName) {
				System.out.println("the current age is "+shops[i].getShopsName());
				shops[i].setShopsName(shopsName)  ;
				System.out.println("the updated age is "+shops[i].getShopsName());
				
			}
		}
		return isAgeUpdated;
		
	}
	
}
