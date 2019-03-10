package abstraction;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * we can override the default methods but we can't override static methods of interface
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */
public class AbstractoinDemo {
	public static void main(String[] args) {
		AbstractClassDemo obj = new AbstractClassImpl();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();

		MyInterface iObj = new InterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();
		iObj.methodThree();
		iObj.methodFour();
		MyInterface.methodFive();

		// functional interface implementation using normal class
		FuncInterface fiObj = new FuncInterfaceImpl();
		System.out.println(fiObj.add(10, 20));

		// functional interface implementation using anonymous class
		FuncInterface fiAObj = new FuncInterface() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		System.out.println(fiAObj.add(20, 30));

		// lambda expression
		// (arg1, arg2 .. argN) -> { definition of abstract method of functional
		// interface };
		FuncInterface fiLObj = (int a, int b) -> { return a + b; };
		System.out.println(fiLObj.add(30, 30));

		FuntionalInface fObj = () -> {
			System.out.println("line one");
			System.out.println("line 2");
			System.out.println("line 3");
		};
		
		fObj.methodOne();
		
		//accessing inner interface methods
		InnerInterfaceDemo ouObj = new InnerInterfaceImpl();
		ouObj.outerMethod();
		//if outer interface and inner interface are implemented by same class we can use following 2 approaches
		((InnerInterfaceImpl)ouObj).innerMethod();
		((InnerInterfaceDemo.InnerInterface)ouObj).innerMethod();
		//if outer interface contains a method which will return inner interface object reference then wer can use following approach
		InnerInterfaceDemo.InnerInterface inObj = ouObj.method();
		inObj.innerMethod();
//		ouObj.method().innerMethod();
	
	}
}
