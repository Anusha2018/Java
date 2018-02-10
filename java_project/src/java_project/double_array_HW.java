package java_project;

public class double_array_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String USA[][]=new String[3][2];
		
		USA[0][0]="California";
		USA[0][1]="SFO";
				
		USA[1][0]="Texas";
		USA[1][1]="     Austin";
		
		USA[2][0]="Nevada";
		USA[2][1]="   Carson City";
	
		
		System.out.println("STATE" + "      CAPTIOL");
		int row=USA.length;
		for(int rownum=0; rownum<row; rownum++)
		{
			System.out.println(USA[rownum][0]+" " +USA[rownum][1]);
		}
		

	}

	}
