import java.util.Arrays;

public class Program_4C_Plus {
	public static void main(String args[])
	{
		int a = 10, b = -10, c = 3;
		/* One way of stating arrays within their values
		int num[] = new int[3];
		num[0] = a;
		num[1] = b;
		num[2] = c;
		*/
		int[] num = {a, b, c}; // Adding all the values into an array
		Arrays.sort(num);
		// This is used to sort out the arrays
		for(int i=0;i<num.length;i++)
			
		System.out.println(num[i]);
	}
}
