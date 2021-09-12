package com.columbushs.unit2;

public class Unit2_6ExternalStrings {
	
	public void litteralsAndObjectStrings() {
		
		//Difference between string @literal and string objects.
		String litteral1 = "Bob Smith";
		String objectInstance1 = new String("John Weston");
		String objectInstance2 = new String(litteral1);
		
		System.out.println(litteral1);
		System.out.println(objectInstance1);
		System.out.println(objectInstance2);

	}
	
	public void concatinatingStrings() {
		
		// + joins, 
		//+= joins and redefines
		String litteral1 = "Bob Smith";
		String objectInstance1 = new String("John Weston");
		String objectInstance2 = new String(litteral1);
		int bobsAge = 57;
		int johnsAge = 17;
		//here we can add the int and it is recast as a string
		String bobInfo = litteral1 + " is " + bobsAge;
		objectInstance1 += johnsAge;
		
		System.out.println(bobInfo);
		System.out.println(objectInstance1);
		
	}
	
}
