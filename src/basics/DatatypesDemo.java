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
		System.out.println("********************************************");
		System.out.println("byte value is "+by);
		System.out.println("size of byte is "+Byte.BYTES);
		System.out.println("size of byte in bits is "+Byte.SIZE);
		System.out.println("min value of byte is "+Byte.MIN_VALUE);
		System.out.println("max vlaue of byte is "+Byte.MAX_VALUE);
		
		short sh = 12345;
		System.out.println("********************************************");
		System.out.println("short value is "+sh);
		System.out.println("size of short is "+Short.BYTES);
		System.out.println("size of Short in bits is "+Short.SIZE);
		System.out.println("min value of Short is "+Short.MIN_VALUE);
		System.out.println("max vlaue of Short is "+Short.MAX_VALUE);
		
		int i = 1234567;
		System.out.println("********************************************");
		System.out.println("int value is "+i);
		System.out.println("size of Integer is "+Integer.BYTES);
		System.out.println("size of Integer in bits is "+Integer.SIZE);
		System.out.println("min value of Integer is "+Integer.MIN_VALUE);
		System.out.println("max vlaue of Integer is "+Integer.MAX_VALUE);
		
		
		long ln = 12324567899l;
		System.out.println("********************************************");
		System.out.println("long value is "+ln);
		System.out.println("size of Long is "+Long.BYTES);
		System.out.println("size of Long in bits is "+Long.SIZE);
		System.out.println("min value of Long is "+Long.MIN_VALUE);
		System.out.println("max vlaue of Long is "+Long.MAX_VALUE);
		
		
		float ft = 123.444f;
		System.out.println("********************************************");
		System.out.println("float value is "+ft);
		System.out.println("size of Float is "+Float.BYTES);
		System.out.println("size of Float in bits is "+Float.SIZE);
		System.out.println("min value of Float is "+Float.MIN_VALUE);
		System.out.println("max vlaue of Float is "+Float.MAX_VALUE);
		
		double d = 1234555.444;
		System.out.println("********************************************");
		System.out.println("double value is "+d);
		System.out.println("size of Double is "+Double.BYTES);
		System.out.println("size of Double in bits is "+Double.SIZE);
		System.out.println("min value of Double is "+Double.MIN_VALUE);
		System.out.println("max vlaue of Double is "+Double.MAX_VALUE);
		
//		In Java character occupies 2 bytes of memory for unicode fomatting
		char ch = 's';
		System.out.println("********************************************");
		System.out.println("character value is "+ch);
		System.out.println("size of Character is "+Character.BYTES);
		System.out.println("size of Character in bits is "+Character.SIZE);
		System.out.println("min value of Character is "+Character.MIN_VALUE);
		System.out.println("max vlaue of Character is "+Character.MAX_VALUE);
		
		
		
//		primitive to wrapper conversion
		int ip = 234;
		Integer iw = Integer.valueOf(ip);
		
//		wrapper to primitive conversion
		Double dw = new Double(768.89);
		double dp = dw.doubleValue();
//		int di = dw.intValue();
//		System.out.println(di);
		
		
//		Type casting
//		upcasting : lower to higher
		int il = 1234567;
		long lh;
		lh = il;
		System.out.println(lh);
		
//		down casting : higher to lower
		short shigh = 383;
		byte blow;
//		lower_data_type_var_name = (lower_data_type) higher_data_type_var_name
		blow = (byte) shigh;
		System.out.println("blow = " +blow);
		
		double dh = 123.44;
		int ilow;
		ilow = (int) dh;
		System.out.println(ilow);
		
//		type conversion : converting a reference to primitive type (String to primitive)
		String si = "12345";
		int is = Integer.parseInt(si);
		System.out.println(is +10);
		
		String sf = "123.33";
		float fs = Float.parseFloat(sf);
		System.out.println(fs+10);
		
		
		int istr = 120;
		String sint = Integer.toString(istr);
		System.out.println(sint+20);
		
	}

}
