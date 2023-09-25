import java.util.ArrayList;

public class Test_K {
	public static void main(String args[])
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		int comp1,comp2;
		int N = 3;
		if (N > 0)
		{
			for(comp1=1;comp1<N;++comp1)
			{
				for(comp2=1;comp2<N;++comp2)
				{
					num.add(comp1);
				}
				
			}
			num.add(N);
			System.out.println(num);
		}
		else
		{
			System.out.println(num);
		}
	}
}
