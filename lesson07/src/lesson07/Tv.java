package lesson07;

public class Tv {
	// 필드 (멤버 변수)
	// 넣을 요소 : 전원상태 / 채널 / 볼륨

	// 메서드 (함수, 기능)
	// 전원조절 + 채널업,다운 + 볼륨 업,다운
	
	boolean power ;
	int channel ;
	int volume ;
	// 필드 생성
	
	void doPower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	//메서드 생성
	
	//필드 3개와, 메서드 5개를 합쳐서, 멤버가 8개라고 말한다.
	
}
