import java.util.Scanner;

public class Practice_Exercise_1_2 
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

		insertionSort(list);
		System.out.print("\nSorted list: ");
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	public static void insertionSort(int[] list)
	{
		for (int i = 1; i < list.length; i++)
		{
			int currentElement = list[i];
			int k;
			for (k = i -1; k >= 0 && list[k] > currentElement; k--)
			{
				list[k + 1] = list[k];
			}
			list[k+1] = currentElement;
		}
	}
}
