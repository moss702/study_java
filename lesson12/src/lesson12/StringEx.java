package lesson12;

import java.io.File;
import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcd1234abcd";
		System.out.println(str.length());
		
		//indexOf : 해당 문자열의 위치가 몇번째인덱스인가
		System.out.println(str.indexOf("d"));
		//0번 인덱스에서 가장 먼저 탐색된 녀석의 인덱스를 확인
		System.out.println(str.indexOf("d3"));
		//찾을수없는 녀석은 -1로 표기
		System.out.println(str.indexOf("d", 4));
		//4번 인덱스부터 탐색시작하라는 뜻.
		System.out.println(str.indexOf("d", 4, 10));
		//idx 4~10 사이에서 탐색하라는 뜻. 탐색못해서 -1 출력.
		
		//lastIndexOf : 오른쪽에서부터 탐색
		System.out.println(str.lastIndexOf("d"));
		//11
		System.out.println(str.lastIndexOf("d", 4));
		//4번인덱스부터 왼쪽으로, 바로앞에있는 3번인덱스 확인
		
		//substring : 이 위치에서부터 잘라라
		System.out.println(str.substring(4));
		//4번 인덱스부터 컷. 1234abcd
		System.out.println(str.substring(4,10));
		//1234ab
		
		
		System.out.println(str.indexOf("c"));
		System.out.println(str.lastIndexOf("c"));
		System.out.println(str.substring(str.indexOf("c"),str.lastIndexOf("c")));
		//(2,10)이 아니라
		
		//대문자로 바꾸기 
		System.out.println(str.toUpperCase());
		
		String[] fileNames = { "abcd.txt","1234.txt", "abcd.exe", "abcd.bin"};
		//startwith와 endwith를 사용해서
		// 확장자가 txt인 파일만 출력
		// 파일명이 abcd인 파일만 출력
		for (int i = 0; i < fileNames.length ; i ++) {
			if (fileNames[i].startsWith("abcd")) {
				System.out.println(fileNames[i]);
			} else if (fileNames[i].endsWith("txt")) {
				System.out.println(fileNames[i]);
			}			
		}
//	System.out.println(fileNames[0].startsWith("abcd"));				
//	System.out.println(fileNames[0].endsWith("txt"));
		
		for (int i = 0; i < fileNames.length ; i ++) {
			if(fileNames[i].endsWith(".txt")) {
				System.out.println(fileNames[i]);				
			}
		}
		for (int i = 0; i < fileNames.length ; i ++) {
			if(fileNames[i].startsWith("abcd")) {
				System.out.println(fileNames[i]);				
			}
		}
		
		File dir = new File("C:\\Users\\TJ\\workspace_java_PHJ");
		System.out.println(dir.isFile()); //파일인지 묻기
		System.out.println(dir.isDirectory()); //폴더인지 묻기
		
		String[] list = dir.list();
		for(String s : list) { //list를 순회했을때 나오는 하나하나의 이름 s
			if(!s.startsWith("lesson") ) {
				System.out.println(s);
			}//lesson으로 시작하지 않는 이름만 출력하기
		}
		System.out.println("=========================================");
		// 문자열 > 문자열 배열
		String[] strs = str.split(""); //12개의 문자열 배열이 된다
		//"" 원래 세퍼레이터 분리자가 들어가야함.
		//String[] strs = str.split("c"); 이라면 [ab, d1234ab, d]가 출력. 구분자가 c.
		System.out.println(Arrays.toString(strs)); //[a, b, c, d, 1, 2, 3, 4, a, b, c, d]
			
		System.out.println("=========================================");
		// 문자열 배열 > 문자열
		String str3 = String.join("", strs);
		System.out.println(str3); //a+b+c+d+1+2+3+4+a+b+c+d
			
		System.out.println("=========================================");
		//문자열 > 문자 배열
		char[] chs = str.toCharArray();
		for(int i = 0 ; i < chs.length; i++) {
			System.out.println(chs[i]); }
		System.out.println("=========================================");
		//문자 배열 > 문자열
		String str2 = new String(chs);
		System.out.println(str2);
		
		
		
		
	}
}
