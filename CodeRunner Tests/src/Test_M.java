import java.text.DecimalFormat;

public class Test_M {
	public static String ThreeDecimalPlaces(double Number){
		String str_Number = Double.toString(Number);
		String result=  str_Number.format("%1.3f",Number);
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println(ThreeDecimalPlaces(965));
	}

}
