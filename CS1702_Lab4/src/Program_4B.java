
public class Program_4B {
	public static void main(String args[])
	{
		int x = 100, y = 204;
		boolean a = true, b = false;
		double z = -23.1, c = -204;
		// Stating the variables above with the correct data type
		if (x < y) 
		{
			System.out.println("x < y is "+ a);
		}
		else 
		{
			System.out.println("x < y is "+ b);
		}
		// Using a similar format, but now we know that it does indeed work
		System.out.println("");
		if (x > z && a == b)
		{
			System.out.println("x > z and a = b is "+ a);
		}
		else
		{
			System.out.println("x > z and a = b is "+ b);
		}
		// Result -> a is true and b is false thus meaning they are not equal which is false
		System.out.println("");
		if (2*c > y)
		{
			System.out.println("2c > y is "+ a);
		}
		else
		{
			System.out.println("2c > y is "+ b);
		}
		// Result -> Is true since c would be -408 which is < than 204
		System.out.println("");
		/*
		if (x == b)
		{
			System.out.println("x = b "+ a);
		}
		else
		{
			System.out.println("x = b "+ b);
		}
		Result -> You can't use a boolean operator with an integer otherwise it would be invalid
		*/
		if (c != y | c == y)
		{
			System.out.println("c != y or c = y is "+ a);
		}
		else
		{
			System.out.println("c != y or c = y is "+ b);
		}
		// Result -> The outcome will be true since it can either equal or not
		System.out.println("");
		/*
		if (z != y & c == a)
		{
			System.out.println("x != y And c = a is",+ a)
		}
		else
		{
			System.out.println("x != y And c = a is",+ b)
		}
		Result -> You can't compare a double with a boolean thus its invalid in principle
		*/
		/*
		if (y >= y & (a+3)!=2)
		{
			System.out.println("y >= y and a+3 !=2",+ a)
		}
		else
		{
			System.out.println("y >= y and a+3 !=2",+ b)
		}
		*/
	}
}
