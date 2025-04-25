package lesson16_2;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		//1.스트림 생성 방법
		//of(), builder, generate(), 배열로부터(arrays.strem), 컬렉션으로부터
		
		
		//2. 스트림의 종류
		// Stream<T>, IntStream, DoubleStream, LongStream
		
		
		//3. 스트림의 연산
		// 최종연산 
		//   forEach(), collect()
		// 중간연산
		//   filter(), distinct(), map(), flatMap(), boxed(), sorted()
		
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		//컬렉트 > 리스트
	
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().sorted((o1,o2)-> o2 - o1).collect(Collectors.toList());
		System.out.println(list);
		//int 였던것이 박스(기본자료형>참조자료형) 처리가 되면 인티저가 됨. 콜렉트를 통해
		//그리고 인티저 리스트에 넣기
		//박스 뒤에 sorted 넣으면 오름차순 정렬됨.
		//내림차순 하고 싶으면 컴페어 사용 ((o1,o2)-> o2 - o1) : 람다식 형태. 
		//sorted(Comparator.reverseOrder()) 또는 자바제공
		
		
		List<Integer> list2 = new Random().ints(10,0,10).boxed().peek(System.out::println).collect(Collectors.toList());
		System.out.println(list2);
		
		
		boolean result = Stream.of(1, 3, 5, 7).allMatch( i -> i % 2 == 1);
		System.out.println(result); //모든 요소가 만족해야 참
		
		result = Stream.of(1,3,5,8).anyMatch(i -> i % 2 == 1);
		System.out.println(result); //하나라도 일치하면 참
		
	}
}
