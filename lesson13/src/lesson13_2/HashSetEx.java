package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Addr> set = new HashSet<>();
		set.add(new Addr("새똥이", "1234"));
		System.out.println(set);
		
		Addr addr = new Addr("개똥이", "5678");
		set.add(addr);
		set.add(addr);
		//중복값이기 때문에 추가되지않음.
		System.out.println(set);
		
		//equals() 불린, hashcode() 인트
		Addr addr2 = new Addr("말동이", "1234");
		set.add(addr2);
		System.out.println(set);
	
		for(Addr a : set) {
			System.out.println(a.hashCode()); //새똥 1509442, 개똥 16...
		}
		System.out.println(addr2.hashCode()); //1509442
		//해시코드,이퀄스 메소드를 이용해서 tel이 겹칠시 해시코드를 동일처리.
		//말동이와 새똥이의 해시코드가 동일해서 중복처리할수있음
	}
}

class Addr implements Comparable<Addr>{
	String name;
	String tel;
	public Addr(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return String.format("Addr [name=%s, tel=%s]", name, tel);
	}
	@Override
	public boolean equals(Object obj) { //<< 여기 있는 obj는 파라미터라서 변경불가
		return tel.equals(((Addr)obj).tel);
		//파라미터로 전달받은 (Addr)obj.tel과 내가 가진 tel이 같은문자열인지 비교
	}
	@Override
	public int hashCode() { //<< int타입 리턴
		return tel.hashCode();
	}
	@Override
	public int compareTo(Addr o) {
		return -name.compareTo(o.name);
	}
	
	
	
}