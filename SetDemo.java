package CollectionFreamwork;

import java.util.HashSet;
import java.util.Set;

import array.main;

public class SetDemo {
 
	
	public static void main(String[] args) {
		Set<String>languges = new HashSet<>();
		
		languges.add("C");
		languges.add("C++");
		languges.add("Java");
		languges.add("Python");
		
		//System.out.println(languges);
		//languges.remove("Java");
	//	System.out.println(languges);
	
		//System.out.println(languges.size());
		
		//System.out.println(languges.contains("Python"));
		
		//System.out.println(languges.isEmpty());
		
		//languges.clear();
       
		//System.out.println(languges);	
		
		for (String ele : languges) {
			System.out.println(ele);
			
			
		}
		
		
	}
}
