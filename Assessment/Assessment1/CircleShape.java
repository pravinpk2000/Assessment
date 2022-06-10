package com.javatraining.test;

public class CircleShape extends Shape{
	static double pi = 3.14;
	int radius ;
	double area;

	
	public CircleShape(int radius) {
		
		this.radius = radius;
	}
	
	public double getArea() {
		
		return area = pi*radius*radius;
		
		
	}
	
	public void printInfo() {
		
		System.out.println("detail of radius -"+radius);
		System.out.println("detail of area -"+area);
		
	}

}
