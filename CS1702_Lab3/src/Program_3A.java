public class Program_3A {
	// The purpose of this entire code set is to test the boundaries of variables and what we can do with them
	public static void main(String args[])
	// Here we are using a space in order for us to use the class in
	{
		int a = 100;
		double b = 2.3;
		double c = -52.2;
		boolean d = true;
		String e = "I am";
		String f = "a student";
		int g = 0;
		char h = '!';
		final double pi = 3.142;
		String name = "Rafael Gasanov";
		long x;
		double y;
		String z;
		// Here are all of the variables stated within the program
		
		// Below is where we will go through the calculations
		y = a + b;
		// Results -> We added 100 and 2.3 giving us 102.3 which is valid.
		System.out.println("Answer for Question One = "+ y);
		System.out.println("");
		// y = a + d; 
		// Results -> The result here would be invalid since we can't add an integer to a boolean
		System.out.println("Answer for Question Two is Invalid...");
		System.out.println("");
		z = e + f;
		System.out.println("Answer for Question Three = "+ f);
		System.out.println("");
		// Results -> It appears that the variable is replaced rather than added
		y = b*c;
		// Result -> Its possible since they're both the correct data type
		System.out.println("Answer for Question Four = "+ y);
		System.out.println("");
		// pi =22/7;
		// -> It will not work considering that we have stated pi as a constant, which unchangable
		System.out.println("Answer for Question Five is Invalid ");
		System.out.println("");
		// z = name/g;
		// Result -> You can't divide with a variable that isn't a string
		System.out.println("Answer for Question Six is Invalid...");
		System.out.println("");
		// z = c/g;
		// Result -> You can't convert a double from a String even with int values
		System.out.println("Answer for Question Seven is Invalid...");
		System.out.println("");
		x = 10;
		System.out.println("Answer for Question Eight part one = "+ x);
		// Result -> I changed the value of x to 10 and it printed normally since its a long
		x = x*x*x;
		System.out.println("Answer for Question Eight part two = "+ x);
		System.out.println("");
		// Result -> here we are cubing the number, which is possible with the * operator
		z = name + " is " + f + h;
		System.out.println("Answer for Question Nine = "+ z);
		System.out.println("");
		// Result -> Here we are appending z to have each variable added to it to make a sentence
		// y = (name + 10)/(name + h);
		System.out.println("Answer for Question Ten is Invalid... ");
		System.out.println("");
		// Result -> You can't divide strings and due to this an error occurs.
		// x = (a+b)/(d+c);
		// Result -> Can't do a calculation since its with a boolean
		System.out.println("Answer for Question Eleven is Invalid... ");
		System.out.println("");
		y = 100.3;
		y = (y/(a+b))-c;
		// Result -> Since every single value is the correct data type it was able to do the calculation
		System.out.println("Answer for Question Twelve = "+ y);
		System.out.println("");
		// x^= y^+z^;
		System.out.println("Answer for Question Thirteen is Invalid... ");
		System.out.println("");
		// Result -> The output is invalid considering you can't square a string
		// name = "Is " + f - h;
		System.out.println("Answer for Question Fourteen is Invalid... ");
		System.out.println("");
		// Result -> You can't use an operator (-) to take away from another string to the other
		System.out.println("This is pi = "+ pi);
		y = (pi + 1);
		System.out.println("First mathmatical part = "+ y);
		y = y / (pi + 2);
		System.out.println("Second mathmatical part = "+ y);
		y = y / (pi + 3);
		System.out.println("Answer for Question Fifteen = "+ y);
		System.out.println("");
		// Result -> I had to break down the mathematical formula in order for me to understand each process and see if it gave the correct answer
		y = -2;
		java.lang.Math.cbrt(y*y/b);
		System.out.println("Answer for Question Sixteen = "+ y);
		System.out.println("");
		// Result -> I had to import some commands in order to cube root, which is shown on the first line of text
		y = b/g;
		z = y + name;
		System.out.println("Answer for Question Seventeen = "+ z);
		System.out.println("");
		// Result -> Dividing a number by 0 will give you infinity, which is a string which you can add a string
		z = name;
		z = b/g + z;
		System.out.println("Answer for Question Eighteen = "+ z);
		System.out.println("");
		// Result -> Same as seventeen except that we're using the variable z instead of name
		y = -2.3;
		y = a*(y*y) + b*y + c;
		System.out.println("Answer for Question Nineteen = "+ y);
		System.out.println("");
		// Result -> Considering every is the correct data type we were able to go through with the mathematical computation
		// y = y - (a - b)*(b-c)*(c-d);
		System.out.println("Answer for Question Twenty is Invalid... ");
		System.out.println("");
		// Result -> We can't use operators with a boolean to a double, meaning its invalid
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}
	

}
