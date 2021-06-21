package com.tests;

public class Test {

	public void add(int a) {
		System.out.println("inside add int");
	}
	
	public void add(float a) {
		System.out.println("inside add float");
	}
	
	public void add(double a) {
		System.out.println("inside add double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.add(5.1);
		
	}

}

@interface CustomAnnotation {
	
}

