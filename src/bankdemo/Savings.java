package bankdemo;

public class Savings extends Account{
	private static double minBalance = 10000;
	private static double fee =  25;

	public Savings(int accNum, String accHolderName, String address, long phNum, double balance) {
		super(accNum, accHolderName, address, phNum, balance);
	}
	
	public double withdraw(double amount) {
		if(amount  > 0) {
			if(this.balance >= amount) {
				this.balance -= amount;
				System.out.println("withdraw success");
				if(this.balance < minBalance) {
					this.balance -= fee;
				}
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
