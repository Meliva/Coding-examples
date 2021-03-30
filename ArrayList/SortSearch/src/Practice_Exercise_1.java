import java.util.Scanner;

public class Practice_Exercise_1 
{
	public static void main(String[] args) 
	{
		int[] list = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 5 numbers: " );
		for (int i = 0; i < list.length; i++)
			list[i] = scan.nextInt();
		System.out.print("Unsorted list:");
		for (int i = 0; i < list.length; i++)
		System.out.print(list[i] + " ");
		
		selectionSort(list);
		System.out.print("\nSorted list: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	public static void selectionSort(int[] list)
	{
		
		for (int i =0; i < list.length -1; i++)
		{
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++)
			{
				if (currentMin > list[j])
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}	
}
