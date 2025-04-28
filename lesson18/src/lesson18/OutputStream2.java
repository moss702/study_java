package lesson18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStream2 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos2 = new FileOutputStream("output2.txt");

		for(int i = 'A' ; i <= 'Z'; i++) {
			fos2.write(i);
		}
		fos2.write(10);
		
		for(int i = 'a' ; i <= 'z'; i++) {
			fos2.write(i);
		}
		fos2.write(10);

		for(int i = '0' ; i <= '9'; i++) {
			fos2.write(i);
		}
		
		fos2.close();

	}
	
}
