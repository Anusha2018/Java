package java_project;

public class double_array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Destination [][]= new String [4][4];
		
Destination [0][0]= "Arizona";
Destination [0][1]="Tampa";
Destination [0][2]= "Miami";
Destination [0][3]= "California";

Destination [1][0]= "LA";
Destination [1][1]="LV";
Destination [1][2]= "Nevada";
Destination [1][3]= "Colorado";

Destination [2][0]= "Texas";
Destination [2][1]="Oklahomo";
Destination [2][2]= "Arkansas";
Destination [2][3]= "New Mexico";

Destination [3][0]= "Mississippi";
Destination [3][1]="Baltimore";
Destination [3][2]= "Phonix";
Destination [3][3]= "Florida";

//4th row 3rd column

System.out.println(Destination [3][2]);

//arguments for rows and columns

int rows= Destination.length;
int cols= Destination[0].length;

for(int rownum=0; rownum<rows; rownum++) {
	
	for(int colnum=0; colnum<cols; colnum++) {
		
		System.out.println(Destination[rownum][colnum]);
	}
}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}

	

