package com.xworkz.copy.boot;

import com.xworkz.copy.object.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistrictCollector name1=new DistrictCollector();
		DistrictCollector age1=new DistrictCollector();
		DistrictCollector district1=new DistrictCollector();
		DistrictCollector batchNo1=new DistrictCollector();
		
		System.out.println(name1.name);
		System.out.println(age1.age);
		System.out.println(district1.district);
		System.out.println(batchNo1.batchNo);
		
		name1.name="Aishu";
		age1.age=35;
		district1.district="Davanagere";
		batchNo1.batchNo=23;
		
		System.out.println(name1.name);
		System.out.println(age1.age);
		System.out.println(district1.district);
		System.out.println(batchNo1.batchNo);
		

	}

}
