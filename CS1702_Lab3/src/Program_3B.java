
public class Program_3B {
	// The purpose he is to test reserved words and to determine whether they are reserved or invalid
	public static void main(String args[])
	{
		//int for = 12;
		//System.out.println(for);
		// Result -> Invalid Variable since its reserved
		
		String four = "Valid variable four";
		System.out.println(four);
		// Result -> four appears to be a valid variable 
		
		//4 = 12;
		//System.out.println(4);
		// Result -> can't have a integer as a variable, its invalid
		
		//int 4x = 12;
		//System.out.println(4x);
		// Result -> It appears you can't use any integer to state a variable
		
		String x_4b = "Valid variable x_4b";
		System.out.println(x_4b);
		// Result -> It appears if you enter a character first, the variable is valid with integers
		
		//String while = "12";
		// Its a Reserved word the test isn't required since it'll be the same as for
		
		String While = "Valid variable While";
		System.out.println(While);
		// Result, although spelt the same as a reserved word its not the exact same meaning it can be used
		
		// For switch and Switch it'll be the same result as While and while, with the capital version applicable
		
		String Switch = "Valid variable Switch";
		System.out.println(Switch);
		// Result -> As shown it works just like While
		
		String $witch = "Valid variable $witch";
		System.out.println($witch);
		
		// String switch23 = "Valid variable switch23";
		// System.out.println(switch23);
		// Result -> The variable shown won't work since it still has the reserved word in the variable
		
		// variables package, throw, new and class are reserved words
		
		String name = "Valid variable name";
		System.out.println(name);
		// Result -> It is not a reserved word thus usable
		
		String friends = "Valid variable friends";
		System.out.println(friends);
		// Result -> It is not a reserved word thus usable
		
		String object = "Valid variable object";
		System.out.println(object);
		// Result -> It is not a reserved word thus usable
		
		String student = "Valid variable student";
		System.out.println(student);
		// Result -> It is not a reserved word thus usable
		
		String day = "Valid variable day";
		System.out.println(day);
		// Result -> It is not a reserved word thus usable
		
		String date = "Valid variable date";
		System.out.println(date);
		// Result -> It is not a reserved word thus usable
		
		String time = "Valid variable time";
		System.out.println(time);
		// Result -> It is not a reserved word thus usable
		
		String month = "Valid variable month";
		System.out.println(month);
		// Result -> It is not a reserved word thus usable
		
		String year = "Valid variable year";
		System.out.println(year);
		// Result -> It is not a reserved word thus usable
		
		String age = "Valid variable age";
		System.out.println(age);
		// Result -> It is not a reserved word thus usable
		
		String height = "Valid variable height";
		System.out.println(height);
		// Result -> It is not a reserved word thus usable
		
		String weight = "Valid variable weight";
		System.out.println(weight);
		// Result -> It is not a reserved word thus usable
		
		// String 17beans = "Valid variable 17beans";
		// Result -> As prior said, you can't state a variable when it begins with an integer
		
		String beans17 = "Valid variable beans17";
		System.out.println(beans17);
		// Result -> It is not a reserved word thus usable
		
		String note = "Valid variable note";
		System.out.println(note);
		// Result -> It is not a reserved word thus usable
		
		String x___ = "Valid variable x___";
		System.out.println(x___);
		// Result -> It is not a reserved word thus usable
	}
}
