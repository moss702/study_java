package lesson13_2;

import java.util.Iterator;
import java.util.Set;

public class IterEx {
	public static void main(String[] args) {
		Set<Integer> set = Set.of(10, 20, 30, 40, 50);
		System.out.println(set);
		//set이라 지멋대로 정리
		
		Iterator<Integer> it = set.iterator();
//		System.out.println(it.next()); //첫번째걸 보고 반환 >> 커서를 움직여 다음 노드 탐색
//		System.out.println(it.next()); //한방향이라 다음방향으로 가기만 함. 되돌아갈수는 없음.
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); //set보다 더 많은 수를 요청하면 터진다..
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		//is, has 로 시작하는 메서드는 거의 불린타입. while문이랑 같이 쓴다!
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
	}
}
