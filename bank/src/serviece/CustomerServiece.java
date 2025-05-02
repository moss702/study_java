package serviece;

import java.util.ArrayList;
import java.util.List;
import static utils.BankUtils.*;

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
	
//	private AcountServiece acountServiece = AcountServiece.getInstance();
	
	{
		customers.add(new Customer(1,"새똥이", "010-1111-2222","ssa@gmail.com", "ssa", "1234"));
	}
	
	//==============================================================================
	//입력제한_이름
	public String inputName() {
		String name =  nextLine("이름 입력 > ");		
		if(!name.matches("[가-힣]{2,4}")) {			
			throw new IllegalArgumentException("이름은 한글 2~4글자로 입력하세요");
		}
		return name;
	}
	//입력제한_ID
	public String inputId() {
		String id =  nextLine("ID 입력 > ");		
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
	
	public Customer findByNo(int no) {
		for(Customer c : customers) {
			if(c.getNo() == no) {
				return c;
			}
		}
		return null;
	}
	
	public Customer findByID(String id) {
		for(Customer c : customers) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	
	
//==============================================================================
	//등록_회원가입
	public void register() {
		System.out.println("[회원가입 정보 입력]");
		String name = nextLine("이름 입력 > ");
		String tel = nextLine("HP 입력(010-1111-2222) > ");
		String email = nextLine("e-mail 입력 > ");
		String id = nextLine("ID 입력 > ");
		String pw = nextLine("PW 입력 > ");
		int no = customers.isEmpty() ? 1 : customers.get(customers.size()-1).getNo()+1;
		Customer customer = new Customer(no, name, tel, email, id, pw);
		customers.add(customer);
		
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
	public void mypage() {
		System.out.println("[내 회원정보 조회]");
		System.out.println(loginCustomer);
		System.out.println("[내 계좌정보 조회]");
		AcountServiece.getInstance().print(AcountServiece.getInstance().findAcountsBy(loginCustomer)); //내 계좌들.
	}
		
	//회원정보_수정
	public void modify() {
		System.out.println("[내 회원정보 수정]");
		String id = nextLine("[수정]ID > ");
		Customer c = findByID(id);
		if(c == null) {
			System.out.println("회원정보 없음");
			return;
		}
		String name = nextLine("[수정]이름 입력 > ");
		String tel = nextLine("[수정]HP 입력(010-1111-2222) > ");
		String email = nextLine("[수정]e-mail 입력 > ");
		String pw = nextLine("[수정]PW 입력 > ");
		
		c.setName(name);
		c.setTel(tel);
		c.setEmail(email);
		c.setPw(pw);
	}
	
	//회원정보삭제_탈퇴
	public void remove() {
		System.out.println("[탈퇴 서비스]");
		if(!AcountServiece.getInstance().findAcountsBy(loginCustomer).isEmpty()){
			System.out.println("계좌를 소지하고 있습니다. 해지 후 탈퇴가 가능합니다.");
			return;
		}
		
		if(!nextConfirm("[정말 탈퇴하시겠습니까?")) {
			return;
		}
		customers.remove(loginCustomer);
		logout();
	}
}
