package bankaccountapplication;

public abstract class account implements IBaseRate{  //No objects will be created from this

	//list common properties for savings and checking accounts
	
	private String name;
	private String sSN; //Social Security Number
	private double balance;
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	
	//Constructor to set base properties and initialize the amount
	public account(String name,String sSN, double initDeposit){
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;
		
		
		//Set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		setRate();
		
		
		
	}
	
	public abstract void setRate(); //If we are inheriting the account class we need to implement the abstract method
	
	
	
	private String setAccountNumber() {
		
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int randomNumber=(int)( Math.random() *Math.pow(10,3));
		return lastTwoOfSSN + uniqueID+randomNumber;
		
	}
	
	public void compound() {
		double accrudeInterest=balance * (rate/100);
		balance=balance+accrudeInterest;
		System.out.println("Accrude Interest :$"+accrudeInterest);
		printBalance();
	}
	
	//List Common Methods - transactions
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositting $:"+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawing  $"+amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {	
		balance=balance-amount;
		System.out.println("Transferring  $" +amount+ " to "+ toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is Now:  $"+balance);
	}
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\n ACCOUNT NUMBER : "+ accountNumber+
				"\n BALANCE :" +balance+
				"\n RATE:"+rate+"%");
	}
}
