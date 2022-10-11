package CollectionFreamwork;

public class Student {

	
	String name;
	float marks;
	int rollnum;
	
	public Student(String name, float marks, int rollnum) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollnum = rollnum;
		
	}
	//No use ,Just Tell Us How To import toString Method
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollnum=" + rollnum + "]";
	}
	
	
	
}
