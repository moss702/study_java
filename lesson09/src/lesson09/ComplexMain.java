package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c; //클래스를 수식하는, 구현될 목적으로 씀
		Comparator<?> c2;//비교하는 자. 객체로 만들려고 씀
		
		Iterable<?> i; //순환,순회,반복 가능한.
		Iterator<?> i2;//반복자. 객체를 만들려고 씀
		
	}
}
