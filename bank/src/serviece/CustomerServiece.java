package serviece;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utils.BankUtils;

public class CustomerServiece {
	private List<Customer> customers = new ArrayList<>();
	//가입한 데이터를 이 리스트에 넣을 예정
	private Customer loginCustomer; 
	
	private static CustomerServiece CustomerServiece = new CustomerServiece();
	private CustomerServiece() {}
	public static CustomerServiece getInstance() {
		return CustomerServiece;
	} //싱글톤 설정
	
	{
		customers.add(new Customer(1,"새똥이", "010-1111-2222","ssa@gmail.com", "ssa", "1234"));
	}
	
	public Customer getLoginCustomer() {
		return loginCustomer;
	}

	public void register() {
		System.out.println("회원가입");
	}
	
	public void login() { //로그인
		String id = BankUtils.nextLine(" 아이디 > ");
		String pw = BankUtils.nextLine("비밀번호 > ");
		
		boolean flag = false;
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
	}
	
	public void logout() {
		loginCustomer = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
