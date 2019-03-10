package abstraction;

public interface MyInterface {
//	public abstract void methodOne();
	
	void methodOne();
	
	void methodTwo();
	
	void methodThree();
	
	public default void methodFour() {
		System.out.println("default method of interface");
	}
	
	
	public static void methodFive() {
		System.out.println("static method of interface");
	}
	
}
