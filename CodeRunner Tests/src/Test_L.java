import java.util.ArrayList;

public class Test_L {
	public static ArrayList<Integer> MakeSequenceAL(int N){
		ArrayList<Integer> num = new ArrayList<Integer>();
		int comp1,comp2, comp3;
		comp3 = N;
		if (N < 1)
		{
			return num;
		}
		else
		{
			for(comp1=1;comp1<N;++comp1)
			{
				for(comp2=1;comp2<comp3+1;++comp2)
				{
					num.add(comp1);
				}
				comp3 = comp3-1;
				
			}
			num.add(N);
			return num;
		}
	}
	public static void main(String[] args) {
	    System.out.println(MakeSequenceAL(7));
	  }
	

}
