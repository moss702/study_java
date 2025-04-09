package lesson05;

public class Ex250409_2 {
	public static void main(String[] args) {
		// 교재 연습문제 (p.79~80)
		
	System.out.println("[1문] 한반에 27명. 5다스를 모두에게 나눠주면 몇개가 남을까");
	
	int colorPen = 5 * 12 ;
	int studentCount = 27 ;
	
	int divColorPen = colorPen / studentCount ;
	System.out.println("학생당 나눠가지는 색연필 수 : " + divColorPen );
	//학생들에게 펜을 나눠주면 각자 갖게되는 색연필의 갯수
	
	int remainColorPen = colorPen % studentCount ;
	System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen );
	//전부 나눠주고 남은 색연필의 갯수

	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	System.out.println("[2문] 놀이기구에 탈 수 있을까");
	
	int age = 4 ;
	int height = 120 ;
	int parent = 1 ; // 1 : 부모동반, 0 : 부모동반하지않음
	int hearchDease = 1 ; // 1 : 심장질환없음, 0 : 심장질환있음 
	
	boolean noru = false ;
		//기본값 = 탑승불가
	
	if (hearchDease == 1) {
		//심장질환 없다면 참
		if (height >= 120) {
			//키120 넘는다면 참
			if (age >= 6) {
				//6세이상이면 참
				noru = true;
			}
			else if (parent == 1) {
				//6세이상은 아니지만 부모동반함
				noru = true ;
			}
		}	
	
	System.out.println(noru);
	//이거 문자열로 바꾸는거 어케하더라.. 일단 다른 문제 풀기~
	}
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	System.out.println("[3문] 연도를 입력하면 윤년인지 아닌지 판단");
	
	int year = 2020;
//	boolean leapYear  ;
	
	//윤년이면 true, 윤년이 아니면 false
//	System.out.println(leapYear);
	
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	System.out.println("[4문] 가게에서 물건 구매");
	
	int 
	
	
	}
}
