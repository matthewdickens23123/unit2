package com.columbushs.unit2;

public class Unit2_8ExternalWrapperClasses {
	
	//integer primitive data type vs objects.
	public void integerClass() {
	
	//primitive data type
	int x = 12;
	System.out.println(x);
	
	//Integer object, wrapper class
	Integer intObject = new Integer(157);
	System.out.println(intObject);
	System.out.println(intObject.compareTo(159)); //1 if lower, 0 if the same, -1 if higher
	System.out.println(intObject.intValue());
	}
	
	
	//double primitive data type vs objects.

	public void doubleClass() {
		
		//primitive data type
		double decimals = 3.45;
		System.out.println(decimals);
		
		//Double object, wrapper class
		Double doubleObject = new Double(45.23);
		System.out.println(doubleObject);
		System.out.println(doubleObject.equals(23.5));
	}
	
}
