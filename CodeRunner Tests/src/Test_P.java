
public class Test_P {
	public static void main(String args[])
	{
		Short inp_short = inp_user;
		Integer num = inp_short.intValue();
		int multi = num;
		int fact = num - 1;
		
		
		for (int index = 1; index < multi	; ++index)
		{
			num = num * fact;
			fact = fact - 1;
		}
		short result = num.shortValue();
		System.out.println(result);
		
		
		
	}
	

}
