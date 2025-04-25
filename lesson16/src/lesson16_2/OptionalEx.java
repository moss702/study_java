package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
//		Optional<Integer> optional;
		//아이템을 딱 하나 넣을 수 있는
		//null 처리의 추가연산 가능.
//		Optional<Integer> optional = Optional.of(10);
//		System.out.println(optional); //Optional[10]
//		System.out.println(optional.get()); //10
		//
		Optional<Integer> optional = Optional.ofNullable(null);
		System.out.println(optional.orElse(20));
		//orElse : null이었을때 대체값을 이걸 쓰겠다 명시
		//만약 null이 아니면 orElse 값은 무시.
		
		System.out.println(optional.orElseGet(() -> 30));
				
		System.out.println(optional.isPresent()); //값의 존재유무
		System.out.println(optional.isEmpty());
		
		optional.ifPresent(System.out::println); 
		//값이 존재한다면 (실행문)
		//만약 null이면 실행문 무시.

		optional.orElseThrow(() -> new RuntimeException("값이 없음"));
		//null인데 예외발생시 실행
		//입력값 없고 출력만 익셉션
		
		
		
	}
}
