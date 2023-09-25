
public class Test_N {
	public static short HowManyDigitsBeforeF(float Number){
		
		String str_Num = Double.toString(Number);
		// We will be using the split method to cut the string in half
		String[] split_Num = str_Num.split("\\."); //Since the decimal point is a special character it needs the backslashes
		Integer conversion = split_Num[0].length();
		short result = conversion.shortValue(); 
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println(HowManyDigitsBeforeF(123.345678f));
	}

}
