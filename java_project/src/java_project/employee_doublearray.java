package java_project;

public class employee_doublearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Employee[][]= new String[4][4];
		
Employee[0][0]="SL.NO";
Employee[0][1]= "LASTNAME ";
Employee[0][2]= "FIRSTNAME";
Employee[0][3]= "DOB";

Employee[1][0]= "001";
Employee[1][1]= "  Enstine";
Employee[1][2]= "  Albert";
Employee[1][3]= "  02-04";


Employee[2][0]= "002";
Employee[2][1]= "  Edision";
Employee[2][2]= "  Thomas";
Employee[2][3]= "  05-08";

Employee[3][0] ="003";
Employee[3][1]="  Hitlor";
Employee[3][2]="  Adlof";
Employee[3][3]="  04-03";


int rows=Employee.length;
int cols=Employee[0].length;

for(int rownum=0; rownum<rows; rownum++) {
		
		System.out.println(Employee[rownum][0] +"  " + Employee[rownum][1]+"  " + Employee[rownum][2]+"  " + Employee[rownum][3]);
	}

	}

	private static void ln(String string, String bold) {
		// TODO Auto-generated method stub
		
	}

}
