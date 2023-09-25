
public class Program_4D {
	public static void main(String args[])
	{
		String name1 = "Claire", name2 = "Sophie", name3 = "Zako";
		int slot1 = name1.compareTo(name2);
		int slot2 = name2.compareTo(name3);
		if (slot1 < 0 & slot2 < 0)
		{
			System.out.println("[1] Heres the names organised alphabetically;");
			System.out.println(name1 + ", " + name2 + ", "+ name3);
		}
		int slot3 = name1.compareTo(name3);
		int slot4 = name3.compareTo(name2);
		if (slot3 < 0 & slot4 < 0)
		{
			System.out.println("[2] Heres the names organised alphabetically;");
			System.out.println(name1 + ", " + name3 + ", "+ name2);
		}
		int slot5 = name2.compareTo(name3);
		int slot6 = name3.compareTo(name1);
		if (slot5 < 0 & slot6 < 0)
		{
			System.out.println("[3] Heres the names organised alphabetically;");
			System.out.println(name2 + ", " + name3 + ", "+ name1);
		}
		int slot7 = name2.compareTo(name1);
		int slot8 = name1.compareTo(name3);
		if (slot7 < 0 & slot8 < 0)
		{
			System.out.println("[4] Heres the names organised alphabetically;");
			System.out.println(name2 + ", " + name1 + ", "+ name3);
		}
		int slot9 = name3.compareTo(name2);
		int slot10 = name2.compareTo(name1);
		if (slot9 < 0 & slot10 < 0)
		{
			System.out.println("[5] Heres the names organised alphabetically;");
			System.out.println(name3 + ", " + name2 + ", "+ name1);
		}
		int slot11 = name3.compareTo(name1);
		int slot12 = name1.compareTo(name2);
		if (slot11 < 0 & slot12 < 0)
		{
			System.out.println("[5] Heres the names organised alphabetically;");
			System.out.println(name3 + ", " + name1 + ", "+ name2);
		}
		// Result -> All the possibilities of the values in an alphabetical format 
	}

}
