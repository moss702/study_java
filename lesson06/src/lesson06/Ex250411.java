package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		
		
		//1. 187000원
		//50000 , 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐 갯수 계산
		//배열 사용 for
		
		int price = 123_000;

		int[] units = { 50000, 10000, 5000, 1000 } ;
		int[] count = new int [units.length]; //렝쓰는 갯수를 세는거다. 0~3이 아니라 걍 4개인거임!!!!
		
		
		//반복문 없이 일단 생각해보기
//		count[0] = price / units[0]; // 3 = 187_000 / 50_000
//		price %= units[0]; //187_000 => 37_000 
		
		//배열 //price 변수에 덮어쓰기 
		for(int i = 0; i < units.length ; i++) {
			count[i] = price / units[i]; //count[i] 각 인덱스 안에 장수 넣어줌
			price %= units[i]; //한 단위 넣고 남은 거스름돈은 바로 price에 덮어쓴다 < 이러면 박스 안만들어도 됨!!
		} 
		
		//예전에 했던거처럼 배열에 하나씩 값을 넣어봄.
//		count[0] = price / units[0]; 
//		box = price % units[0];
//		count[1] = box / units[1];		
//		box = price % units[1];
//		count[2] = price / units[2];		
//		box = price % units[2];
//		count[3] = box;		
		
		System.out.println(Arrays.toString(units));
		System.out.println(Arrays.toString(count));

		
		//=============================================
		System.out.println("=============임의의 문자열 10글자 생성하기============");
		//2. 임의의 문자열 생성 CAPTCHA
		//문자열 string 또는 배열 이용
		//문자열의 범위는 숫자, 영대, 영소 (69가지중하나) 10글자
		
		char[] capt = new char [10];
		//int 1 / bool 3
		
			for (int i = 0 ; i < capt.length; i++) {
				int da = (int)(Math.random() * 122 + 1) ;
					
					//  랜덤 숫자 뽑기 > 아스키해당 확인 > 변수에 하나씩 넣기 > 10개를 섞기 
					if (da >= '0' && da <= '9') { 	
						capt[i] = (char)da ;
					}
					else if (da >= 'A' && da <= 'Z' ) {
						capt[i] = (char)da ;
					}
					else if (da >= 'a' && da <= 'z' ) {
						capt[i] = (char)da ;
					}
					else {
					i--; 
					//범위 외 숫자가 나오면 인덱스 넘버 감소 > 범위 숫자 나올때까지 다시 랜덤 돌리기
					//중간에 i를 제어하려고 하면 안된대!! 나중에 복잡해진대. 차라리 조건을 바꿀것!
					}	
			}
			System.out.println(Arrays.toString(capt));
			
//		System.out.println((int)'Z'); //65~90  : 26
//		System.out.println((int)'z'); //97~122  : 26
//		System.out.println((int)'0'); //48~ 57 : 10
			
			
//===================================================			
	//		String captcha = " "; 
			char[] captcha = new char[10];
			
			//난수의 범위 0~61 (세 범위의 합)
			// 0~9 : 그대로 숫자로 쓴다
			// 10~35 : 영대문자로 쓴다
			// 36이상은 영소문자로 쓴다
			
			for(int i = 0 ; i < 10 ; i++) {
				int ch = (int)(Math.random() * 62);
				if (ch < 10) { //숫자로 쓸거임
					captcha[i] += (char)(ch + '0') ;
				}
				else if (ch < 35) { //영대 : 여기서는 10이 A.
					captcha[i] += (char)(ch + 'A' - 10); 
				}
				else { //영소 36이 a.
					captcha[i] += (char)(ch + 'a' - 36); 
				}
			}
			System.out.println(captcha);
		
		
		//=============================================
		System.out.println("=============100개의 공간을 가진 배열에 0~9 숫자 랜덤으로 넣기============");
		//3-1. 배열에 임의 값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 9, 7, 9, 2 ...]
		int[] namu = new int [100]; //100개의 빈공간 생성

		for(int index = 0 ; index < namu.length; index++) {
			int dotori = (int)(Math.random() * 10 );
//			System.out.println(dotori); // 1~9 숫자 출력 확인용
			
			namu[index] = dotori; // 뽑은 난수를 배열에 하나씩 넣기
//			System.out.print(dotori+"도토리 ");
//			System.out.println(index+"인덱스 "); //각 공간에 잘 들어갔나 체크용
		}		
		System.out.println(Arrays.toString(namu)); //배열 출력
		//=============================================

		//100개의 공간 /10개의 범위 (0~9)
		int[] arr = new int[100];

		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() *10);
		}
		System.out.println(Arrays.toString(arr));
		
		
		int[] counts = new int[10]; 
		
		for(int i = 0 ; i < arr.length ; i++) {
			counts[arr[i]]++;
		//arr의 i의 값이 4라면 counts의 4 인덱스에 1증가
		}
		
		//=============================================
		//3-2. 빈도 수 구하기
		//배열의 길이는 10 <<
		//3번에서 나온 코드를 바탕으로 3은 몇개 나왔는지, 1은 몇개나왔는지
		//허프만 코딩..? 무손실 압축의 기반

		int[] namuCount = new int[10] ; 
		// namuCount 각 위치에 0~9 숫자가 몇개 들었는지 체크 
		// namu : 100개의 숫자가 들어있음
		for(int i = 0; i < namuCount.length ; i++) { //i : 인덱스 세는용. 나무의 100개의 숫자를 확인한다..
			for	(int j = 0 ; j < namu.length; j++ ) { // j : 해당 숫자가 0~9 중에 어느것인가..?
				if (namu[j] == i) {					
					namuCount[i]++; //namu[1]이 1보다 크면 namuCount[1]이 증가....
				}
			}
		}
//		System.out.println(Arrays.toString(namu));
		System.out.println(Arrays.toString(namuCount));
		//=============================================
	}
}
