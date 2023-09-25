
public class Program_4J {
	public static void main(String args[])
	{
		String creature = "Cobra";
		// The variable above is used with the switch case condition, whether or not it matches the string shown below
		int legs = 0;
		switch (creature)
		{
				case "Cobra": case "Cod": case "Paul Allen the German Octopus": case "Mike Whale":
						legs = 0;
						break;
				case "Human": case "Klingon":
						legs = 2;
						break;     	
				case "Alastian Dog": case "Sphynx Cat": case "Baboon": case "Potto":
						legs = 4;
						break;
				case "Tarantula": case "Black Scorpion":
						legs = 8;
						break;
				case "Centipede":
						legs = 30;
				default:		
						legs = -1;
						break;
		}
		System.out.println("The animal " + creature + " has " + legs + " legs.");
		// Result -> Comparing to the first program this runs exactly the same way except that it is more structured and simplified

	}

}
