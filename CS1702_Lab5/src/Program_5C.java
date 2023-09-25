
public class Program_5C {
	public static void main(String args[])
	{
		int num;
		// Below we are using a for loop that will go through a cycle of the numbers from 1 - 100
		for (num = 1; num < 101;++ num)
			
		{
			double calculation = Double.valueOf(num);
			double comp2 = calculation/2;
			double comp3 = calculation/3;
			double comp5 = calculation/5;
			if ((comp2 == (int)comp2) && (comp3 == (int)comp3) && (comp5 != (int)comp5))
			{
				System.out.println("The number is divisable by 3 & 2 but NOT by 5. The original number is... "+ num);
				System.out.println("----------------------------------------------------------------------");
			}
			else
			{
				System.out.println("The number is NOT divisable by 3 & 2 or is by 5. The original number is... "+ num);
				System.out.println("----------------------------------------------------------------------");
			}
		}
	}
}