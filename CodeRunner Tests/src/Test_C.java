
public class Test_C {
	public static void main(String args[])
	{
		int x = 15;
		boolean answer;
		int comp1, comp2;
		comp1 = x%2;
		comp2 = x%3;
		
		if (comp1 == 0 && comp2 ==0)
		{
			answer = true;
			System.out.println(answer);
		}
		else
		{
			answer = false;
			System.out.println(answer);
		}
	}
}
