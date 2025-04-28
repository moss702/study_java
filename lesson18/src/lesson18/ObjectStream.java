package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;


public class ObjectStream {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student(1, "새똥이", 100);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
		
		List<Student> list = List.of(s1, new Student(2, "개똥이", 60), new Student(3, "말동이", 80));
		
		oos.writeObject(list);
		oos.close();
	}
}


class Student implements Serializable { //연속화 대상이라는 명시
	int no;
	String name;
	int score;	
	
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
}