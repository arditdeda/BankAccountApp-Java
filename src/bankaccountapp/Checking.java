package bankaccountapp;

public class Checking extends Account{
	//List properties specific to checking account
	private int debitCardBumber;
	private int debitCardPin;
	//Constructor to initialize settings for savings properties
	public Checking (String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	//List any method specific to Checking account
	private void  setDebitCard() {
		debitCardBumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("CHECKING ACCOUNT");
		super.showInfo();
		System.out.println("Your checking Account Features"+
		"\nDebit Card Number: "+ debitCardBumber+
		"\nDebit Card Pin: "+ debitCardPin);
		
	}
}
