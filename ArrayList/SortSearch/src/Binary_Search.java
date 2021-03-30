
public class Binary_Search 
{
	public static void main(String[] args) 
	{
		int [] list = {1, 2, 4, 6, 7, 8, 10};

		int found = binarySearch(list, 4);
		found =+ 1;
		if (found >0)
			System.out.println("4 was found in position " +found);
		else
			System.out.println("Number not found");

		found = binarySearch(list, 3);
		if (found >0)
			System.out.println("4 was found in position " +found);
		else
			System.out.println("Number not found");
	}

	public static int binarySearch(int[] list, int key)
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
