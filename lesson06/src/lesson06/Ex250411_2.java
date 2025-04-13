package lesson06;

public class Ex250411_2 {
	public static void main(String[] args) {
	//교재 연습문제 111p~ 7문제
		//====================================================================
		System.out.println("[1문 : 1~100 정수 중 5의 배수의 합계를 출력]");
		
		int sum = 0;
		//for문을 이용하여 반복 합계 연산
		for (int i = 1 ; i < 101 ; i++) {
			if (i % 5 == 0) { //5의 배수가 되었을때
				sum += i; // sum에 i값을 더한다.
			}
		}
		System.out.println("5의 배수의 합계는 " +sum);
		//====================================================================
		System.out.println("===============================================");
		System.out.println("[2문 : 1~100 정수 중 짝수와 홀수의 합]");
		
		int evenSum = 0;
		int oddSum = 0;
		
		//for문을 이용하여 반복 합계 연산
		for(int i =1 ; i <= 100; i++) {
			if(i % 2 == 0) { //짝수면
				evenSum += i;
			}
			else { //홀수면
				oddSum +=i;
			}
		}
		System.out.println("짝수의 합계는 "+ evenSum);
		System.out.println("홀수의 합계는 "+ oddSum);
		//====================================================================
		System.out.println("===============================================");
		System.out.println("[3문 : 두개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수 출력]");
		for(int x=1 ; x <=6 ; x++) { //주사위x가 6이하일때 반복
			for (int y=1; y <=6; y++) { //주사위y가 6이하일때 반복
				if ( x + y == 6) { //두 주사위의 합계가 6일때만 실행
					System.out.printf("(%d, %d)\n",x,y);
				} 				
			}
		}
		//====================================================================
		System.out.println("===============================================");
		System.out.print("[4문 : 이중for문을 이용해서 실행결과 출력");

		for (int a = 0 ; a < 6 ; a++) {
			for (int b = 0 ; b < 5 && a > b; b++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		//====================================================================
		System.out.println("===============================================");
		System.out.println("[5문 : 이중for문을 이용해서 실행결과 출력");
		for (int a = 5 ; a > 0 ; a--) {
			for (int b = 0 ; b < 5 && a > b; b++) {
					System.out.print("*"); //a가 0일때 별 찍기 : 첫줄 별 찍기
			}
			//작아지면 된다.! i가 늘어날때 조건을.!
			System.out.println(" ");	
		}
		//====================================================================
		System.out.println("===============================================");
		System.out.println("[6문 : 이중for문을 이용해서 실행결과 출력");
		// 		
		int oddNum = 1 ; //별 찍을 홀수  1 3 5 7 9
		
		for (int a = 0 ; a < 5 ; a++) { //행 5줄
			for (int b = 4 ; b > a ; b--) { //공백 표시해줄 녀석
				System.out.print("b");
			}
			for (int c = 0 ; c < oddNum ; c++) {//홀수마다 점찍어줄녀석
			System.out.print("c");
			}
			oddNum += 2; //홀수여야하니까 항상 2 더함
			System.out.println();
		} 
		System.out.println("\n-------------------");
//		for (int i = 0 ; i < 5 ; i++) {
//			for (int j = 0 ; j < i; j++) { 
//				for(int k = 1; k <= (10 - i) / 2 && j == 1; k++) {
//					System.out.print(" ");
//				}
//				System.out.print("*");
//				i++;
//			}
//			System.out.println();
//		} //상현님 코드
		//====================================================================
		System.out.println("===============================================");
		System.out.println("[7문 : 주사위의 눈이 6이 나올때까지 반복굴리고, 주사위 굴린 횟수 출력");
		int count =0 ;
		int dice = 0 ; 
			while (dice != 6) {			
				dice = (int)(Math.random() * 6 + 1);
				System.out.print(dice);
				System.out.print(" ");
				count++; 
			}
		System.out.println(">> 주사위 굴린 횟수는 : " + count);
		//====================================================================	
	}
}

