package robotRally;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String [] args) {
		try {
			Socket s = new Socket("localhost",1234);
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream(); 
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Selectionnez les 5 cartes ");
			//il faut coder l'endroit de selection des 5 cartes 
			x	
			
			os.write(nb);
			int rep=is.read();
			System.out.println("Resultat = "+rep);
			
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
				
	}
	}

