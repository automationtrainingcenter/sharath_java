package bankdemo;

public class Account implements IAccount{
	
	private int accNum;
	private String accHolderName;
	private String address;
	private long phNum;
	protected double balance;
	
	
	public Account(int accNum, String accHolderName, String address, long phNum, double balance) {
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.address = address;
		this.phNum = phNum;
		this.balance = balance;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhNum() {
		return phNum;
	}


	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public void displayAccountDetails() {
		System.out.println("account number : "+this.accNum);
		System.out.println("Name : "+this.accHolderName);
		System.out.println("address : "+this.address);
	}

	public void getBalance() {
		System.out.println("balance is "+this.balance);
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("deposite success");
		}else {
			System.out.println("invalid amount");
		}
	}
	
	public double withdraw(double amount) {
		if(amount  > 0) {
			if(this.balance >= amount) {
				this.balance -= amount;
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
