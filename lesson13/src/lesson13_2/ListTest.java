package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

//		ListTest lt = new ListTest();
//		System.out.println(lt.hashCode());
//		System.out.println(Integer.toHexString(lt.hashCode()));
		
		System.out.println("순차 추가");
		seqInsert(arrayList);
		seqInsert(linkedList);
		
		System.out.println("비순차 추가");
		nonSeqInsert(arrayList);
		nonSeqInsert(linkedList);

		System.out.println("순차 삭제");
		seqDelect(arrayList);
		seqDelect(linkedList);
	}
	
	static void seqInsert(List<Integer> list) { //순차추가
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000_000; i ++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
	
	static void nonSeqInsert(List<Integer> list) { //비순차추가
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 1000; i ++) {
			list.add(0,i); //0번 인덱스에 i 추가
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}

	static void seqDelect(List<Integer> list) { //순차삭제
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000_000; i ++) {
			list.remove(list.size()-1);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}

}
