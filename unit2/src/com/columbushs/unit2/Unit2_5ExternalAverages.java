package com.columbushs.unit2;

public class Unit2_5ExternalAverages {
	
	//crate method that takes in two numbers, calculates average and
	//returns a double 
	public double averageClac(double num1, double num2) {
		//crate variable to store the result
		double average = (num1+num2)/2;
		//return the variable
		return average;
	}
	
	public double averageClac(double num1, double num2, double num3) {
		//crate variable to store the result
		double average = (num1+num2+num3)/3;
		//return the variable
		return average;
		
	}
	
	public double averageClac(double... b) {
		int size = b.length;
		double sum = 0;
		for (int i=0; i<size; i++) {
			sum = sum + b[i];
		}
		
		double average = sum/b.length;
		return average;
	}
}
