import java.util.ArrayList;

public class Practice_Exercise_1_3 
{

	public static void main(String[] args)
	{
		ArrayList<String> List = new ArrayList<String>();
		List.add("One");
		List.add("Two");
		List.add("Three");
		List.add("Four");
		List.add("Five");
		List.add("Six");
		
		System.out.println("The List is: " +List);
		System.out.println("The new List is: " + newLength(List));
	}
	
	public static ArrayList<String> newLength(ArrayList<String> List)
	{
		int n = 0;
		String Word;
		while (n < List.size())
		{
			Word = List.get(n);
			if(Word.length()%2 ==0)
			{
				List.remove(n);
			}
			else
			{
				n++;
			}
		}
		return List;
	}

}
