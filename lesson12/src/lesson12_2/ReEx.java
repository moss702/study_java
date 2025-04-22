package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		
		String regex = "\\d"; //숫자
		regex = "[0-9]";  //숫자
		regex = "\\D";    //숫자아님
		regex = "[^0-9]"; //숫자아님
		
		Pattern p = Pattern.compile("[A-Za-z]+");
		Matcher m;
		String[] strs = {"bat", "cat", "bed", "colab", " "};
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
		}
		
		Pattern n = Pattern.compile("[가-힣]{2,4}");
		
		
		//이메일 주소 패턴
		//휴대전화번호 패턴
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a","e")); //문자열의 a를 전부 e로 바꾼다
		System.out.println("abcd1234abcd".replaceFirst("a","e")); //문자열에서 처음만나는 a를 e로 바꾼다
		
		
		
	}
}
