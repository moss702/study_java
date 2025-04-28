package lesson18;

import java.io.FileInputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("file.txt");
//		int b = fis.read();
//		System.out.println(b);
//		b = fis.read();
//		System.out.println(b);
		
//		for(int i = 0; i < 24 ; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//			
//		}
//		System.out.println(fis.read());
		
//		int b = 0;
//		while((b = fis.read()) != -1) { //eof에 도달하지않음.
//			System.out.println(b + " :: " + (char)b);
//		}
		
		
//		//바이트 배열로 읽기
//		//한번에 5개씩 읽겠다.
//		byte[] bs = new byte[50];
//		int ret = fis.read(bs, 5, 10);
//		System.out.println(Arrays.toString(bs));
//		System.out.println(ret);

		
		byte[] bs = fis.readAllBytes();
		System.out.println(Arrays.toString(bs));
		
		fis.close();
		
		
	}
}
