package java_project;

public class BMI_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double w=120;
		double h=2;
		double BMI=w/(h*h);	
		
		System.out.println("BMI Calculator");
		System.out.println("BMI is " + BMI);
		
		 if(BMI<18.5)
		 {
			 System.out.println("Result: Underweight");
			 System.out.println("If weight is less than 18.5, BMI: Underweight");
		 }
		 if (BMI>=18.5 && BMI<=24.9)
		 {
			 System.out.println("Result: Normal");
			 System.out.println("If weight is between 18.5 and 24.9, BMI: Normal");
		 }
		 if(BMI>=25 && BMI<=29)
		 {
			 System.out.println("Result: Overweight");
			 System.out.println("If weight is between 25 to 29, BMI: Overweight");
		 }
		 if(BMI>=30)
		 {
			 System.out.println("Result: Obse");
			 System.out.println("If weight is more than 30, BMI: Obse");
		 }
		 
			 
		 
			 
			 
		 
		
		
		

	}

}
