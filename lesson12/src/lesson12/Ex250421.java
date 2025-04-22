package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=afd5459b";
		//인터넷 주소 속 특수기호는 약속
		//프로토콜 :// 도메인 / 파일명 ? 쿼리스트링 <<변수에 담을 수 있게 깔끔하게 자르기
		
		System.out.println("=====프로토콜/도메인/파일명=====");
		//1. 위 항목에 맞춰 문자열 자르기

//		String cut = (url.substring(0,url.lastIndexOf("?")));
//		String[] protocol = cut.split("/");
//		System.out.println(Arrays.toString(protocol));		
		/// 출력 : [https:, , search.naver.com, search.naver] ???

		
		String cut = (url.substring(0,url.lastIndexOf("?")));			
		String[] urlFront = cut.split(":/"); //그래서 일단 녀석을 빼서 버렷어요
		String protocol = String.join("", urlFront);
		urlFront = protocol.split("/");
		System.out.println("urlFront : " + Arrays.toString(urlFront));
		/// 출력 : [https, search.naver.com, search.naver]
		//배열로 묶었어요
	
		protocol = protocol.substring(0,protocol.indexOf("/"));
		String domain = urlFront[1];
		String fileName = urlFront[2];
		System.out.println("protocol : " + protocol);
		System.out.println("domain : " + domain);
		System.out.println("fileName : " + fileName);
		
		System.out.println("===========쿼리스트링===========");
		//쿼리스트링의 규칙
		// 키(변수명)=값(실제값) & 키(변수명 ...
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		String cut2 = (url.substring(url.indexOf("?")+1,(url.length())));
		String[] queryString = cut2.split("&");
		//System.out.println("queryString : " + Arrays.toString(queryString));
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
		
		System.out.println("=========쿼리스트링 키,값=========");
		//String cutKey = String.join("",queryString);
		//System.out.println(cutKey); //으악 &가 없어서 다 섞여버렷다
		///출력 : where=nexearchsm=top_htyfbm=0ie=utf8query=%EA%B3%A0%EC%
		//그럼 문자열 배열 유지한채로 for문 돌리자
		String[] queryKey = new String [queryString.length];
		String[] queryVal = new String [queryString.length];
		String[] box = new String[1];
		for(int i = 0 ; i < queryString.length; i++) {
			box = queryString[i].split("=");
			queryKey[i] = box[0];
			queryVal[i] = box[1];
			System.out.printf("키 : %7s, 값 : %s \n", queryKey[i], queryVal[i]);
		}
		System.out.println("키[] : " + Arrays.toString(queryKey));
		System.out.println("값[] : " + Arrays.toString(queryVal));
	
	}
}

