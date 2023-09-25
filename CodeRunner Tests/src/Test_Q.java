
public class Test_Q {
	public static short FactorialD(short Number)
	{
		Short inp_short = Number;
		Integer num = inp_short.intValue();
		int multi = num;
		int fact = num - 1;
		short incorrect = -4;
		
		if (Number < 0)
		{
			return (incorrect);
		}
		else if (Number == 0)
		{
			return 1;
		}
		else
		{	
			for (int index = 1; index < multi	; ++index)
			{
				num = num * fact;
				fact = fact - 1;
			}
			short result = num.shortValue();
			return result;	
		}
	}
	public static void main(String[] args) 
	{
		short info = 1;
		System.out.println(FactorialD(info));
	}
	
}
