package CollectionFreamwork;

import java.util.HashMap;

public class HashDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Student>Student =new HashMap<>();
		Student.put(11, new Student("Rohit", 99,11));
		Student.put(14, new Student("Akash", 98,12));
		Student.put(15, new Student("Shivam", 96,13));
		Student.put(16, new Student("Saurabh", 95,14));
		
		System.out.println(Student);

		
		
	}

}
