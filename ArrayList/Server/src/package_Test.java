
import java.net.*;
import java.io.*;

public class package_Test 
{
	public static void main(String[] args) 
	{
		Socket sock;
		ServerSocket serversock;
		InputStream isIn;
		PrintStream psOut;
		int iNumRead, numPort=8080;
		String sendMsg;
		byte byteIn[] = new byte [1024];
		System.out.println("Serv: Initializing to port" + numPort);
		try
		{
			//Create the server socket and bind it to our port
			serversock = new ServerSocket (numPort);
			//wait for a client request
			System.out.println("Serv: waiting for a connection...");
			sock = serversock.accept();
			//we got a connection request print out info and start talknig
			System.out.println ("Serv: Receved a connection");
			System.out.println ("*----------*");
			System.out.println("Srx: Connected to" + sock.getInetAddress()+ ":" +sock.getPort());
			psOut = new PrintStream (sock.getOutputStream());
			isIn = sock.getInputStream();
			iNumRead = 0;
			while (iNumRead >=0)
			{
				iNumRead = isIn.read(byteIn, 0, 1024);
				if(iNumRead < 0)
					break;
				sendMsg = new String(byteIn, 0,iNumRead);
				System.out.println("We just recived: (" +iNumRead + ") " +sendMsg);
				psOut.print(sendMsg);
				iNumRead = 0;
			}
			sock.close();
			System.out.println("Srvx disconnected from" + sock.getInetAddress());
			System.out.println("*-------------------*");
		}
		catch (Exception e)
		{
			System.err.println(":Serv: Exception in main: " + e);
		}		
	}
}
