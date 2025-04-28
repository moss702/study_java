package lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BrEx {
	public static void main(String[] args) throws Exception {
		//특정 파일을 문자기반 스트림 입력
		FileReader fr = new FileReader("output2.txt");
		//버퍼기반의 보조 스트림 사용
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
//		String str = br.readLine();
//		System.out.println(str);
		
		br.close();
		
		//==================================
		//문자 <> 바이트
		
		//입력시 바이트 > 문자
		FileInputStream fis = new FileInputStream("output2.txt"); //초기 스트림형태
		InputStreamReader isr = new InputStreamReader(fis); //리더타입으로 바꿈
		BufferedReader br2 = new BufferedReader(isr); //버퍼드로 다시 바꿈
		//한줄단위 해석을 할수있다.
		
		//출력시 문자 > 바이트
		OutputStreamWriter osw;
			
			
			
		
		
	}
}
