import java.util.Scanner;

public class Practice_Exercise_1_3 
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
		
		bubbleSort(list);
		System.out.print("\nSorted list: ");
		for (int i =0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	public static void bubbleSort(int[] list)
	{
		boolean needNextPass = true;
		
		for (int k = 1; k < list.length && needNextPass; k++)
		{
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++)
			{
				if (list[i] > list[i + 1])
				{
					int temp = list[i];
					list[i] = list[i + 1];
					list[i +1] = temp;
					
					needNextPass = true;
				}
			}
		}
	}
}
