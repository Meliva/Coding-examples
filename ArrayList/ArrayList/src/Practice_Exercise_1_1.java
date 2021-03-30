import java.util.ArrayList;

public class Practice_Exercise_1_1 
{

	public static void main(String[] args) 
	{
		ArrayList<String> List = new ArrayList<String>();
		List.add("It ");
		List.add("was ");
		List.add("a ");
		List.add("stormy ");
		List.add("night ");
		for (String x:List)
		{
			System.out.print(x);
		}
		System.out.println(" Size of array: " +List.size());
		List.add(3,"dark ");
		List.add(4,"and ");
		for (String x:List)
		{
			System.out.print(x);
		}
		System.out.println(" Size of array: " +List.size());
		List.add("again ");
		for (String x:List)
		{
			System.out.print(x);
		}
		System.out.println(" Size of array: " +List.size());
		List.remove("again ");
		for (String x:List)
		{
			System.out.print(x);
		}
		System.out.println(" Size of array: " +List.size());
	}

}
