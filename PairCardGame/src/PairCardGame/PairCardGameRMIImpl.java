package PairCardGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.*;

public class PairCardGameRMIImpl extends UnicastRemoteObject implements PairCardGameInterface{
	
	String[] userIdDatabase;
	String[] userPwdDatabase;
	int userNumber;
	
	public PairCardGameRMIImpl() throws java.rmi.RemoteException
	{
		super();
		this.userIdDatabase = new String[100];
		this.userPwdDatabase = new String[100];
		try {
			FileReader fileInput = new FileReader("user.txt");
			BufferedReader buf = new BufferedReader(fileInput);
			String userdata;
			this.userNumber = 0;
			while((userdata = buf.readLine()) != null)
			{
				userIdDatabase[this.userNumber] = new String(userdata.split(" ")[0]);
				userPwdDatabase[this.userNumber] = new String(userdata.split(" ")[1]);
				this.userNumber++;
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean register(String userName) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
