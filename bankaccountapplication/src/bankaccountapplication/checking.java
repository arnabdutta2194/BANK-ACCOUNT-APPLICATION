package bankaccountapplication;

public class checking extends account{    //child of Account
	
	//List properties Specific to a checking account
	
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	
	

	public checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		
	}
	@Override
	public void setRate() {
		rate=getBaseRate()*.15;
		
		
	}
	
	
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
		
	}

	
	
	//List any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT DETAILS"
				+ "\n  DEBIT CARD NUMBER : " +debitCardNumber+
				"\n DEBIT CARD PIN : "+debitCardPin
				);
	}

}
