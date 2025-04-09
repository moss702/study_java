package lesson04;

public class Practice {
		public static void main(String[] args) {
			
// 2025 04 08 : 실습 10문제			
//--------------------------------------------------------------------
//		[문제 1] 사탕 나눠주기
//		한 사람이 사탕 72개를 가지고 있다. 이 사탕을 6명에게 똑같이 나눠주려고 한다.
//		각 사람이 받는 사탕 수를 계산하여 출력하시오.
			
		int candy = 72;
		int six = candy / 6;
		System.out.println("01문 : 사탕 "+candy+"개를 6명에게 나눠주면 인당 "+six+"개씩 먹어요");

//--------------------------------------------------------------------
//		[문제 2] 나머지 계산
//		컵케이크 23개를 4명이 나눠 가질 때, 남는 컵케이크의 개수를 출력하는 코드를 작성하시오.
		
		int cake = 23 ;
		int four = cake % 4 ;
		System.out.println("02문 : 컵케이크 "+cake+"개를 4명에게 나눠주면 "+four+"개가 남아요");
//--------------------------------------------------------------------
//		[문제 3] 입장 조건 확인
//		놀이기구를 타려면 키가 150cm 이상이어야 한다.
//		키가 148cm인 사람이 탈 수 있는지를 boolean으로 출력하시오.
		
		int sei = 160 ;
		boolean noru = sei >= 150 ;
	
		System.out.println("03문 : 놀이기구 " + (noru == true ? "탑승가능" : "탑승불가"));
//--------------------------------------------------------------------
//		[문제 4] 점수 더하기
//		변수 score에 10을 저장한 후,
//		20점을 추가한 뒤 score의 값을 출력하는 코드를 작성하시오.
		
		int score =10;
		
		System.out.println("04문 : "+score+"에 20점을 더하면 "+(score+20)+"점");
//--------------------------------------------------------------------
//		[문제 5] 레벨 변화
//		레벨이 3으로 시작해서 2번 증가하고, 1번 감소하였다.
//		현재 레벨을 출력하는 코드를 작성하시오.
//		(단, 증감 연산자만 사용할 것)
		
		System.out.println("05문 : 3으로 시작 > 2번 증가 > 1번 감소");
		int lev = 3 ;
		System.out.println("  1. lev : " + lev);
		System.out.println("  2-1. ++lev : " + ++lev);
		System.out.println("  2-2. ++lev : " + ++lev);
		System.out.println("  3. --lev : " + --lev);
//--------------------------------------------------------------------
//		[문제 6] 티켓 검사
//		hasID = true, hasTicket = false인 상태에서
//		두 조건이 모두 만족되어야 입장할 수 있도록
//		canEnter의 값을 boolean으로 출력하시오.
		
		boolean hasID = true ;
		boolean hasTicket = false ;
	
		boolean canEnter = hasID == true && hasTicket == true ;
	//	boolean canEnter = hasID && hasTicket ;
		//true라면 딱히 true와 같은가? 표시 안해줘도 되나봐.
		System.out.println("06문 : "+canEnter);
//--------------------------------------------------------------------
//		[문제 7] 평균 점수 구하기
//		세 과목의 점수가 각각 80, 90, 70일 때,
//		평균 점수를 계산하여 출력하는 코드를 작성하시오.
//		(단, 소수점 처리는 하지 않아도 됨)
		
		int score1 = 80;
		int score2 = 90;
		int score3 = 70;
		int avg = (score1+score2+score3)/3 ;
		
		System.out.println("07문 : "+score1+","+score2+","+score3+"의 평균은 "+avg);
//--------------------------------------------------------------------
//		[문제 8] 조건 판별식
//		다음 조건을 만족하면 true를 출력하는 코드를 작성하시오.
//
//		나이가 20세 이상이고
//
//		회원가입이 완료되어 있어야 함
//
		int age = 21;
		boolean isRegistered = true;
		
		boolean done = age >= 20 && isRegistered == true ;
		System.out.println("08문 : " + done);
//--------------------------------------------------------------------
//		[문제 9] 계산 순서 주의
//		다음 조건에 따라 점수를 계산하시오.
//
//		초기 점수는 10
//
//		3을 곱하고 5를 더한 뒤 3으로 나눈다
//		최종 점수를 출력하는 코드를 작성하시오.
		
		int firscore = 10 ;
		
		int finscore = (firscore * 3 + 5) / 3 ;
	//  가운데에 낀 +5 연산 우선순위 수정필요
//		// 결과만 나오면 되는거면 걍 세번 연산해버리기 어떤데~
//		int finscore = firscore * 3 ;
//		finscore = finscore + 5 ;
//		finscore = finscore / 3 ;
		
		System.out.println("09문 : 10에 3 곱하고 5 더하고 3으로 나누면 "+finscore);
//--------------------------------------------------------------------
//		[문제 10] 입장 심사 시스템 구성
//		어떤 공연장에서는 다음 조건을 모두 만족해야 입장이 가능하다.
//
//		나이가 18세 이상이고
//		티켓을 가지고 있으며
//		VIP가 아닐 경우만 입장 가능
//
//		다음 변수를 사용하여 입장 가능 여부(canEnter)를 판단하는 코드를 작성하시오.
//
		age = 20;
		hasTicket = true;
		boolean isVIP = false;
		
		canEnter = age >= 18 && (hasTicket == true && isVIP == false);
		canEnter = age >= 18 && hasTicket && !isVIP;
		System.out.println("10문 : "+ canEnter);	
		
		
		}
}
