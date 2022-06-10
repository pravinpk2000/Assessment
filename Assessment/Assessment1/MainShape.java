package com.javatraining.test;



public class MainShape {
	public static void main(String[] args) {

		Shape s1 = new CircleShape(4);
		s1.getArea();
		s1.printInfo();
		
        Shape s2= new Rectangle(23,45);
		s2.getArea();
		s2.printInfo();
		
		Shape s3 = new Triangle(20, 30);
		s3.getArea();
		s3.printInfo();
		}


}
