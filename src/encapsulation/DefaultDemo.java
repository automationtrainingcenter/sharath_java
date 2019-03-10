package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class DefaultDemo {
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println("public variable is "+obj.pVar);
		//we can't access default and protected variables outside the package
//		System.out.println("private variable is "+obj.prVar);
//		System.out.println("defalult variable is "+obj.dVar);
//		System.out.println("protected variable is "+obj.proVar);
	}


}
