package java_project;

import java.util.Scanner; // important to have this in scanner

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		//hoover mouse over scanner or system,you'll get the information
		
		System.out.println("What is your age");
		
		int n=reader.nextInt();// Ask for integer
		
		System.out.println("I am "+n+ " year old");
		System.out.println("What is your age");
		
		
		String i=reader.next();// Ask for String
		
		System.out.println("I am "+i+ " year old");
		System.out.println("What are you doing");
		
		String k=reader.next();
		
		System.out.println("I am " +k);
	
	
		
	}



}
