import java.sql.*;
import javax.swing.*;

public class AccessConnection 
{
	Connection conn = null;
	// method to establish connection with database
	public static Connection dbConnector()
	{
		try
		{
			/**
			Use forward brackets instead of back brackets when using jdbc:ucanaccess:// connection thing
			commons-lang-2.6.jar, commons-logging-1.1.1.jar, hsqldb.jar,jackcess-2.1.3.jar, uncanaccess-3.0.6.jar
			right-click on system library --> build path --> configure build path --> add JARs --> *select jars above*
			**/
			//Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:/Work/HelpDesk Project/HelpDesk_DB1.accdb"); //School
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess://D:/Work/HelpDesk Project/HelpDesk_DB1.accdb"); //home
			//Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/HelpDesk_DB1.accdb");
			//Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/b201634863/Desktop/HelpDesk_DB1.accdb");
			//Connection conn = DriverManager.getConnection("jdbc:ucanaccess://X:/Teaching Resources for Students/School of Bus & Mgmt/IT &  Multimedia/HelpDesk Project/HelpDesk_DB1.accdb");
			//JOptionPane.showMessageDialog(null, "Connection Sucessful");
			Statement s = conn.createStatement();
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Failed to Connect!");
			System.exit(0);
			return null;
		}		
	}
}
