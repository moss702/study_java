package lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObectStream2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		Object o = ois.readObject();
		List<Student> s = null;

		try {
			s = (List<Student>) o;
		} catch (ClassCastException e) {
			System.out.println(s);
		}
				
	}
}
