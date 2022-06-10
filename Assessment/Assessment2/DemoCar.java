package com.vastpro.Todaytest;

import java.util.*;

public class DemoCar {
	
      String Carname;
      String model;
      int number;
      static int count=0;
      
      public DemoCar(String Carname,String model,int number)
      {
    	  this.Carname=Carname;
    	  this.model=model;
    	  this.number=number;
      }

	public String getCarname() {
		return Carname;
	}

	public void setCarname(String carname) {
		Carname = carname;
		count++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		DemoCar.count = count;
	}

	@Override
	public String toString() {
		return "DemoCar [Carname=" + Carname + ", model=" + model + "]";
	}
	
	public String getCounterMethod() {
		
		return "count - "+count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Carname, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoCar other = (DemoCar) obj;
		return Objects.equals(Carname, other.Carname) && Objects.equals(model, other.model);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		count++;
	}
      

}
