import java.util.*;

public class Practice_Exercise_3_3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> List= new ArrayList<Integer>();
		boolean repeates;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 5 integers");
		int num;

		for(int i=0; i<5;i++) 
		{
			num = scan.nextInt(); 
			List.add(num); 
		} 

		// Display the distinct numbers
		for (int i = 0; i < List.size(); i++) 
			System.out.print(List.get(i) + " ");

		if(hasrepeates(List))
		{
			System.out.println("List has duplicates");
		}
		else
		{
			System.out.println("List has no duplicates");
		}

	}

	//returns true if the given list contains any duplicate elements
	public static boolean hasrepeates(List<Integer> list)
	{
		Set<Integer> set = new HashSet<Integer> (list);
		return set.size() < list.size();
	}

	
}
