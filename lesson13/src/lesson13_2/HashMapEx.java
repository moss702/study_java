package lesson13_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("B", 30); //키가 겹치면 값을 덮어쓴다! (put)
		map.put("C", 30);
		
		System.out.println(map);
		
		//키만 추출
		Set<String> keys = (map.keySet());
		System.out.println(keys);
		
		//값만 추출
		List<Integer> v1 = new ArrayList<>(map.values());
		System.out.println(v1);
		// 중복없이 값만 추출
		Set<Integer> v2 = new HashSet<>(map.values());
		System.out.println(v2);
		
		
		Set<Entry<String, Integer>> s = map.entrySet();
		for(Entry<String, Integer> e : s) {
			System.out.println(e.getKey() + " :: " + e.getValue());	
		}
		
		Properties properties = new Properties(); //제네릭이 안뜬다. >> 제네릭이 문자열로 고정되어있음.
		
		
	}
}

//		Integer i = map.put("B", 30); 
//		System.out.println(i);