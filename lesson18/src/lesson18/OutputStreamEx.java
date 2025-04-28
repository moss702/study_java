package lesson18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("output.txt",true);
		fos.write('A');
		fos.write('B');
		fos.write('C');
		
		
		byte[] bs = {' ', 48, 49, 50, 51};
		fos.write(bs);
		
		fos.write(10);
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.close();
		

		
		
	}
}
