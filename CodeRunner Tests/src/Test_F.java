
public class Test_F {
	public static boolean DoSomeTest(int x, int z, int a, int b)
	{
	    if (x>z && a==b)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	    
	}
	public static void main(String[] args) {
	    System.out.println(DoSomeTest(5, 3, 2, 2));
	  }
}
