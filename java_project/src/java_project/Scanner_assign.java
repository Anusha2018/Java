package java_project;

import java.util.Scanner;

public class Scanner_assign {
	
	public static void main(String[] args) {

	Scanner reader=new Scanner(System.in); // heading
	
	System.out.println("What is your name");
	String i=reader.next(); //reader is input. since reader is there in heading
	
	
	System.out.println("What is your age");
	String j=reader.next();
	
	
	System.out.println("What is your salary");
	String k=reader.next();
	
	
	System.out.println("What is your address");
	String l=reader.next();
	
	
	System.out.println("What is your Zipcode");
	String n=reader.next();
	
	
	System.out.println("My name is " +i);
	System.out.println("My age is " +j);
	System.out.println("My salary is " +k);
	System.out.println("My address is " +l);
	System.out.println("My zipcode is " +n);
	}
	
}
