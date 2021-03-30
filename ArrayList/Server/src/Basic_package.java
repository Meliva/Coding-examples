
import java.io.*;
import java.util.*;
import java.net.*;

public class Basic_package 
{
	public static void main(String[] args) 
	{
		Socket sock;
		String sIn, host = "localhost";
		InputStream isIn;
		PrintStream psOut;
		byte abIn[] = new byte[1024];
		int iNumRead, numPort=8080;
		Scanner input;
		try
		{
			sock = new Socket(host, numPort);
			isIn = sock.getInputStream();
			psOut = new PrintStream(sock.getOutputStream());
			input = new Scanner (System.in);
			while (true)
			{
				System.out.print("Enter text to read: ");
				sIn = input.nextLine();
				if (sIn.equals("bye"))
				{
					sock.close();
					break;
				}
				psOut.print(sIn);
				iNumRead = isIn.read(abIn,0,1024);
				if(iNumRead<0)
				{
					break;
				}
				String str = new String (abIn,0,iNumRead);
				System.out.println("Client: Rcvd from server: " +str+ "( " +iNumRead+ "bytes)");
			}
			sock.close();
		}
		catch (Exception e)
		{
			{System.out.println("Client: exception "+ e);}
		}
	}
}
