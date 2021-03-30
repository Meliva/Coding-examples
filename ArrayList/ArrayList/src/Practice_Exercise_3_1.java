import java.util.HashSet;
import java.util.Set;

public class Practice_Exercise_3_1 
{

	public static void main(String[] args) 
	{
        Set<String> Set = new HashSet<String>();   
        Set.add("It");
        Set.add("is");
        Set.add("a"); 
        Set.add("sunny");
        Set.add("day");
        Set.add("and"); 
        Set.add("a");
        Set.add("bright"); 
        Set.add("day");     
        System.out.println("Print All the Objects:");
        System.out.println(Set);
        System.out.println("Size of Set: "+ Set.size());

	}

}
