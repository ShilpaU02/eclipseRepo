package com.xworkz.copy.boot;

import com.xworkz.copy.object.Bus;

public class BusRunner {

	public static void main(String[] args) {
		Bus number=new Bus();
		Bus start=new Bus();
		Bus dest=new Bus();
		
		System.out.println(number.busNo);
		System.out.println(start.starting);
		System.out.println(dest.destination);
		
		number.busNo=27;
		start.starting="Davanagere";
		dest.destination="Bellary";
		
		System.out.println(number.busNo);
		System.out.println(start.starting);
		System.out.println(dest.destination);
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
