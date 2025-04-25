package serviece;

import domain.Customer;
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
			System.out.println("로그인 상태");
			int no = BankUtils.nextInt("[1.로그아웃]");	
			switch (no) {
				case 1 :
					customerServiece.logout();
					break;
			}
		}
	}
}
