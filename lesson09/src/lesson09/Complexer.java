package lesson09;

public class Complexer implements Printer, Scanner, Fax {
	// Printer,Scanner,Fax에 있는 총 4개의 추상 메서드
	// 그걸 Complexer가 전부 구현(오버라이드)해야한다

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 전송");
		
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel + "에서 " +FAX_NUMBER + "로 FAX 수신");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("출력 실행");
	}
	
	

}
