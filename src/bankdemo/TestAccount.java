package bankdemo;

public class TestAccount {
	
	public static void main(String[] args) {
		IAccount a1 = AccountFactory.createAccount(AccountType.CREDIT, 123987, "sharath", "lingampalli", 9876123450l, 50000);
		a1.displayAccountDetails();
		a1.withdraw(12000);
		a1.getBalance();
		
	}

}


