import java.util.Scanner;

public class Practice_Exercise_2_2 
{
	public static void main(String[] args)
	{
		int[] list = new int[5];
		Scanner scan = new Scanner(System.in);
		int target;
		System.out.print("Enter 5 numbers: " );
		for (int i = 0; i < list.length; i++)
			list[i] = scan.nextInt();
		System.out.print("Enter a number to search for:");
		target = scan.nextInt();
		int found = linearSearch(list,target);
		found += 1;
		if (found > 0)
			System.out.print(target +" was found in position " +found + " total length is " +list.length);
		else
			System.out.print("Number does not exist");
		
	}
	public static int linearSearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length -1;

		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid -1;
			else
				if (key == list[mid])
					return mid;
				else low = mid + 1;
		}
		return -low -1;
	}
}
