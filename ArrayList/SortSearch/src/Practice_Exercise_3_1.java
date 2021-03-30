import java.util.*;

public class Practice_Exercise_3_1 
{

	public static void main(String[] args)
	{	
		String col= "";
		Scanner scan = new Scanner(System.in);
		int location;
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kate");
		list.add("Jhon");
		list.add("Ben");
		list.add("Dave");
		list.add("Will");
		
		System.out.println(list.get(3));
		System.out.println(list);
		System.out.println("" +list.get(1).compareTo(list.get(2)));
	
		//for (int i =0; i < linkedlist.length; i++)
		//System.out.print(linkedlist[i] + " ");
		//System.out.println("unsorted list is: " +linkedlist);
		//Collections.sort(linkedlist);
		//System.out.println("Sorted list is: " +linkedlist);
		//Collections.reverse(linkedlist);	
		//System.out.println("reverse sorted list is :" +linkedlist);
		//Collections.shuffle(linkedlist);
		//System.out.println("shuffled list is: " +linkedlist);
		//System.out.println("Enter a number to search for: ");
		//col = scan.next();
		//while (!col.equalsIgnoreCase("quit"))
		{
			//location = Collections.binarySearch(linkedlist, col);
			//if(location >= 0)
				//System.out.println(col + " was found at the following location: " +location);
			//else
				//System.out.println(col + " colour does not exist");
			//System.out.println("Enter a colour to seatch for: ");
			//col = scan.next();
		}
	}
}
