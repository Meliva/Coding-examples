import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_Exercise_3_1_1 
{
	public static void main(String[] args)
	{
		int choice;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Integer num;
		
		System.out.print("Enter 5 numbers:");
		for (int i=0;i<5;i++)
		{
			num = input.nextInt();
			myList.add(num);
		}
		do
		{
			System.out.println("\n1. Sort List");
			System.out.println("2. Reverse List");
			System.out.println("3. Shuffle List");
			System.out.println("4. Search for");
			System.out.println("5. Quit\n");

			choice = input.nextInt();
			switch(choice)
			{
				case 1:		Collections.sort(myList);
							System.out.println("Sorted List: " +myList);
							break;
				case 2:		Collections.reverse(myList);
							System.out.println("Reversed List: " +myList);
							break;
				case 3:		Collections.shuffle(myList);
							System.out.println("Shuffled List: " +myList);
							break;
				case 4:		seachFor(myList);
							break;
							
				case 5: 	System.out.println("You are now exiting the program");
							break;
				
				default:	System.out.println("Choice should be between 1 - 5\n");

			}

		}while (choice != 5);

	}
	public static void seachFor(ArrayList<Integer> list)
	{
		int target, found;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number to search for:");
		target = input.nextInt();
		
		found = Collections.binarySearch(list, target);
		if(found >= 0)
		{
			System.out.println("Number found in position: " +(found+1));
		}
		else
		{
			System.out.println("Number not found");
		}
	}
}
