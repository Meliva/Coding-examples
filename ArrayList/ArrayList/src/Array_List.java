import java.util.ArrayList;

public class Array_List 
{
	public static void main(String[] args) 
	{
		//declaring Array list of String objects
		ArrayList<String> mylist = new ArrayList<String>();
		//Adding objects to Array List at default index
		mylist.add("Collingwood");
		mylist.add("Geelong");
		mylist.add("Richmond");
		mylist.add("Sydeny");
		//Adding object to Array List at default index
		mylist.add(1, "Hawthorn");
		mylist.add(2, "Freemantle");

		System.out.println("Print all objects");
		System.out.println(mylist);

		System.out.println("Object at index 3 element from list: " + mylist.get(3));
		System.out.println("Is Collingwood in list: " +mylist.contains("Collingwood"));
		System.out.println("Is Adelaide in list: " +mylist.contains("Adelaide"));
		System.out.println("Size of ArrayList: " +mylist.size());
		mylist.remove("Hawthorn");
		System.out.println("New Size of ArrayList: " +mylist.size());
		System.out.println("Print all objects:");
		for(String s:mylist)
		{
			System.out.println(s);
		}
	}

}
