import java.util.Scanner;

public class GroDis {
private static float cost;
private static float costP;

	public static void main(String[] args) 
	{
		do {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the cost of your groceries or 0 to end program: ");
		cost = input.nextFloat();
	
	    if (cost < 0 && cost < 10)
		{
			System.out.println("No coupon");
		}
		
		else if (cost >= 10 && cost < 60)
		{
			costP = (float) (cost*.08);
			System.out.println("You win a discount coupon of $"+costP+"( 8% of your purchase");
		}
	    
		else if (cost >= 60 && cost < 150)
		{
			costP = (float) (cost*.10);
			System.out.println("You win a discount coupon of $"+costP+"( 10% of your purchase");
		}
		
		else if (cost >= 150 && cost < 210)
		{
			costP = (float) (cost*.08);
			System.out.println("You win a discount coupon of $"+costP+"( 12% of your purchase");
		}
		
		else if (cost > 210)
		{
			costP = (float) (cost*.14);
			System.out.println("You win a discount coupon of $"+costP+"( 14% of your purchase");
		}
	    
		else if (cost == 0)
		{
			System.out.println("End Program");
		}
	} while (cost > 0);
	
	}

}
