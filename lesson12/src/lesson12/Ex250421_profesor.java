package lesson12;

import java.util.Arrays;

public class Ex250421_profesor {
	public static void main(String[] args) {
		//인터넷 주소 속 특수기호는 약속
		//프로토콜 :// 도메인 / 파일명 ? 쿼리스트링 <<변수에 담을 수 있게 깔끔하게 자르기
	
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=afd5459b";

		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);	

	}
}
class MyUrl { 
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;
	
	public MyUrl(String url) {
		protocol = url.substring(0,url.indexOf("://"));	
		//프로토콜 추출 : https
		url = url.substring(url.indexOf("://")+ "://".length()); 
		//search.naver.com/search.naver?where=nexearch&s...
		domain = url.substring(0,url.indexOf("/"));	
		//도메인 추출 : search.naver.com
		url = url.substring(url.indexOf("/")+ "/".length()); 
		//search.naver?where=nexearch&s...
		fileName = url.substring(0,url.indexOf("?"));	
		//파일명 추출 : search.naver
		url = url.substring(url.indexOf("?")+ "?".length()); 
		//where=nexearch&s...
		queryString = url;
		//쿼리스트링 추출
		String[] tmps = queryString.split("&");
		
		params = new Param[tmps.length];
		for(int i = 0 ; i < tmps.length ; i++) {
			//	System.out.println(tmps[i]);
			String[] t = tmps[i].split("=");
			params[i] = new Param(t[0], t[1]);
		}
	}
	
	@Override
	public String toString() {
		return String.format("MyUrl [protocol=%s, domain=%s, fileName=%s, params=%s]", protocol, domain, fileName,
				Arrays.toString(params));
	}
	
	class Param{
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("[key=%s, value=%s]", key, value);
		}
	}
}
