package inheritance;
/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in Java
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 */

public class InheritanceDemo {
	public static void main(String[] args) {
		//single inheritance
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodOne();
		c1Obj.methodTwo();
		
		
		//multi level inheritance
		SubChild scObj = new SubChild();
		scObj.methodOne();
		scObj.methodTwo();
		scObj.methodThree();
		
		
		//hierarchical inheritance
		ChildOne c1  = new ChildOne();
		c1.methodOne();
		c1.methodTwo();
//		c1.methodFour();
		
		ChildTwo c2 = new ChildTwo();
		c2.methodOne();
		c2.methodFour();
//		c2.methodTwo();
		
		//calling child class methods using Parent class object
		Parent p = new ChildOne();
		p.methodOne();
//		ChildOne cOne = (ChildOne)p;
//		cOne.methodTwo();
		((ChildOne)p).methodTwo();
		((ChildTwo)p).methodFour();
	}
}
