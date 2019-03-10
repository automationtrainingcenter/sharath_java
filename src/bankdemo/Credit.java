package bankdemo;

public class Credit extends Account{
	private double creditLimit;
	private double cashLimit;
	private static double fee = 50;

	public Credit(int accNum, String accHolderName, String address, long phNum, double balance) {
		super(accNum, accHolderName, address, phNum, balance);
		this.creditLimit = balance;
		this.cashLimit = this.creditLimit*0.3;
	}
	
	public void getBalance() {
		System.out.println("credit limit is "+this.creditLimit);
		System.out.println("cash limit is "+this.cashLimit);
	}
	
	
	public double withdraw(double amount) {
		if(amount  > 0) {
			if(this.cashLimit >= amount) {
				this.creditLimit -= (amount+fee);
				this.cashLimit -= amount;
				System.out.println("withdraw success");
				return amount;
			}else {
				System.out.println("insufficient balance");
				return 0;
			}
		}else {
			System.out.println("invalid amount");
			return 0;
		}
	}
		
	

}
