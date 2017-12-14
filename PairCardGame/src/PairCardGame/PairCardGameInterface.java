package PairCardGame;

import java.rmi.Remote;

public interface PairCardGameInterface extends Remote{

	public boolean register(String userName) throws java.rmi.RemoteException;
	
		
}
