package serviece;

import utils.BankUtils;

public class BankService {


	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService; 
	} //싱글톤 설정
	
	private CustomerServiece customerServiece = CustomerServiece.getInstance();
	private AcountServiece acountServiece = AcountServiece.getInstance();
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
				int no = BankUtils.nextInt("[1.내정보 조회] [2.내정보 수정] [3.탈퇴] [4.계좌개설] [5.입금] [6.출금] [7.이체] [8.계좌해지] [9.로그아웃]");	
				switch (no) {
					case 1 :
						customerServiece.mypage();
						break;
					case 2 :
						customerServiece.modify();
						break;
					case 3 :
						customerServiece.remove();
						break;
					case 4 :
						acountServiece.open();
						break;
					case 5 :
						acountServiece.deposit();
						break;
					case 6 :
						acountServiece.withdraw();
						break;
					case 7 :
						acountServiece.transfer();
						break;
					case 8 :
						acountServiece.close();
						break;
					case 9 :
						customerServiece.logout();
						break;
				}
			}
		}	catch (NumberFormatException e) {
			System.out.println("정확한 숫자를 입력하세요");
		}	catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
	}
}
