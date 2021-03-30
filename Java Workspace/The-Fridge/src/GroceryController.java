//Name:Ciaran Bishop 
//Student ID:19374275
//User Name:
//Subject:CSE30AD
//Assignment:Part1
//Reference:
//Date due:26/09/2018
//Completed date: 25/09/2018

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GroceryController {

	private FridgeDSC fridgeDSC;

	public GroceryController(String dbHost, String dbUserName, String dbPassword) throws Exception
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

	public List<Grocery> get() throws Exception
	{
		//TODO 06: what should this method return? HINT: a relevant call to a fridgeDSC method
		return fridgeDSC.getAllGroceries();
	}

	public Grocery get(int id) throws Exception 
	{
		//TODO 07: what should this method return? HINT: a relevant call to a fridgeDSC method	
		return fridgeDSC.searchGrocery(id);
	}

	public int add(Grocery g) throws Exception 
	{
		// TODO 08: validate argument g, using Validation Framework
		Validator.validate(g);		
		// TODO 09: make a relevant call to a fridgeDSC method
		int newid = fridgeDSC.addGrocery(g.getItem().getName(), g.getQuantity(), g.getSection());
		// TODO 10: this method should return the id of the newly created grocery
		return newid;	
	}

	public Grocery update(int id) throws Exception 
	{
		// TODO 11: make a relevant call to a fridgeDSC method
		fridgeDSC.useGrocery(id);
		// TODO 12: this method should return the updated grocery object
		return fridgeDSC.searchGrocery(id);	
	}

	public int delete(int id) throws Exception 
	{
		// TODO 13: make a relevant call to a fridgeDSC method
		fridgeDSC.removeGrocery(id);
		// TODO 14: this method should return what ever the fridgeDSC method call (TODO 13) returns
		return id;
	}

	// To perform some quick tests
	public static void main(String [] args) throws Exception 
	{

		try 
		{
			GroceryController gc = new GroceryController("localhost:3306/fridgedb", "root", "");		
			System.out.println("Search all >>>: "+gc.get());
			System.out.println("Search >>>: "+gc.get(5));
			//System.out.println("Add new >>>: "+gc.add(new Grocery(new Item("Cabbage"), 10, FridgeDSC.SECTION.valueOf("FREEZER"))));		
			//System.out.println("Update >>>: "+gc.update(35));			
			System.out.println("Search all >>>: "+gc.get());

		}
		catch (Exception exp) 
		{
			exp.printStackTrace();
		}

	}
}