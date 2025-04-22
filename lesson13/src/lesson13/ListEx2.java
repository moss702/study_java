package lesson13;

import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		
		list.add("홍길동");
		list.add("새똥");
		list.add("개똥");
		list.addElement("고길동");
		
		list.remove(0);
		list.add("말동");
		list.remove("개똥");
		list.set(0, "소동");
		list.add(0,"새똥");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}
