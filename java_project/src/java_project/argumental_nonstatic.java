package java_project;

public class argumental_nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		argumental_nonstatic i=new argumental_nonstatic();
		i.Sum(5,6);
		i.tables(13, 9);
		i.student("Techfios");
		
	}
		public void Sum(int x, int y) //non static
		{
			System.out.println(x+y);
		}
		public void tables(int s, int t)
		{
			int r=s*t;
			System.out.println("13x9=" + r);
		}
		public void student(String name)
		{
			System.out.println("I am a " +name +" student");
		}
	}

