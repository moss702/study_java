package lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerEx {
	public static void main(String[] args) {
		List<Integer> list = List.of(5,4,1,3,2);
		
//		Consumer<Integer> con = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		};
		
//		Consumer<Integer> con = t -> System.out.println(t);			
//		list.forEach(con);
		
		
		list.forEach(t -> System.out.println(t));
		
		
		Map<String, Integer> map = new HashMap<>(Map.of("A",10,"B",20));
		System.out.println(map);
		System.out.println(map.getClass().getClass());
		
		map.forEach((k,v) -> System.out.println(k + " : " + v));
		//람다식 만들기. 이름 임의로 짓기
		
		DoubleConsumer dc = d -> System.out.println(Math.round(d)); //round :반올림
		dc.accept(10.5);
		
		ObjDoubleConsumer<String> odc = (s,d) -> {};
		
		
		Supplier<String> supplier = () -> "12345";
		System.out.println(supplier.get());
		
		//1~100 list
		List<Integer> list2 =IntStream.range(0, 100).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
		System.out.println(list2);
		
		BiFunction< String, Integer, Boolean > bf = (s,i) -> s.equals(i + "");
		//근데? 불린으로 리턴받을거면 그냥 프리디케이트 쓰는게 낫다.
		BiPredicate<String, Integer> bp = (s,i) -> s.equals(i + "");
		
		DoublePredicate dp = d -> d == 0;
		//더블고정 , 프레디케이트라서 불린 필요없음. 그래서 제네릭 아예 안씀!
		
//		LongToDoubleFunction
		//롱에서 더블로 리턴. 타입(이름)에다 기능명시한것
		
		UnaryOperator<Integer> uo = i -> i;
		//파라미터도 인티저, 리턴도 인티저
		
	}
}
