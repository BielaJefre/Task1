import java.io.*;
import java.net.*;

public class server
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket serverSocket = new ServerSocket(10000);

		Socket clientSocket = serverSocket.accept();

		System.out.println("Client connected");

		InputStreamReader gt = new 
InputStreamReader(clientSocket.getInputStream());

		BufferedReader ot = new BufferedReader (gt);

		PrintWriter rp = new 
PrintWriter(clientSocket.getOutputStream());

		rp.println("Ni hao ma");
		rp.flush();

		String recvr = ot.readLine();

		System.out.println(recvr);
	}
}

