package bankdemo;

public class AccountFactory {
	
	public static IAccount createAccount(AccountType accType, int accNum, String accHolderName, String address, long phNum, double balance) {
		IAccount obj = null;
		switch(accType) {
		case SAVINGS:
			obj = new Savings(accNum, accHolderName, address, phNum, balance);
			break;
		case CURRENT:
			obj = new Current(accNum, accHolderName, address, phNum, balance);
			break;
		case CREDIT:
			obj = new Credit(accNum, accHolderName, address, phNum, balance);
			break;
		default:
			System.out.println("invalid account type");
		}
		return obj;
	}

}
