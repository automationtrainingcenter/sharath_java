package basics;

/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */
 

public class DatatypesDemo {
	
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		byte by = 123;
		System.out.println("byte value is "+by);
		
		short sh = 12345;
		System.out.println("short value is "+sh);
		
		int i = 1234567;
		System.out.println("int value is "+i);
		
		long ln = 12324567899l;
		System.out.println("long value is "+ln);
		
		
		float ft = 123.444f;
		System.out.println("float value is "+ft);
		
		double d = 1234555.444;
		System.out.println("double value is "+d);
		
//		In Java character occupies 2 bytes of memory for unicode fomatting
		char ch = 's';
		System.out.println("character value is "+ch);
	}

}
