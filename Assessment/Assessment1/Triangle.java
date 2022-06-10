package com.javatraining.test;

public class Triangle extends Shape {
	int breadth;
	int height;
	double area;
	
	public Triangle(int breadth, int height) {
	
		this.breadth = breadth;
		this.height = height;
	}
	
	public double getArea() {
		
		return area = 0.5*breadth*height;
	}
public void printInfo() {
		
		System.out.println("details of height - "+height);
		System.out.println("details of breadth - "+breadth);
		System.out.println("area of triangle -"+area);
		
	}

}
