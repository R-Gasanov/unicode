
public class Program_4F {
	public static void main(String args[])
	{
		double num = 63;
		double original = num;
		if (num >0)
		{
			// The two lines of codes are doing the computational math to see whether or not they are operable
			double div9 = num/9;
			double div7 = num/7;
			// Below is the code checking whether or not it stays as a whole number and does not convert into a boolean
			if (div9 == (int)div9) 
			{
				System.out.println("Num 2 is divisble by 9, the number is... "+ original);
			}
			if (div7 == (int)div7)
			{
				System.out.println("Num 2 is divisble by 7, the number is...  "+ original);
			}
			else
			{
				System.out.println("The value is not divisble by either multiples of 7 or 9");
			}
			
		}
		else
		{
			System.out.println("Num 1 is not above 0"+ original);
		}
	}

}
