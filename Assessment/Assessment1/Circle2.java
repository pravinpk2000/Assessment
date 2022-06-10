package com.javatraining.test;

public class Circle2 {
	static double pi = 3.14;
	int radius1 ;
	int radius2;
	
	double area;

	
	public Circle2(int radius1,int radius2) {
		
		this.radius1 = radius1;
		this.radius2 = radius2;
	}
	
	public double getArea() {
		
		return area = pi*radius1*radius2;
		
		
	}
	
	public void printInfo() {
		
		System.out.println("detail of radius1 -"+radius1);
		System.out.println("detail of radius1 -"+radius2);
		System.out.println("detail of area -"+area);
		
	}

}
