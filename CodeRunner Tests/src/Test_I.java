
public class Test_I {
	public static void main(String args[])
	{
		int N, comp;
		String answer = "";
		N = -1;
		if (N >= 0)
		{
			while(N != 0)
			{
				
				for(comp=1;comp<N+1;++comp)
				{
					answer = answer + N + "";
					
				}
				--N;
			}
			System.out.println(answer);
		}
		else
		{
			System.out.println("Oh well");
		}
	}

}
