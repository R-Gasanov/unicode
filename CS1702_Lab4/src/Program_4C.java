
public class Program_4C {
	public static void main(String args[])
	{
		int a = 10, b = -10, c = 3;
		if (a >= b & a >= c & c >= b)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(b + "," + c + ","+ a);
		}
		if (a >= b & a >= c & b >= c)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(c + "," + b + ","+ a);
		}
		if (b >= a & b >= c & c >= a)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(a + "," + c + ","+ b);
		}
		if (b >= a & b >= c & a >= c)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(c + "," + a + ","+ b);
		}
		if (c >= a & c >= b & b >= a)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(a + "," + b + ","+ c);
		}
		if (c >= a & c >= b & b >= a)
		{
			System.out.println("Here are the order of numbers below;");
			System.out.println(b + "," + a + ","+ c);
		}
		// Result -> All of these if statements provide an order depending on each and every possibility there is
	}
}
