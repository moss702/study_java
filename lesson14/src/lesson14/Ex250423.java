package lesson14;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex250423 {
	public static void main(String[] args) {
		//Map을 사용한 문자의 빈도 계산
		// { a: , b: , c: , d: }
		String str = "aaaaabbbbbbbcccdddddddzdd";
		Map<String, Integer>map = new HashMap<>();
	
		//문자열, 문자배열, 문자열배열
		String[] strs = str.split(""); //문자열배열
		
		
//		Stream.of(strs).forEach(s ->{
//			Integer i = map.get(s);
//			map.put(str, i == null ? 1 : i+ 1);
//		});
//			//============================
		for(String s : strs) {
			Integer i = map.get(s); //get을 왜 썼나, 키를 통해 값을 가져옴
			if (i == null) {
				map.put(s, 1);
				System.out.println(map);
			} else {
				map.put(s, i+1);
			}
//			===========================
//			map.put(str, i == null ? 1 : i+ 1);
			//===========================
		}
		
		System.out.println(map);

		
		
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
