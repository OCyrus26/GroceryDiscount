import java.util.Scanner;

public class GroDis {
private static float cost;
private static float costP;

	public static void main(String[] args) 
	{
		do {
		Scanner input = new Scanner (System.in);
		System.out.println("Please not to make sure your input is a number and not a letter character "
				+ "or else the program will not recognize your response. ");
		System.out.println("Make sure the cost is less than 1000 and not a negative number");
		
		System.out.println("Enter the cost of your groceries or 0 to end program: ");
		cost = input.nextFloat();
	
	    if (cost >= 1 && cost < 10)
		{
			System.out.println("No coupon");
		}
		
		else if (cost >= 10 && cost < 60)
		{
			costP = (float) (cost*.08);
			System.out.println("You win a discount coupon of $"+costP+" ( 8% of your purchase");
		}
	    
		else if (cost >= 60 && cost < 150)
		{
			costP = (float) (cost*.10);
			System.out.println("You win a discount coupon of $"+costP+" ( 10% of your purchase");
		}
		
		else if (cost >= 150 && cost < 210)
		{
			costP = (float) (cost*.08);
			System.out.println("You win a discount coupon of $"+costP+" ( 12% of your purchase");
		}
		
		else if (cost > 210 && cost <= 1000)
		{
			costP = (float) (cost*.14);
			System.out.println("You win a discount coupon of $"+costP+" ( 14% of your purchase");
		}
	    
		else if (cost == 0)
		{
			System.out.println("End Program");
		}
	    
		else if (cost <= -1 && cost > 1000)
		{
			System.out.print("Error! please enter a response between 0 and 1000 dollars. ");
		}
	} while (cost != 0);
	
	}

}
