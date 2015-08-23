import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String []args)throws IOException
	{
		int portNo=898;
		ServerSocket ss=new ServerSocket(portNo);//server socket

		Socket client=ss.accept();

		PrintWriter out=new PrintWriter(client.getOutputStream(),true);//server's output

		BufferedReader in =new BufferedReader(new InputStreamReader(client.getInputStream()));//server's input

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input;
		String inp;
		while((input=in.readLine())!=null)
		{
			System.out.println("Server Side");
			System.out.println("Message is :"+input);
			out.println((inp=br.readLine()));//sending back message from server to client
		}

	}
}