package CollectionFreamwork;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
	String name;
	Float marks;
	int rollnum;
	
	public DemoHashMap(String name, Float marks, int rollnum) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollnum = rollnum;
	}

	public static void main(String[] args) {
		
		Map<Integer, Student> Student=new HashMap<>();
		 
		Student.put(11, new Student("Rohit", 99,11));
		Student.put(12, new Student("Akash", 98,12));
		Student.put(13, new Student("Shivam", 79,13));
		Student.put(14, new Student("Saurabh", 69,14));
		
		System.out.println(Student);

		
		
		
	
	}

}
