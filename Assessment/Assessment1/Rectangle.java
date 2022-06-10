package com.javatraining.test;

public class Rectangle extends Shape {
	int length ;
	int breadth;
	double area;
	
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		
		return area = length*breadth;
		
	}
	public void printInfo() {
		
		System.out.println("details of length - "+length);
		System.out.println("details of breadth - "+breadth);
		System.out.println("area of rectangle -"+area);
		
	}
	

}
