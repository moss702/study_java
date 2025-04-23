package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoxMain {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setItem("양말");
		System.out.println(box.getItem());
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		
		Comparator<Object> comp = (a , b) -> 0;
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp);
		
	}
}


class Box<T> { 
	//인스턴스할때로 결정을 미룰수있게 제네릭을 쓴다. (<T>는 타입)
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
//	public static void sm(T t) { //static이 있으면 안됨.
//		System.out.println(t);
//	}
//	public void sm(T t) { //static이 없으면 됨.
//		System.out.println(t);
//	}
//	public static <T> void sm(T t) { //static이 있을거면 문법이 좀 달라진다.
//		System.out.println(t);
//	}
	
}