package java_project;

public class Single_array_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//States in USA
		String State[]=new String[8];
		
		State[0]="Texas";
		State[1]="California";
		State[2]="Nevada";
		State[3]="Oklahoma";
		State[4]="Arkansas";
		State[5]="New Mexico";
		State[6]="Florida";
		State[7]="Colorado";
		
		System.out.println("States in USA:");
		int row=State.length;
		for(int rownum=0; rownum<row; rownum++)
		{
			System.out.println(State[rownum]);
		}
		

	}

}
