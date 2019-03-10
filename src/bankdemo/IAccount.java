package bankdemo;

public interface IAccount {
	public void setAddress(String address);

	public long getPhNum();

	public void setPhNum(long phNum);

	public void displayAccountDetails();

	public void getBalance();

	public void deposite(double amount);

	public double withdraw(double amount);

}
