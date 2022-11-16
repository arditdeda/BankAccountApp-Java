package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		///Read a CSV File then create new accounts bade on that data
		String  file = "C:\\Users\\IT\\Pictures\\NewBankAccount.csv";
		
		List<String[]> newCostumers = utilities.CSV.read(file);

		for(String[] newCostumer:newCostumers) {

			String name = newCostumer[0];
			String sSN = newCostumer[1];
			String accountType  = newCostumer[2];
			double initDeposit = Double.parseDouble(newCostumer[3]) ;
			
			
			if(accountType.equals("Savings")) {
					accounts.add(new Savings(name,sSN,initDeposit));
			}
					else if(accountType.equals("Checking")) {
						accounts.add(new Checking(name,sSN,initDeposit));
			}
					else {
						System.out.println("ERROR READING ACCOUNT TYPE");
					}
		}

		for(Account acc:accounts) {
			System.out.println("\n***************");
			acc.showInfo();
		}
	}
		
}
