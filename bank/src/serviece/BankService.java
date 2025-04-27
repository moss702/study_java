package serviece;

import utils.BankUtils;

public class BankService {


	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService; 
	} //싱글톤 설정
	
	private CustomerServiece customerServiece = CustomerServiece.getInstance();
	//싱글톤 생성했으니 싱글톤 호출
	
	public void menu() {
		try {
			if(customerServiece.getLoginCustomer() == null) { //null :비로그인 상태, 그외 : 로그인 상태
				int no = BankUtils.nextInt("[1. 회원가입] [2. 로그인]");
				switch (no) {
				case 1 :
					customerServiece.register();
					break;
				case 2 :
					customerServiece.login();
					break;
				}
			}
			else {
				System.out.println("===============로그인 상태");
				int no = BankUtils.nextInt("[1.로그아웃] [2.내정보 조회] [3.내정보 수정] [4.탈퇴]");	
				switch (no) {
					case 1 :
						customerServiece.logout();
						break;
					case 2 :
						customerServiece.read();
						break;
					case 3 :
						customerServiece.modify();
						break;
					case 4 :
						customerServiece.remove();
						break;
				}
			}
		}			catch (NumberFormatException e) {
			System.out.println("정확한 숫자를 입력하세요");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
	}
}
