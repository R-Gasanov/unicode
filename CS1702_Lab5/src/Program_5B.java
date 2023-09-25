
public class Program_5B {
	public static void main(String args[])
	{
		int num;
		// Below we are using a for loop that will go through a cycle of the numbers from 1 - 100
		for (num = 1; num < 101;++ num)
			
		{
			double calculation = Double.valueOf(num);
			double div9 = calculation/9;
			double div7 = calculation/7;
			if ((div9 == (int)div9) || (div7 == (int)div7)) 
			{
				System.out.println("The value is divisble by either multiples of 7 or 9. The original number is... "+ num);
				System.out.println("------------------------------------------------------------------------------------");
			}
			else
			{
				System.out.println("The value is NOT divisble by either multiples of 7 or 9.  The original number is... "+ num);
				System.out.println("-----------------------------------------------------------------------------------------");
			}
		}
	}
}