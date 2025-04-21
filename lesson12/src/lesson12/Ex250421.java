package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=afd5459b";
		//인터넷 주소 속 특수기호는 약속
		//프로토콜 :// 도메인 / 파일명 ? 쿼리스트링 <<변수에 담을 수 있게 깔끔하게 자르기
		
		
		
		System.out.println("=====프로토콜/도메인/파일명=====");
		//1. 위 항목에 맞춰 문자열 자르기
		
		String cut = (url.substring(0,url.lastIndexOf("?")));
		String[] protocol = cut.split("/");
		System.out.println(Arrays.toString(protocol));
		
		//[https:, , search.naver.com, search.naver]
		//어휴 https:// 어캄?
		
		System.out.println("===========쿼리스트링===========");
		//쿼리스트링의 규칙
		// 키(변수명)=값(실제값) & 키(변수명 ...
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		String cut2 = (url.substring(url.indexOf("?")+1,(url.length()))); //이거 김밥 됐는데여???
		String[] queryString = cut2.split("&");
		
		//System.out.println(Arrays.toString(queryString));
		///출력 : [where=nexearch, sm=top_hty, fbm=0, ie=utf8, query=%EA%B3%A0%EC%96%91%EC%9D%B4, ackey=afd5459b]
		
		for(String q : queryString) {
			System.out.println(q);
		}
		///출력
/*		where=nexearch
*		sm=top_hty
*		fbm=0
*		ie=utf8
*		query=%EA%B3%A0%EC%96%91%EC%9D%B4
*		ackey=afd5459b
*/
		System.out.println("=========쿼리스트링 키/값=========");
		//키랑 값도 나눠볼까..?
		//String[] cutKey = queryString.split("="); // 이미 문자열 배열이라 안잘리나?
		//String cutKey = String.join("",queryString);
		//System.out.println(cutKey); //으악 &가 없어서 다 섞여버렷다
		//출력 : where=nexearchsm=top_htyfbm=0ie=utf8query=%EA%B3%A0%EC%
		//그럼 문자열 배열 유지한채로 for문 돌리자
		
		String[] queryKey = new String[queryString.length];
		for(int i = 0 ; i < queryString.length; i++) {
			for(int j = i; j < i; j++) {
				queryKey[i][j] = (queryString[i].substring("="));				
			}
		}
		//흠.... 배열은 substring 안되남? 그럼 배열[i]를 문자열 하나하나에 넣어놓ㄱ ㅣ엔 변수가 너무 많아진다
		//한번은 & 떼고 한번은 = 떼고 각 key val 배열에 넣는건? 이중포문 써서 ㅇㅋ 고
		
		String[] queryKey = new String [queryString.length];
		String[] queryVal = new String [queryString.length];
		for (int i = 0 ; i < queryString.length; i++) {
			queryKey[i] = cut2.split("=");
		}
	}
}
