
public class Test_H {
	public static void main(String args[])
	{
		int N, b5;
		String answer = "";
		N = -1;
		while(N != 0)
		{
			
			for(b5=1;b5<N+1;++b5)
			{
				answer = answer + N + "";
				
			}
			--N;
		}
		System.out.println(answer);
		
	}

}
