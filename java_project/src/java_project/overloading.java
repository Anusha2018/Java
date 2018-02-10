package java_project;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(8,9);
		numbers(1,2,3);
	}
		public static void numbers(int a, int b)
		{
			System.out.println(a+b);
		}
		
		public static void numbers(int s, int t, int u)
		{
			System.out.println(s*t*u);
		}
		
	

}
