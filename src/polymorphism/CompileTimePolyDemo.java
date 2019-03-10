package polymorphism;

public class CompileTimePolyDemo {
	
	public void add(int a, String b) {
		int ib = Integer.parseInt(b);
		int c = a+ib;
		System.out.println("sum is "+c);
	}

	
	//changing number of arguments
	public void add(int a, String b, int c) {
		int ib = Integer.parseInt(b);
		int d = a+ib+c;
		System.out.println("sum is "+c);
	}
	
	
	//changing type of arguments
	public void add(int a, int b) {
		System.out.println("sum is "+(a+b));
	}
	
	//changing sequence of arguments
	public void add(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println("sum is "+(ia+b));
	}
	
	//by changing the return type only we can't achieve compile time polymorphism
//	public int add(int a, String b) {
//		
//	}
	
}
