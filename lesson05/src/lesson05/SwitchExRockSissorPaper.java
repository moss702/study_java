package lesson05;

import java.util.Scanner;

public class SwitchExRockSissorPaper {
	public static void main(String[] args) {

		//double com =(Math.random());
		//System.out.println(com);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요. > ");
		Scanner scanner = new Scanner(System.in);
		int me = scanner.nextInt();
		System.out.println(me);
		
		int com = (int)(Math.random() * 3 + 1);
		System.out.println(com);
		// 0 ~ 1미만의 난수 출력
		// 곱하기 3을 하면 0 , 1 , 2 중에 하나 나온다!
		// +1 함으로써 1이상 4 미만의 값이 나온다!
		// int를 통해 정수화
		String [] values = {"가위", "바위","보"};
		System.out.println("내가 낸 건 : " + values[me-1] + ", 컴퓨터가 낸 건 : " + values[com-1]);
		
		switch (me-com) {
			case 0 :
				System.out.println("비겼습니다");
				break;
			case 1 : case -2 :
				System.out.println("이겼습니다");
				break;
			case 2 : case -1 :
				System.out.println("졌습니다");
				break;
			
			default :
				System.out.println("잘못된 입력");
				
		}
		
		
		
		
	}

}
