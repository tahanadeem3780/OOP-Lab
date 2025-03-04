package main;

import java.io.Console;
import banking.BankingSystem;

public class BankApplication{

	public static void main (String args[]){

		Console console = System.console();

		String acc = console.readLine("Enter account number: ");
		char [] pass = console.readPassword("Enter password: ");
		String password = new String(pass);

		if (BankingSystem.LoginProcessor.authenticate(acc , password)) {
			System.out.println("Access Given!");
       	 	} 
		else {
           		 System.out.println("Invalid Username or Password!");
        		}
	}

}