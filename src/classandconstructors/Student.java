package classandconstructors;

public class Student {
	int id;
	String name;
	String phNum;
	String address;
	String course;
	private static int increment = 100;

	private Student() {
		id = increment++;
	}

	public Student(String name, String phNum) {
		this(name, phNum, "not decided");
	}

	public Student(String name, String phNum, String course) {
		this(name, phNum, course, "");
	}

	public Student(String name, String phNum, String course, String address) {
		this(); // constructor call must be first line of code in constructor
		this.name = name;
		this.phNum = phNum;
		this.course = course;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.id + "\n" + this.name + "\n" + this.course + "\n" + this.address;
	}

}
