package domain;

public class Customer { //고객 정보 (등록, 탈퇴)
	//이름, 연락처, 이메일, 회원번호, 아이디, 비밀번호
	
	
	//========================================== 필드
	private int no; //회원번호
	private String name; //이름
	private String tel;//연락처
	private String email; //이메일
	private String id; //아이디
	private String pw; //비밀번호
	
	//기본 생성자
	//모든 필드사용 생성자
	//getter/setter
	
	
	
	//==========================================생성자, getter/setter, toString
	
	public Customer() {	} //기본생성자도 ctrl+space로 자동완성가능!

	public Customer(int no, String name, String tel, String email, String id, String pw) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.id = id;
		this.pw = pw;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return String.format("Customer [no=%s, name=%s, tel=%s, email=%s, id=%s, pw=%s]", no, name, tel, email, id, pw);
	}
	
	
}
