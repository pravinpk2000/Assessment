package com.javatraining.test;
import java.util.*;

public class CoinToss {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of flip");
		int coin=s.nextInt();
		for(int i=0;i<coin;i++)
		if(Math.random()>0.5) {
			System.out.println("you flipped heads!");
		}
		else {
			System.out.println("you flipped tails!");
		}
	}
	

}
