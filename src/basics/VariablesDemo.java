package basics;
/*
 * Variable is name of memory location where we store data. 
 *
 * if we want to make any variable as constant then use "final" keyword.
 * 
 * Types of variables
 * 
 * 1.Instance variables 
 * 		It is a variable which is declared inside the class but outside of any method. 
 * These are object level. We can access these variables directly inside the class 
 * instance methods and by creating an object of the class in same class static methods 
 * and outside the class. 
 * Variable declaration
 * 		access_modifier data_type var_name; 
 * accessing variable 
 * 		object_name.var_name = value; 
 * Initialization variable: At the time of variable declaration we are going to assign some value 
 * 		access_modifier data_type var_name = value;
 * 
 * 2.static variables 
 * 		It is a variable which declared inside the class and outside of any method 
 * but declared using 'static' keyword. These are class level i.e. object to object these 
 * variables will share the information. We can access these variables directly inside the 
 * class and by using class_name outside the class.
 * Variable declaration 
 * 		access_modifier static data_type var_name; 
 * accessing variable 
 * 		class_name.var_name = value; 
 * Initialization
 * 		access_modifier static data_type var_name = value;
 * 
 * 3.local variables 
 * 		It is variable which is declared inside any method. we can
 * access this variable inside the method only. 
 * Variable declaration 
 * 		data_type var_name; 
 * accessing variable 
 * 		var_name = value; 
 * Initialization 
 * data_type var_name = value;
 */

public class VariablesDemo {
	
//	instance variables of the class
	int id;
	String name;
	String course;
	boolean isEmployeed;
	
	
//	static variables
	static String instituteName;
	
	public void method() {
		int localVar = 10;
		System.out.println(localVar);
	}
	
	public void print() {
		System.out.print(id+"\t"+name+"\t"+course+"\t"+instituteName+"\n");
	}
	
	
	public static void main(String[] args) {
		
		
//		class_name obj_name = new class_name();
		VariablesDemo obj = new VariablesDemo();
		obj.id = 200;
		obj.name = "sharath";
		obj.course = "selenium";
		obj.isEmployeed = true;
		VariablesDemo.instituteName = "SSTS";
		VariablesDemo obj1 = new VariablesDemo();
		obj1.id = 300;
		obj1.name = "sravan";
		obj1.course = "selenium";
		obj1.isEmployeed = true;
		VariablesDemo.instituteName = "sun shine";
		obj.print();
		obj1.print();
	}
	

}


