package abstraction;

public class InterfaceImpl implements MyInterface {

	@Override
	public void methodOne() {
		System.out.println("method one implementation in child class");
	}

	@Override
	public void methodTwo() {
		System.out.println("method two implementation in child class");
	}

	@Override
	public void methodThree() {
		System.out.println("method three implementation in child class");
	}

	@Override
	public void methodFour() {
		System.out.println("default method of interface");
	}

//	@Override
//	public void methodFive() {
//		System.out.println("static method of interface");
//	}

}
