package com.devopsdemo.samplerestapp;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
		
	}
	
	public int substract(int a,int b) {
		return a-b;
		
	}
	
	public int multiply(int a,int b) {
		return a+b;
		
	}
	
	public int divide(int a,int b) {
		return a/b;
		
	}
	
	
	public static void main(String []args) {
		Calculator calculator =  new Calculator();
		System.out.println("addition of 3 & 5 is "+ calculator.add(3, 5));
	}

}
