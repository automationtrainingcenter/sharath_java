package encapsulation;

import java.util.Scanner;

/*	hiding data from the outside world
 * to hide data we have create properties with private access modifier
 */

public class EncapsulationDemo {

	private int id;
	private String name;
	private String authour;
	private double price;
	private double discount;
	private int edition;

	public EncapsulationDemo(int id, String name, String authour, double price, double discount, int edition) {
		this.id = id;
		this.name = name;
		this.authour = authour;
		this.price = price;
		this.discount = discount;
		this.edition = edition;

	}

	public void display() {
		System.out.println("id = " + this.id + "\nname = " + this.name + "\nauthour = " + this.authour + "\nprice = "
				+ this.price + "\ndiscount = " + this.discount + "\nedition = " + this.edition);
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthour() {
		return this.authour;
	}

	public double getPrice() {
		return this.price - this.discount;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your passcode");
		int passcode = s.nextInt();
		if (passcode == 123542) {
			if(discount <= (this.price/2)) {
				this.discount = discount;
			}else {
				System.out.println("invalid discount amount");
			}
		}else {
			System.out.println("invalid passcode");
		}
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

}
