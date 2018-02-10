package java_project;

public class static_vs_nonstatic {

	int t=600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_vs_nonstatic x= new static_vs_nonstatic();
		//put here whatever the class name is
		x.country();
		x.month();
		System.out.println(x.t);
	}
public void country()
{
	System.out.println("I am from India");
}
public void month()
{
	System.out.println("This is Febraury month");
}
}
