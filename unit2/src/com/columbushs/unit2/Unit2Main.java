package com.columbushs.unit2;

public class Unit2Main {

	public static void main(String[] args) {
//		Unit2_1External externalInstance1 = new Unit2_1External("John",46,3.7);
//		
//		Unit2_1External externalInstance2 = new Unit2_1External("Bob", 0);
//		
//		externalInstance1.printName();
//		externalInstance2.printName();
//		System.out.println(externalInstance1.constName);
		
//		Unit2_3ExternalMessage writingMessage = new Unit2_3ExternalMessage("Sam","Tim");
//		writingMessage.writeMessage();
////		
//		writingMessage.changeWriterToSteve();
//		
//		writingMessage.writeMessage();
		
//		Unit2_5ExternalAverages averages = new Unit2_5ExternalAverages();
//		double average = averages.averageClac(3,2.3,5);
//		System.out.println(average);
		
		Unit2_4ExternalFrog	frogInstance = new Unit2_4ExternalFrog();
		frogInstance.frog();
		frogInstance.frog(13);
		frogInstance.frog("left", 3);
		
	}

}
