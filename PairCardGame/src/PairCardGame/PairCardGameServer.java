package PairCardGame;

import java.rmi.*;
import java.rmi.server.*;

public class PairCardGameServer
{
	public static void main(String args[])
	{
		//System.setSecurityManager(new RMISecurityManager());
		try
		{
			PairCardGameRMIImpl name = new PairCardGameRMIImpl();
			System.out.println("Registering ...");
			Naming.rebind("PairCardGame", name);	// arithmetic is the name of the service
			System.out.println("Register success");
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
