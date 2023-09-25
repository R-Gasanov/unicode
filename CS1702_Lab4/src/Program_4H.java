
public class Program_4H {
	public static void main(String args[])
	{
		String month = "February";
		// The variable above is used with the switch case condition, whether or not it matches the string shown below
		int daysinmonth = 0;
						
		switch(month)
		{
			case "January": 
				daysinmonth = 31;
				break;
			case "February":
				daysinmonth = 28;
				// I've edited as "February" and since it matches this variable it will print this out
				break;
			case "March":
				daysinmonth = 31;
				break;
			case "April":
				daysinmonth = 30;
				break;
			case "May":
				daysinmonth = 31;
				break;
			case "June":
				daysinmonth = 30;
				break;
			case "July":
				daysinmonth = 31;
				break;
			case "August":
				daysinmonth = 31;
				break;
			case "September":
				daysinmonth = 30;
				break;
			case "October":
				daysinmonth = 31;
				break;
			case "November":
				daysinmonth = 30;
				break;
			case "December":
				daysinmonth = 31;
				break;
			default: 
				daysinmonth = -1;
				break;
				// If it does not suit any of the months specifically then it will go to the default and print -1
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);
		// It will print out the month listed and use the specific case enlisted from the switch that matches the requirements
	}

}
