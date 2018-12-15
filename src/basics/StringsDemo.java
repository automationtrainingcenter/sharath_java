package basics;
/* String is set of characters.
 * In Java Strings will be stored in a separate memory area known as String Constant Pool
 * Strings are immutable i.e. we can't change String values.
 * 
 *	//declare
 *	String obj_name = new String(string value);
 *	
 *	//string declaration using String literal
 *	String obj_name;
 *	
 *	//assign
 *	obj_name = "value";
 *	
 *	//retrieve
 *	using obj_name we can retrieve String data
 *
 *	//initialization
 *	String obj_name = "value";
 *
 * 	String class provides so many methods to manipulate string data
 */

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "sharath";
		System.out.println("s1 = " +s1);
		String s2 = "surya";
		System.out.println("s2 = " +s2);
		String s3 = "Sharath";
		System.out.println("s3 = " +s3);
		String s4 = s1;
		System.out.println("s4 = " +s4);
		s1 = s1+"kumar";
		System.out.println("s1 = " +s1);
		System.out.println("s4 = " +s4);
		
	}
	
	

}
