package classandconstructors;

public class MethodsDemo {
	
//	method without return type and without arguments
	public void methodOne() {
		System.out.println("this is method without return type and without arguments");
	}
	
// method without return type and with arguments
	public void methodTwo(String arg1) {
		System.out.println("this is method without return type and with argument " +arg1);
	}
	
//	method with return type and without arguments
	public boolean methodThree() {
		System.out.println("this is method with return type and without argument");
		return true;
	}
	
//	method with return type and with arguments
	public int methodFour(int a, int b) {
		System.out.println("this is method with return type and with arguments");
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo("sravan");
		boolean result = obj.methodThree();
		System.out.println(result);
		int sum = obj.methodFour(10, 20);
		System.out.println(sum);
	}
	

}
