package java_project;

public class for_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j=0, k=0;
		
		// consider this as for loop 1
		for( i=1;i<5;i+=2)
			
		{
			// consider this as for loop 2
			for( j=1; j<10; j+=5)
				//
			{
				 k=i+j;
				 System.out.println(i + "+" + j + "=" + k);
				 // This is printing whatever is in both the for loops as it comes inside the both
			}
			 //System.out.println(i + "+" + j + "=" + k);
			//if you give to print here, it will consider looping only for loop 1
			//as this comes only under the for1 and is not inside the for2
			// and it will only take the value of j(which will exceeded the condition and come out)
			
		}
		
		//if you give to print here, as it is out of both for1 and for 2,
		//it will only take the value of i & j after it satisfy the condition and come out.
		
		
		
	}

}
