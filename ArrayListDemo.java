package CollectionFreamwork;

import java.util.ArrayList;

import array.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
		// Collection Framework
		
		/*
		 * ArrayList:-
		 * 1) ArrayList is orderd
		 * 2) Dublicates Elements are Allowed
		 * 3)Insertion Order IS Preserved
		 * 4)In List Indexing Is Present
		 */
		
		
		ArrayList<Integer>FirstThreeEvenNum = new ArrayList<Integer>();
		FirstThreeEvenNum.add(2);
		FirstThreeEvenNum.add(4);
		FirstThreeEvenNum.add(6);
	//System.out.println(FirstThreeEvenNum);
	
	
	ArrayList<Integer>FirstSixEvenNum = new ArrayList<Integer>(FirstThreeEvenNum);
	
	FirstSixEvenNum.add(8);
	FirstSixEvenNum.add(10);
	FirstSixEvenNum.add(12);
	FirstSixEvenNum.add(14);
System.out.println(FirstSixEvenNum);

System.out.println(FirstSixEvenNum.contains(12));

System.out.println(FirstSixEvenNum.get(2));

System.out.println(FirstSixEvenNum.size());
		
System.out.println(FirstSixEvenNum.isEmpty());



	}
	
	
	
	
}
