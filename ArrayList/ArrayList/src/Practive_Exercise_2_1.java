import java.util.*;

public class Practive_Exercise_2_1
{

	public static void main(String[] args) 
	{
		LinkedList<String> List = new LinkedList<String>();
		List.add("It");
		List.add("was");
		List.add("a");
		List.add("stormy");
		List.add("night");
		for (String x:List)
		{
			System.out.print(x + " ");	
		}
		System.out.println("Size of array: " +List.size());
		
		List.add(3, "dark");
		List.add(4, "and");
		for (int i = 0; i < List.size(); i++)
		{
			System.out.print(List.get(i) + " ");
		}
		System.out.println("Size of array: " +List.size());
		
		List.add("again");
		for (int i=0; i < List.size(); i++)
		{
			System.out.print(List.get(i) + " ");
		}
		System.out.println("Size of array: " +List.size());
		
		List.remove("again");
		for (int i=0; i < List.size(); i++)
		{
			System.out.print(List.get(i)+ " ");
		}
		System.out.println("Size of array: " +List.size());
	}
}
