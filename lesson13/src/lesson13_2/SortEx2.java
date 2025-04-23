package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
//		List<Integer> l = Arrays.asList(10,20,30); //배열을 리스트로
//		l.add(10); //UnsupportedOperationException :이렇게 만든 리스트는 가변길이 리스트가 아님,., 추가하면 터진다.
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10,20,30, 2, 3,1,5,60,6)); //가변길이 리스트를 만들어서 넣으면 그만이야~
		System.out.println(l);
		
		
		
	//	Arrays.asList(new Integer[] {10,20,30});
	//	List<Integer> list = new ArrayList<>();
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -(o1 - o2);
			}
		};
		
		l.sort(comparator);
		System.out.println(l);
		
		
		l.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			//구간 자체를 리터럴 쓰고 버려버림. 일회용
		});


		//람다식으로 바꿔보면?
		l.sort((Integer o1, Integer o2) -> {
			return o2 - o1;
			});
		
		//반환타입도 지정해줄 필요없음!!
		l.sort((o1, o2) -> {
			return o2 - o1;
		});
		
		l.sort((o1, o2) -> o2 - o1);
		
		
		
	}
}
