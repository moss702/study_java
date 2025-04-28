package lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		//output2.txt 파일을 output3.txt파일로 복사하기
		//file input stream, file output stream
		
		FileInputStream fis = new FileInputStream("output2.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt");
		
//		fos.write(fis.readAllBytes());
//		fos.write(fis.read()); //1byte씩 복사
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			fos.write(b); //1byte씩 복사
//		}

		byte[] bs = new byte[10];
		int length = 0;

		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0, length);
		}
		
		
		
		fis.close();
		fos.close();
		

	}
}
