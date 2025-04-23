package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex250423 {
	public static void main(String[] args) {
		//Map을 사용한 문자의 빈도 계산
		// { a: , b: , c: , d: }
		// abcd가 key / string
		// 개수가 val / integer / 있으면 +1
		
		String str = "aaaaabbbbbbbcccddddddddd";
		// ? [aaaaa,bbbbbbb,ccc,ddddddddd]
		// ? [0]의 길이 >> val
		char[] strChar = str.toCharArray();
		for(int i = 0 ; i < strChar.length ; i++) {
			System.out.println(strChar[i]);
		} //문자열배열로 만들려고 했는데문자배열도 괜ㄴ찮은듯?
		
		Map<String,Integer> map = new TreeMap<>();
		
		for (int i = 0 ; i < strChar.length; i++) { //str에서 i로 abcd 체크.
			if (strChar[i] == 'a') { map.put(,+1);
			
			//map.put("a", i++);			//j로 해당 i의 자리에 카운트 +1
		}
		
		
//		//====================================================
//		List<Map<String,Object>> students = new ArrayList<>();
//		Map<String,Object> map = new HashMap<>();
//		map.put("no", 1);
//		map.put("name", "새똥이");
//		map.put("kor", 90);
//		students.add(map);
//		System.out.println(students);
	}
}
