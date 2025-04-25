package lesson16_2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AggrEx {
	public static void main(String[] args) {
		//집계 메서드 (갯수, 합계, 평균, 최대, 최소)
		
		List<Student> list = List.of(new Student("새똥이", 100),new Student("개똥이", 90),new Student("말똥이", 70));
		
		//필터링 (갯수)
		long count = list.stream().filter(s -> s.score >=80).count();
		System.out.println(count);
		//반환타입이 long이라서 count는 int가 될수없다.
		
		//점수 합계
		int sum = list.stream().mapToInt(s -> s.score).sum();
		System.out.println(sum);
		//기본자료형으로 바꾸기 위해 mapToInt 사용
		
		//점수 평균
		OptionalDouble od = list.stream().mapToInt(s -> s.score).average();
		//average를 했을때 보이는 리턴타입을 보고, 그에 맞는 타입을 생성
		System.out.println(od.getAsDouble());
		//optionalDouble이라 get으로 불러온다
		
		//이름의 최댓값
		Optional<Student> optional = list.stream().max((s1, s2) -> s1.name.compareTo(s2.name));
		System.out.println(optional); //개 말 새 중에 새가 가장 뒤라서 최댓값으로 인지
		
		//점수 최소값
		long min = list.stream().mapToLong(s -> s.score).min().getAsLong();
		System.out.println(min);
		//getAsLong(); 옵셔널 롱을 기본 롱으로 변환
		
	//	Stream.concat(null, null)
		"abcd".concat("1234"); //문자열에서도 쓸 수는 있지만 보통 + 쓴다.
		
	}
}