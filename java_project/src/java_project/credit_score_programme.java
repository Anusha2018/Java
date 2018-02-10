package java_project;

public class credit_score_programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int CSR=540;


System.out.println("Credit Score Range");
System.out.println("CSR is "+ CSR);

if(CSR>=750)
{
	
	System.out.println("Excellent Score");
}
if(CSR<=749 && CSR>=700)
{
	System.out.println("Good Score");
}
if(CSR<=699 && CSR>=650)
{
	System.out.println("Fair Score");
}
if(CSR<=649 && CSR>=550)
{
	System.out.println("Poor Score");
}
if(CSR<=549)
{
	System.out.println("Bad Score");
}
	}

}
