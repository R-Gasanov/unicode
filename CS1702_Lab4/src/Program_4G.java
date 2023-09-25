
public class Program_4G {
	public static void main(String args[])
	{
		double num = 12;
		double original = num;
		if (num >0)
		{
			// The two lines of codes are doing the computational math to see whether or not they are operable
			num = num/2;
			num = num/3;
			// Below is the code checking whether or not it stays as a whole number and does not convert into a boolean
			if (num == (int)num)
			{
				num = ((num*2)*3); // Here we are reseting the values back to its original value 
				num = num/5;
				if (num != (int)num)
				{
					System.out.println("Num 1 is divisable by 3 & 2 and is not divisable by 5. The original number is... "+ original);
				}
				else
				{
					System.out.println("Num 1 is divisable by 5 which is not what we want. The original number is... "+ original);
				}
			}
			else
			{
				System.out.println("Num 1 is NOT divisable by 3 & 2. The original number is... "+ original);
			}
		}
		else
		{
			System.out.println("Num 1 is not above 0"+ original);
		}
	}
}
