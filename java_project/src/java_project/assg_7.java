package java_project;

public class assg_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M=75;
		int Sci=7;
		int Eng=0;
		int Soc=55;
		int CS=8;
		int Chem=5;
		double AVG=(M+Sci+Eng+Soc+CS+Chem)/6;
		
		System.out.println("Avg Marks of 01101 Student is " + AVG);
		
		if (AVG<=60 && AVG>40)
		{
			System.out.println("Second Class");
	
		}
		
		if (AVG>60 && AVG<=75)
		{
			System.out.println("First Class");
	
		}
		
if (AVG>75)
{
	System.out.println("First class with distinction");
	}
else if(AVG<40)
{
	System.out.println("Fail");
}


	}

}
