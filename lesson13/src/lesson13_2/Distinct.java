package lesson13_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		System.out.println(list); //[3, 2, 1, 2, 1, 1]

//		list = new ArrayList<Integer> (new LinkedHashSet<>(list));
//		System.out.println(list); //[3, 2, 1]

		//		list = new ArrayList<Integer> (new HashSet<>(list));
//		System.out.println(list); // [1, 2, 3]
				
		list = new ArrayList<Integer> (new TreeSet<>(list));
		System.out.println(list); // [1, 2, 3]
	}
}
