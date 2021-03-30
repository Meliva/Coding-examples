
public class Linear_Search 
{
	public static void main(String[] args)
	{
		int[] list = {2, 9, 5, 4, 8, 1, 6};

		int found = linearSearch(list, 2);
		found += 1;
		if(found > 0)
			System.out.println("4 was found in position " +found);
		else
			System.out.println("Number not found");
		
		found = linearSearch(list, 3);
		if(found > 0)
			System.out.println("4 was found in position " +found);
		else
			System.out.println("Number not found");
	}
	public static int linearSearch(int[] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (key == list[i])
				return i;
		}
		return -1;
	}
}
