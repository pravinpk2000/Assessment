package com.vastpro.Todaytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			File folder=new File("Demo1");
			if(!folder.exists())
				folder.mkdir();
			FileWriter fw = new FileWriter("Demo1/sample2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("this is sample ");
			bw.write(" Have a great after noon ");
			bw.close();
			System.out.println("data saved");
			
			FileReader fr = new FileReader("Demo1/sample2.txt");
		    BufferedReader br = new BufferedReader(fr);
			String str= null;
			
			
		

			while((str = br.readLine())!= null)
			{
				if(str.contains("error")) {
					FileWriter fr1=new FileWriter("Demo1/jacksparrow.txt",true);
					fr1.write(str);
					fr1.close();
					System.out.println("Successfully inserted");
				}
				else {
					System.out.println("not copied");
				}
			}
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
		

	}


