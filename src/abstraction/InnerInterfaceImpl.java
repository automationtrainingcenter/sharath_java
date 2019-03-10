package abstraction;

public class InnerInterfaceImpl implements InnerInterfaceDemo, InnerInterfaceDemo.InnerInterface{

	@Override
	public void outerMethod() {
		System.out.println("outer interface method implementation");
	}

	@Override
	public void innerMethod() {
		System.out.println("innner interface method implementaion");
	}

	@Override
	public InnerInterface method() {
		return this;
	}
	
	

}
