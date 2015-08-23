//package Java;
import java.net.*;
import java.io.*;

public class client
{
	public static void main(String []args)throws IOException
	{
		InetAddress host=InetAddress.getLocalHost();
		String hostName="Server";//server name
		int portNo=898;//port at which the server can be found

		Socket sclient=new Socket(host,portNo);//created a socket

		PrintWriter out=new PrintWriter(sclient.getOutputStream(),true);//setting the output of the client as the input to the server

		BufferedReader in=new BufferedReader(new InputStreamReader(sclient.getInputStream()));//setting the output of server to input of client

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//standard input from the user

		String input;
		while((input=br.readLine())!=null)
		{
			out.println(input);
			System.out.println("Message recieved is :"+in.readLine());
		}
	}
}