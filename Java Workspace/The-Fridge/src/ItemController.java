//Name:Ciaran Bishop 
//Student ID:19374275
//User Name:
//Subject:CSE30AD
//Assignment:Part1
//Reference:
//Date due:26/09/2018
//Completed date: 25/09/2018

import java.util.List;

public class ItemController {

	private FridgeDSC fridgeDSC;

	public ItemController(String dbHost, String dbUserName, String dbPassword) throws Exception 
	{
		fridgeDSC = new FridgeDSC(dbHost, dbUserName, dbPassword);
		try 
		{
			fridgeDSC.connect();
		} catch (Exception e) 
		{
			throw new Exception(e.getMessage());
		}
	}

	public List<Item> get() throws Exception
	{
		//TODO 15: what should this method return? HINT: a relevant call to a fridgeDSC method
		return fridgeDSC.getAllItems();
	}

	// To perform some quick tests
	public static void main(String [] args) throws Exception 
	{
		try 
		{
			ItemController ic = new ItemController("localhost:3306/fridgedb", "root", "");		
			System.out.println(ic.get());
		} catch (Exception exp)
		{
			exp.printStackTrace();
		}

	}
}