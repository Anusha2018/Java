package java_project;

public class local_and_global_variable {
	static int c=6000; // This is a global variable and can be used in any function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary();
	}
		
public static void salary() // This is a local variable and can be used only to this function
{
	int a=7000;
	System.out.println(a);
	System.out.println(a+c);
	
	
}

	}
