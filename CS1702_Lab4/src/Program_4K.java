
public class Program_4K {
	public static void main(String args[])
	{
		int x = 100, y = 204;
		boolean a = true, b = false;
		boolean answer;
		double z = -23.1, c = -204;
		// Here we are using the ?: Notation to see whether or not it is a more faster option
		answer = (x < y) ? true: false;
		System.out.println("x < y is "+ answer);
		// Above is shown the relative usabilities and efficency of the notion
		System.out.println("");
		answer = (x > z && a == b) ? true: false;
		System.out.println("x > z and a = b is "+ answer);
		// Result -> a is true and b is false thus meaning they are not equal which is false
		System.out.println("");
		answer =  (2*c > y) ? true: false;
		System.out.println("2c > y is "+ answer);
		// Result -> Is true since c would be -408 which is < than 204
		System.out.println("");
		/*
		answer = (x == b) ? true: false;
		System.out.println("x = b "+ answer);
		Result -> You can't use a boolean operator with an integer otherwise it would be invalid
		*/
		answer = (c != y | c == y) ? true: false;
		System.out.println("c != y or c = y is "+ answer);
		// Result -> The outcome will be true since it can either equal or not
		System.out.println("");
		/*
		answer = (z != y & c == a) ? true: false;
		System.out.println("x != y And c = a is",+ answer)
		Result -> You can't compare a double with a boolean thus its invalid in principle
		System.out.println("");
		answer = (y >= y & (a+3)!=2) ? true: false;		
		System.out.println("y >= y and a+3 !=2",+ answer)
		Result -> Overall we managed to shorten the entire program by more than half whilst still having the same output
		*/
		
	}

}
