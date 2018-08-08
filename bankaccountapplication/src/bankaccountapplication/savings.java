package bankaccountapplication;

public class savings extends account{    //child of account
	
	//List properties Specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize checking account properties
	
	public savings(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate=getBaseRate()-.25;
		
		
	}
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID= (int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
		
	}
	//List Common Methods
	
	
	public void showInfo() {
		
		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT DETAILS"
				+ "\n Safety Dposit Box ID : " +safetyDepositBoxID+
				"\n Safety Deposit Box Key : "+safetyDepositBoxKey
				);
				
		
	}



}
