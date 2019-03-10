package finalkeyword;

public class FinalMethodParent {
	
	public void methodOne() {
		System.out.println("this is normal method");
	}
	
	public final void methodTwo() {
		System.out.println("this is final method, we can't modify it");
	}

}
