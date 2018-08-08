package bankaccountapplication;

public interface IBaseRate {     //changeable as per user access
	
	//Write a method that returns the base rate
	
	default double getBaseRate() {
		return 2.5;
	}

	
}
