import java.util.*;

public class Linked_LIst_Search 
{

	public static void main(String[] args) 
	{
		String col= "";
		Scanner scan = new Scanner(System.in);
		int location;
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("red");
		linkedlist.add("blue");
		linkedlist.add("green");
		linkedlist.add("pink");
		linkedlist.add("orange");
		linkedlist.add("brown");
		Collections.sort(linkedlist);
		System.out.println("Sorted list is: " +linkedlist);
		System.out.println("Type 'quit' to exit");
		System.out.println("Enter a colour to search for: ");
		col = scan.next();
		while (!col.equalsIgnoreCase("quit"))
		{
			location = Collections.binarySearch(linkedlist, col);
			if(location >= 0)
				System.out.println(col + " was found at the following location: " +location);
			else
				System.out.println(col + " does not exist");
			System.out.println("Enter a colour to seatch for: ");
			col = scan.next();
		}
	}

}
