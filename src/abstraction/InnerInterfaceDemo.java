package abstraction;
/*
 * inner interface is an interface inside another interface
 */

public interface InnerInterfaceDemo {
	
	public void outerMethod();
	
	//create a method which will return InnerInteface reference
	public InnerInterface method();
	
	interface InnerInterface{
		
		public void innerMethod();
	}

}
