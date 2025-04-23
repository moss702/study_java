package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class SortEx {
	public static void main(String[] args) {
		String str1 = "AA";
		String str2 = "AAAA";
		
		System.out.println(str1.compareTo(str2));
		
		System.out.println(Integer.compare(10, 20)); //부호만 중요! 결과값은 -1

		Set<Data> set = new TreeSet<>();
		set.add(new Data(5, "A"));
		set.add(new Data(3, "A"));
		set.add(new Data(1, "A"));
		set.add(new Data(2, "A"));
		set.add(new Data(4, "A"));
		System.out.println(set);
	}
}

class Data implements Comparable<Data>{
	int i;
	String name;

	public Data(int i, String name) {
		this.i = i;
		this.name = name;
	}
	@Override
	public int compareTo(Data o) {
		//i값을 기준으로 오름차순
		//i값이 서로 같을 시 name값 내림차순
		//가독성을 위해 변수 생성
		int ret = 0;
		ret = this.i - o.i; // 오름차순 처리
		if(ret == 0) { // 같으면 내림차순 처리
			return -name.compareTo(o.name);
		} //모든 필드에서는 this.가 생략된것. 컴파일러가 알아서 붙여준다.
		return ret;
		//return o.i -i; //내림차순 (음수)
		//return -(i - o.i); //위와 동일
		//return i - o.i; //오름차순 (양수)	
	}
	
	@Override
	public String toString() {
		return String.format("Data [i=%s, name=%s]", i, name);
	}
}