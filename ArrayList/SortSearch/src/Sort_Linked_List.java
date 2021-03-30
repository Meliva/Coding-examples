import java.util.*;

public class Sort_Linked_List
{
	public static void main(String[] args) 
	{
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("red");
		linkedlist.add("blue");
		linkedlist.add("green");
		linkedlist.add("pink");
		linkedlist.add("orage");
		linkedlist.add("brown");
		
		System.out.println("unsorted list is: " +linkedlist);
		Collections.sort(linkedlist);
		System.out.println("Sorted list is: " +linkedlist);
		Collections.reverse(linkedlist);
		System.out.println("reverse sorted list is: " +linkedlist);
		Collections.shuffle(linkedlist);
		System.out.println("reverse sorted list is: " +linkedlist);
	}
}
