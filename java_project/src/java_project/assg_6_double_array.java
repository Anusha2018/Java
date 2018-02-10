package java_project;

public class assg_6_double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[][]=new int[4][4];

x[0][0]= 11;
x[0][1]= 12;
x[0][2]= 13;
x[0][3]= 14;

x[1][0]=21;
x[1][1]=22;
x[1][2]= 23;
x[1][3]= 24;

x[2][0]= 31;
x[2][1]= 32;
x[2][2]= 33;
x[2][3]= 34;

x[3][0]= 41;
x[3][1]= 42;
x[3][2]= 43;
x[3][3]= 44;

System.out.println(x[3][2]);

int rows=x.length;
int cols=x[0].length;

for(int rownum=0; rownum<rows; rownum++) {
	
	for(int colnum=0; colnum<cols; colnum++) {
		
		System.out.println(x[rownum][colnum]);
	}
}

	}

}
