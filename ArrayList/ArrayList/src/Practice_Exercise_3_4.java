import java.util.*;

public class Practice_Exercise_3_4 
{
	public static void main(String[] args)
	{
		Set<Integer> Set1 = new HashSet<Integer>();
		Set<Integer> Set2 = new HashSet<Integer>();
		int total;
		for(int n=1; n<=10; n++)
		{
			Set1.add(n);
		}
		for(int n=11; n<=20; n++)
		{
			Set2.add(n);
		}
		total = TotalElements(Set1,Set2);
		System.out.println("The first set is: " +Set1.size());
		System.out.println("The second set is: " +Set2.size());
		System.out.println("The combination of set one and two is: " +total);
	}
	public static int TotalElements(Set<Integer>tSet1, Set<Integer>tSet2)
	{
		Set<Integer> com = new HashSet<Integer>(tSet1);
		com.addAll(tSet2);
		return com.size();
	}
}
