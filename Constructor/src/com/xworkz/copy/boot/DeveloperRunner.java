package com.xworkz.copy.boot;

import com.xworkz.copy.object.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {

		Developer name1=new Developer();
		Developer education1=new Developer();
		Developer experience1=new Developer();
		Developer salary1=new Developer();
		Developer company1=new Developer();
		
		System.out.println(name1.name);
		System.out.println(education1.education);
		System.out.println(experience1.experience);
		System.out.println(salary1.salary);
		System.out.println( company1. company);
		
		name1.name="Shilpa";
		education1.education="BE in EEE";
		experience1.experience=1;
        salary1.salary=25000;
        company1. company="Wipro";
		
		System.out.println(name1.name);
		System.out.println(education1.education);
		System.out.println(experience1.experience);
		System.out.println(salary1.salary);
		System.out.println( company1. company);
		

	}

}
