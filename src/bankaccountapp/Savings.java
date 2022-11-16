package bankaccountapp;

public class Savings extends Account {
	
	//List properties specific to Savings account
	private int safetyDeposityBoxID;
	private int safetyDepositBoxKey;
	//Constructor to initialize settings for savings properties
	public Savings(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDeposityBox();
		safetyDepositBoxKey();

	}
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void 	setSafetyDeposityBox() {
		safetyDeposityBoxID = (int)(Math.random() * Math.pow(10, 3));

	}
	private void safetyDepositBoxKey() {
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));

	}
	
	//List any method specific to savings account
	public void showInfo() {
		System.out.println("SAVINGS ACCOUNT");
		super.showInfo();
		System.out.println(
				"YOUR SAVINGS ACCOUNT FEATURES" + 
		"\nSAFETY DEPOSITY BOX ID "+ safetyDeposityBoxID +
		"\nSAFETY DEPOSITY BOX KEY "+ safetyDepositBoxKey);
	}
	

	//
}
