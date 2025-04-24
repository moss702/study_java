package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		//Stream.of(10, 30, 40, 20); //들어간 값으로 타입 추정
		Stream<Integer> stream = Stream.of(10, 10, 20, 30, 40, 20); //들어간 값으로 타입 추정
		
		stream.forEach( i -> System.out.println(i)); //스트림을 소비했다.
		Stream.of(10, 10, 20, 30, 40, 20); 
	//	stream.forEach( i -> System.out.println(i)); //이미 작동했거나, 닫혀버렸다는 에러메시지출력
	
		int[] arr = {1,2,3,4,5};
		IntStream is = Arrays.stream(arr);
		
		
		List<String> list = List.of("새똥이", "개똥이");
		System.out.println("========================");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(s -> System.out.println(s));
		
		Stream<Object> stream3 = Stream
		.builder()
		.add("가")
		.add("나")
		.add("다")
		.build();
		stream3.forEach(s -> System.out.println(s));
		
		
		//Stream<String> stream4 = Stream.generate(() -> "abcd");
		//제너레이트는 무한대. foreach 같은거 돌리면 안끝난다.
		Stream<String> stream4 = Stream.generate(() -> "abcd").limit(10); //길이를 정해줘야한다.
		stream4.forEach(s -> System.out.println(s));
		
		
		Stream.iterate(1, i -> i + 1).limit(10);
		Stream<Integer> stream5 = Stream.iterate(1, i -> i + 1).limit(10);
		stream5.forEach(s -> System.out.println(s));
		
	}
}
