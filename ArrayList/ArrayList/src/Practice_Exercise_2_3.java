import java.util.*;

public class Practice_Exercise_2_3 
{
	public static void main(String[] args)
	{
		LinkedList<String> Linked = new LinkedList<String>();
		Linked.add("One");
		Linked.add("Two");
		Linked.add("Three");
		Linked.add("Four");
		Linked.add("Five");
		Linked.add("Six");
		
		System.out.println("This list is: " +Linked);
		System.out.println("The new list is: " + newLinkedList(Linked));		
		
	}
	public static LinkedList<String> newLinkedList(LinkedList<String> Linked)
	{
		int n = 0;
		String Word;
		while (n < Linked.size())
		{
			Word = Linked.get(n);
			if(Word.length()%2 ==0)
			{
				Linked.remove(n);
			}
			else
			{
				n++;
			}
		}
		return Linked;
	}
}

