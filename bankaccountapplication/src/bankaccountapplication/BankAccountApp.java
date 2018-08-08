package bankaccountapplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<account> accounts=new LinkedList<account>();
		//Read a CSV file
		//Create new account based on the data
		
		String file="C:\\Users\\Arnab\\Downloads\\NewBankAccounts.csv";
		
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			String name= accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			
			
			if(accountType.equals("Savings")) {
				
				accounts.add(new savings(name,sSN,initDeposit));
			}
			
			else if(accountType.equals("Checking")){
				
				accounts.add(new checking(name,sSN,initDeposit));
			}
			else {
				System.out.println("Error reading account type");
				
			}		
		}
		
		//accounts.get(5).showInfo();
		for(account acc : accounts) {
			System.out.println("*******");
		acc.showInfo();	
		}
		// to deposit to a random account
		//accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		//accounts.get((int) Math.random() * accounts.size()).deposit(1500);
		
	}

}
