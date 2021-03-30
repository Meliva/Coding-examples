import java.util.*;

public class TestLinkedList
{
	public static void main(String[] args) 
	{
		List<Integer> List = new ArrayList<Integer>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(1);
		List.add(4);
		List.add(0, 10);
		List.add(3, 30);

		System.out.println("A list of integers in the array list: ");
		System.out.println(List);

		LinkedList<Object> Linked = new LinkedList<Object>(List);
		Linked.add(1, "red");
		Linked.removeLast();
		Linked.addFirst("green");

		System.out.println("Display the linked list :");
		for (int i = 0; i < Linked.size(); i++)
		{
			System.out.print(Linked.get(i) + " ");
		}
		System.out.println("\nDisplay the linked list backwards: ");
		for  (int i = Linked.size() -1; i >=0; i--)
		{
			System.out.print(Linked.get(i) + " ");
		}
	}
}
