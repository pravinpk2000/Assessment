package com.vastpro.Todaytest;

public class Carmain {

	public static void main(String[] args) {
		
		DemoCar dc = new DemoCar("Audi", "A62012",454);
		dc.setCarname("benz");
		dc.setModel("maruthi");
		dc.setNumber(456);
		
		System.out.println(dc.getCounterMethod());

	}

}
