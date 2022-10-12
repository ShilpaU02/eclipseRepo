
package com.xworkz.copy.boot;

import com.xworkz.copy.object.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		Tea teaData;
		teaData=new Tea();
		System.out.println(teaData.color);
		System.out.println(teaData.name);
		System.out.println(teaData.flavour);
		System.out.println(teaData.type);
		System.out.println(teaData.brand);
		System.out.println(teaData.shopName);
		System.out.println(teaData.ownerName);
		
		 teaData.cupType="glass";
		 System.out.println(teaData.cupType);
		 teaData.teaPlantName="Camellia Sinensis";
		 System.out.println(teaData.teaPlantName);
		 teaData.price=120;
		 System.out.println(teaData.price);
		 teaData.taste=true;
		 System.out.println(teaData.taste);
		 teaData.quantity="By Two";
		 System.out.println(teaData.quantity);
		 teaData.founderFatherName="Ramappa";
		 System.out.println(teaData.founderFatherName);
		
		
		
		
		
		

	}

}
