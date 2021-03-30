import java.util.ArrayList;

public class Practice_Exercise_1_2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n= 0; n<10; n++)
		{
			list.add(2*n);
		}
		
		System.out.print(list);
	}
}
