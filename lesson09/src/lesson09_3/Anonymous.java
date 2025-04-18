package lesson09_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Anonymous {
	public static void main(String[] args) {
		//익명클래스는 이름이 없어서 생성자가 없음
		Runnable runnable = new Runnable() {
			int i = 10;
			static int si = 20;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행");
			}
			void m() {
				System.out.println(i);
			}
			void m2(int i) {
				i = 20;
			}
		};
		runnable.run();
//		runnable.m();
//		System.out.println(runnable.i);
		
		Outer outer = new Outer() {
			//여기에 쓰면 익명클래스구간
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
		outer.m();
		
		Integer[] arr = {1,5,3,2,4,1};
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			//정렬에 대한 규칙개체			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1; //0:정렬규칙이 없는 상태
				//o2 - o1 : 내림차순 5432
				//o1 - o2 : 오름차순 2345
			}
		};//익명클래스 문법
			
		Arrays.sort(arr,iter);
		System.out.println(Arrays.toString(arr));
	}
}
