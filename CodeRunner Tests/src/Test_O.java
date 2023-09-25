
public class Test_O {
	public static short DaysInAMonthC(int Month)
	{
		short[] days_months = {-3, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (Month >= 1 && Month <= 12)
		{
			return days_months[Month];
		}
		else
		{
			return days_months[0];
		}
				
	}
	public static void main(String[] args) 
	{
		System.out.println(DaysInAMonthC(2));
	}
	

}