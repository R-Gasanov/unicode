
public class Test_G {
	public static String MakeSequence(int N){
	    int comp;
	    String answer = "";
	    if (N >= 0)
	    {
	    	while (N != 0)
		    {
		        for (comp=1;comp<N+1;++comp)
		        {
		            answer = answer + N + "";
		        }
		        --N;
		    }
		    return answer;
	    }
	    else
	    {
	    	return answer;
	    }
	    	
	}
	public static void main(String[] args) 
	{
		System.out.println(MakeSequence(-8));
	}

}
