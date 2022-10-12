package com.xworkz.copy.boot;

import com.xworkz.copy.object.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette cigaretteData;
		cigaretteData=new Cigarette ();
		System.out.println(cigaretteData.color);
		System.out.println(cigaretteData.brand);
		System.out.println(cigaretteData.smell);
		System.out.println(cigaretteData.shopName);
		System.out.println(cigaretteData.shopeownerName);
		System.out.println(cigaretteData.price);
		System.out.println(cigaretteData.founder);
		System.out.println(cigaretteData.manfacturer);
		System.out.println(cigaretteData.companyName);
		
		cigaretteData.name="king";
		 System.out.println(cigaretteData.name);
		 cigaretteData.manfactureDate="23/Apirl/2022";
		 System.out.println(cigaretteData.manfactureDate);
		 cigaretteData.flavour="Tabacco";
		 System.out.println(cigaretteData.flavour);
		 cigaretteData.type="Hook";
		 System.out.println(cigaretteData.type);
		 cigaretteData.quantity=30;
		 System.out.println(cigaretteData.quantity);
		 cigaretteData.quality=false;
		 System.out.println(cigaretteData.quality);
		 cigaretteData.expireyDate="24/March/2023";
		 System.out.println(cigaretteData.expireyDate);
		 cigaretteData.taste=false;
		 System.out.println(cigaretteData.taste);
		 cigaretteData.country="india";
		 System.out.println(cigaretteData.country);
		
		
		
		
		
		
		
		
		

	}

}
