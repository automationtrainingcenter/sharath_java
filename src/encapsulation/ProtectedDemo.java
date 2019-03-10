package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	
	public static void main(String[] args) {
		ProtectedDemo obj = new ProtectedDemo();
		System.out.println("public variable is "+obj.pVar);
		// we can't access private and default variables outside package
//		System.out.println("private variable is "+obj.prVar);
//		System.out.println("default variable is "+obj.dVar);
		System.out.println("protected variable is "+obj.proVar);
	}


}
