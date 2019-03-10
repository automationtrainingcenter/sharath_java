package accessmodifiers;

public class PrivateDemo {
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println("public variable is "+obj.pVar);
		// can't access private variables outside the class
//		System.out.println("private variable is "+obj.prVar); 
		System.out.println("defalult variable is "+obj.dVar);
		System.out.println("protected variable is "+obj.proVar);
	}

}
