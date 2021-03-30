import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Intergers (it stops at 0):");
		int value;		
		do
		{
			value = input.nextInt();//Read a value of an input
			if(!list.contains(value) && value != 0)
				list.add(value); //Add the value if it is not in the list
		}while (value != 0);
		// Display the distinct numbers
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
}
