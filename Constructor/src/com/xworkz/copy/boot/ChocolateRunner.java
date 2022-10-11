package com.xworkz.copy.boot;

import com.xworkz.copy.object.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate name1=new Chocolate();
		Chocolate brand1=new Chocolate();
		Chocolate price1=new Chocolate();
		Chocolate flavour=new Chocolate();
		
		System.out.println(name1.name);
		System.out.println(brand1.brand);
		System.out.println(price1.price);
		System.out.println(flavour.flavour);
		
		name1.name="Dark fantasy";
		brand1.brand="ITC";
		price1.price=150;
		flavour.flavour="chocolate";
		
		System.out.println(name1.name);
		System.out.println(brand1.brand);
		System.out.println(	price1.price);
		System.out.println(flavour.flavour);
		

	}

}
