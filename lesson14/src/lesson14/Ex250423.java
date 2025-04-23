package lesson14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex250423 {
	public static void main(String[] args) {
		//Map을 사용한 문자의 빈도 계산
		// { a: , b: , c: , d: }
		String str = "aaaaabbbbbbbcccddddddddd";

		// ? [aaaaa,bbbbbbb,ccc,ddddddddd]
		// ? [0]의 길이 >> val++
		
		char[] strChar = str.toCharArray();
		for(int i = 0 ; i < strChar.length ; i++) {
		}
		System.out.println(Arrays.toString(strChar));
		//[a, a, a, a, a, b, b, b, b, b, b, b, c, c, c, d, d, d, d, d, d, d, d, d]
		
		Map<String,Integer> map = new HashMap<>();
			map.put("a", 0);
			map.put("b", 0);
			map.put("c", 0);
			map.put("d", 0);
			//{a=0, b=0, c=0, d=0}
		
			int a = 0;			//일단 작동 및 결과는 원하는대로 나왔는데
			int b = 0;			//이렇게 변수가 많고
			int c = 0;			//이렇게 길게 쓰는게 아닌거같습니다
			int d = 0;			//이러면 알파벳 종류만큼 변수갯수와 if길이가 늘어날텐데..
			
		for (int i = 0 ; i < strChar.length; i++) {
			if (strChar[i]  == 'a') {
				map.put("a", ++a);
			} else if (strChar[i] == 'b') { 	
				map.put("b", ++b);
			} else if (strChar[i] == 'c') { 
				map.put("c", ++c);
			} else if (strChar[i] == 'd') { 
				map.put("d", ++d);
			}
		}
		System.out.println(map);
		//{a=5, b=7, c=3, d=9}
		
		
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
