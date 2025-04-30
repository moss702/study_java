package serviece;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utils.BankUtils;

public class CustomerServiece {
	private List<Customer> customers = new ArrayList<>();
	//가입한 데이터를 이 리스트에 넣을 예정
	private Customer loginCustomer; 
	
	String serchId; //로그인정보 저장용

	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	
	private static CustomerServiece CustomerServiece = new CustomerServiece();
	private CustomerServiece() {}
	public static CustomerServiece getInstance() {
		return CustomerServiece;
	} //싱글톤 설정
	
	
	{
		customers.add(new Customer(1,"새똥이", "010-1111-2222","ssa@gmail.com", "ssa", "1234"));
	}
	
	//==============================================================================
	//입력제한_이름
	public String inputName() {
		String name =  BankUtils.nextLine("이름 입력 > ");		
		if(!name.matches("[가-힣]{2,4}")) {			
			throw new IllegalArgumentException("이름은 한글 2~4글자로 입력하세요");
		}
		return name;
	}
	//입력제한_ID
	public String inputId() {
		String id =  BankUtils.nextLine("ID 입력 > ");		
		if(!id.matches("[A-Za-z0-9_+&*-]{+}")) {			
			throw new IllegalArgumentException("id는 알파벳,숫자 구성으로 입력하세요");
		}
		return id;
	}
	//입력제한_전화번호
	public String inputTel() {
		String tel =  BankUtils.nextLine("휴대전화번호 입력 > ");		
		if(!tel.matches("01[0-9]-[0-9]{3,4}-[0-9]{4}")) {			
			throw new IllegalArgumentException("01n-nnnn-nnnn의 형식으로 입력하세요.");
		}
		return tel;
	}
	//입력제한_이메일
	public String inputEmail() {
		String tel =  BankUtils.nextLine("이메일 입력 > ");		
		if(!tel.matches("[A-Za-z0-9_+&*-]{+}@[A-Za-z0-9]{+}.[A-Za-z]{2,5}")) {			
			throw new IllegalArgumentException("ID@도메인 형식으로 입력하세요.");
		}
		return tel;
	}
	
//==============================================================================
	//등록_회원가입
	public void register() {
		String name, tel, email, id, pw;
		int count = customers.size();
		
		System.out.println("[회원가입 정보 입력]");
		name = inputName(); 
		tel = inputTel(); 
		id = inputId(); 
		pw = BankUtils.nextLine("pw 입력 > ");
		email = inputEmail(); 
		
		Customer c = new Customer(count, name, tel, email, id, pw);
		customers.add(c);
		System.out.println("회원가입 완료. 로그인해주세요.");
		
		
	}
	
	//로그인
	public void login() {
		System.out.println("[로그인 정보 입력]");
		String id = BankUtils.nextLine(" 아이디  > ");
		String pw = BankUtils.nextLine("비밀번호 > ");
		
		boolean flag = false;
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				serchId = id;
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
	}
	
	
	//로그아웃
	public void logout() {
		loginCustomer = null;
		System.out.println("[로그아웃 되었습니다.]");
	}
	
	//회원정보_조회
	public void read() {
		System.out.println("[내 회원정보 조회]");
		
		customers.forEach(System.out::println);
		//이거 지금 모든 회원의 정보가 다 뜨는데...!
		//아까 입력한 아이디로 회원넘버 가져와서 제한을 둬야할듯...한데 어떻게 가져오나요?
		//id를 호출할 수 있게 로그인 외 전부를 내부클래스로 전부 넣기........는 아닐듯..
		//변수 하나 만들고 그 안에 id 넣어둔채 이퀄스 확인해서 정보 가져오기..?
		
		//String serchId를 만들었음!! list.id랑 이퀄스 해서 걔만 출력하자!!
	}
	
	//회원정보_수정
	public void modify() {
		System.out.println("[내 회원정보 수정]");
		//조회에서 내정보만 띄우기 해결해야 이걸 할수있다..!!
	}
	
	//회원정보삭제_탈퇴
	public void remove() {
	// 로그인 되어있는 상태인데 바로 삭제할수 있을까? 그럼 무슨 정보를 가져올수있지..?
		//조회에서 특정 멤버 정보만 가져오는걸 해결해야 코드가 심플해질듯
	//확인차 아이디 재입력 받는건 어떨까
		String id = BankUtils.nextLine(" 아이디  > ");
		for(Customer c : customers) {
			if(c.getId().equals(id)) {
				boolean y = BankUtils.nextConfirm("[정말 탈퇴하시겠습니까? y/yes]");
				if(y) {
					customers.remove(c);
					System.out.println("[탈퇴 처리 되었습니다.]");
					break; 
				} else { System.out.println("탈퇴처리 취소 되었습니다."); }
			} else {
				System.out.println("[존재하지 않는 ID 입니다.]"); 
				break;	
			}
		}
	}
	
	
}
