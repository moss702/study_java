package lesson07;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
	//콘솔창을 리모콘 형태로 만들어보자
		
		Tv tv = new Tv();
		System.out.println("Tv 리모컨입니다.");
		Scanner scanner = new Scanner(System.in);
		boolean running = true ; //이 앱 자체의 러닝
		
		while(running) {
			System.out.println("현재 Tv는 " + (tv.power ? "켜" : "꺼") + "져있습니다.");
			System.out.println("채널은 " + tv.channel + ", 볼륨은 " + tv.volume + "입니다");
			
			System.out.println("수행할 메뉴를 선택하세요");
			System.out.println("1.전원관리 2.채널업 3.채널다운 4.볼륨업 5.볼륨다운 6.종료");
			
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				tv.doPower();
				break;
			case 2:
				tv.channelUp();
				break;
			case 3:
				tv.channelDown();
				break;
			case 4:
				tv.volumeUp();
				break;
			case 5:
				tv.volumeDown();
				break;
			case 6:
				running = false;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
	}
}
