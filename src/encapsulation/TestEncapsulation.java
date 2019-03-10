package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(100, "Core Java made easy", "sharath", 350.00, 20, 1);
		obj.display();
		obj.setDiscount(150);
		obj.display();
		System.out.println("price is "+obj.getPrice());
		
	}
	
	
}
