package com.javatraining.test;

public class CircleText {
	
	public CircleText(int radius) {
		super();
		
	}
	
	
	public static void main(String[] args) {
		double sum1 =0;
				double sum2 = 0;
		
		int r[] =new int[100];
		int r1[] =new int[100];
		
		for(int i=0;i<r.length;i++) {
			r[i] = (int)(Math.random() * 10);
			r1[i] = (int)(Math.random() * 10);   //type casting
			Circle c1 = new Circle(r[i]);
			Circle2 c2 = new Circle2(r1[i], r1[i]);
			sum1 = sum1+c1.getArea();
			sum2 =sum2+c2.getArea();
			
			}
		System.out.println(" Sum of area of circle");
		System.out.println(sum1);
		System.out.println(" Sum of area of circle2");
		System.out.println(sum2);
	}
}
