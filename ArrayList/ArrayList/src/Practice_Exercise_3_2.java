import java.util.*;

public class Practice_Exercise_3_2 
{
	public static void main(String[] args)
	{
		Set<Integer> Set = new HashSet<Integer>();
		for(int n=0; n<10; n++)
		{
			Set.add(2*n);
		}
		System.out.println("The Set is: " +Set);
	}
}
