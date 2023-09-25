
public class Program_4I {
	public static void main(String args[])
	{
		String month = "February";
		// The variable above is used with the switch case condition, whether or not it matches the string shown below
		int daysinmonth = 0;
		switch (month)
		{
				case "January": case "March": case "May": case "July": case "August": case "October": case "December":
						daysinmonth = 31;
						break;
				case "February":
						daysinmonth = 28;
						break;     	
				case "April": case "June": case "September": case "November":
						daysinmonth = 30;
						break;    
				default: 
						daysinmonth = -1;
						break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);
		// Result -> Comparing to the first program this runs exactly the same way except that it is more structured and simplified

	}
}
