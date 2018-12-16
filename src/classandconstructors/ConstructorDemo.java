package classandconstructors;
/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorDemo {
	
	public static void main(String[] args) {
		Student s1 = new Student("sravan","9876543210", "selenium");
		System.out.println(s1);
		Student s2 = new Student("prakash","9876543210");
		System.out.println(s2);
		Student s3 = new Student("teja","9876543210", "python", "kphb");
		System.out.println(s3);
	}

}
