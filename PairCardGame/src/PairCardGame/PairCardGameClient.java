package PairCardGame;

import java.io.*;
import java.rmi.*;

public class PairCardGameClient {
	
	public static void main(String args[])
	{
		PairCardGameInterface obj = null;
		String ipaddr;
		
		ConnectGUI connectframe = new ConnectGUI();
		
		do
		{
			ipaddr = connectframe.start();
			
		}while(ipaddr == null);
		
		System.out.println(ipaddr);
		
		try {
		    obj = (PairCardGameInterface)Naming.lookup("rmi://" + ipaddr + "/PairCardGame");
		    System.out.println("RMI server connected");
		} catch(Exception e) {
		    System.out.println("Server lookup exception: " + e.getMessage());
		}
		
		
		
	}

}
