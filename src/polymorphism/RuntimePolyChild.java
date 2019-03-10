package polymorphism;

public class RuntimePolyChild extends RuntimePolyParent{
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	@Override
	public void add(String a, String b) {
		System.out.println("child class method");
		int ia = Integer.parseInt(a);
		int ib = Integer.parseInt(b);
		System.out.println(ia+ib);
	}
	
}
