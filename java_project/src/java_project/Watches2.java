package java_project;

import java.util.Scanner;

public class Watches2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		
	    int Michael_kor=400;
		int Fossil=150;
		int Seiko=100;
		int casio=70;
		
		
		System.out.println("Which Watch are you looking for?");
		String i=reader.next();
		if(i.equals("Michael_kor"))
		{
		System.out.println("Michael kor, the next generation technology");
			System.out.println("Price of Michael kor watch is " +Michael_kor);
			int a=4+Michael_kor;
			System.out.println("With intrest, total price is "+a);
		}

		if(i.equals("Fossil"))
		{
			System.out.println("Fossil.Looks like a watch, acts like a smart watch");
			System.out.println("Price is " +Fossil);
			int b=4+Fossil;
			System.out.println("With intrest, total price is "+b);
		}
		
		if(i.equals("Seiko"))
		{
			System.out.println("Seiko, always one step ahead of rest");
			System.out.println("Price is " +Seiko);
			int c=4+Seiko;
			System.out.println("With intrest, total price is "+c);
		}
		
		if(i.equals("casio"))
		{
			System.out.println("Casio protrek");
			System.out.println("Price is " +casio);
			int d=4+casio;
			System.out.println("With intrest, total price is "+d);
		}
		
		else
		{
			System.out.println("We dont have this brand");
			
		}
	}

}
