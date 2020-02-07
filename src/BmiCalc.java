import java.util.*;

public class BmiCalc 
{
	private static float bmi;
	private static float kg;
	private static float meter;
	private static float height;
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
		 float feet;
		 float inches;
		 float weight;
		
		
		 System.out.println("Please enter your height in feet: ");
		 feet = scan.nextFloat();
		 System.out.println("Please enter your height in inches ");
		 inches = scan.nextFloat();
		 System.out.println("Now please enter your weight in pounds: ");
		 weight = scan.nextFloat();
		 
		 height = ((12*feet)+inches);
		 meter = (float) (height/39.37);
		 kg = (float) (weight/2.205);
		 bmi = (float) (kg/(meter*meter));

		 if (bmi < 19.0)
		 {
			

			 System.out.println("Underweight");
		 }
		 
		 else if (bmi >= 19 && bmi < 24.9)
		 {

			 System.out.println("Normal or healthy weight");
		 }
		 
		 else if (bmi >= 25 && bmi <= 29.9)
		 {

			 System.out.println("Overweight");
		 }
		 
		 else if (bmi >= 30 && bmi <= 39.9)
		 {

			 System.out.println("Obese");
		 }
		 
		 else if (bmi >= 40)
		 {

			 System.out.println("Extremely Obese");
		 }
	}

}
