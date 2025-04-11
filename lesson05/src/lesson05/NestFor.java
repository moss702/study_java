package lesson05;

public class NestFor {
	public static void main(String[] args) {
		// 2중 이상 for문 사용의 대표 예시
		// 1. 구구단
		// 2. *  별찍기
		
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i >= j) {
					System.out.printf("(%d,%d)",i , j);
				}
			}
			System.out.println();
			
			
			
		}
		System.out.println("ㅡㅡㅡㅡㅡ369ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//각 자리의 숫자가 3,6,9였을때 숫자 언급 대신 개수만큼의 짝 소리 표현
	//	for (int i = 1 ; i <= 50 ; i++) {
	//		for ( i < 10  && i % 3 == 0; i++) { //9 지나면 i+1 하면 좋을거같은디
	//  		System.out.println("짝");
	//  	}
			
	//   	for (  ; i <  && i % 3 == 0; i++) { //9 지나면 i+1 하면 좋을거같은디
	//			System.out.println("짝");
			
	//			System.out.println(i);
	//		}
		
		
		for (int i = 1 ; i <= 50 ; i++) {
		//	System.out.printf("%3d, %3d, %3d\n %s\n", i , i % 10 , i % 10 % 3, i % 10 % 3 == 0 && i % 10 != 0 ? "짝" : "");
			//	i % 10 % 3 : 1의 자리가 0일때도 박수를 친다..
			int tmp = i % 10 ; //10으로 나눴을때 0이 아닐때까지(두자리수) 나눈다
			int count = 0;
			
			do{
				if (tmp % 3 == 0 && tmp != 0) {
					System.out.print("짝");				
				}
				else {
					System.out.print(i);
				}
				tmp /= 10;
			}
			while (tmp != 0);
			System.out.println();
		}
		System.out.println("-----------------------------");

		//공약수
		// 두 수의 약수 구하기
		// 두 수의 약수 중 겹치는게 있다면 공약수
		// 12와 18의 공약수 : 1 2 3 6
		
		int a = 12;
		int b = 18;
		
		int gcd = 0 ;
		//최대공약수를 위한 변수 하나 만들기
		
		//a에 대한 약수 먼저 구하기
		for(int i = 1 ; i <=a ; i++) {
			for(int j = 1 ; j <= b ; j++) {
				if(a % i == 0 && b % j == 0 && i == j) {
					gcd = i ; // 1,2,3,6
					// 출력이 아니라 덮어쓰기를 하면 됨
				}
			}
		}
		System.out.println(gcd);
		
		
		
	}
}
