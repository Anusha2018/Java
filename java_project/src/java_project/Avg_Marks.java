package java_project;

public class Avg_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// CALCULATION OF AVG. MARKS OF A STUDENT
	int M=75;
	int Sci=75;
	int Eng=80;
	int Soc=55;
	int CS=85;
	int Chem=95;
	double AVG=(M+Sci+Eng+Soc+CS+Chem)/6;
	
	System.out.println("Avg Marks of 01101 Student is " + AVG);
	
	if(AVG<60)
	{
		System.out.println("Second Class");
	}
		if(AVG>60 && AVG <75)
		{
			System.out.println("First Class");
		}
		if(AVG>75)
		{
			System.out.println("First Class with Distinction");
		}
	}

}
