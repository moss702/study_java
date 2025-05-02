package domain;

import java.util.Date;

//회원 1명당 계좌 0~n개
//어카운트는 회원을 알아야 함.

public class Acount { //계좌 정보 (추가, 예금, 출금, 이체)
	//========================================== 필드
	//계좌번호
	private int no;
	
	//잔고
	private long amount;
	
	//예금주, 또는 회원번호 필요 = (커스토머타입)
	//여기서는 회원 덩어리로 해봄
	private Customer customer;
	
	
	//계좌 비밀번호 //0으로 시작할수도있어서 int 못씀
	private String pw;
	
	//한도액수
	private long limit = 1_000_000; //이체한도
	
	//계좌개설일자
	private Date date = new Date();    //이 객체를 생성한 현재시간
	
	
	
	//==========================================생성자, getter/setter, toString
	public Acount() {
	}

	public Acount(int no, Customer customer, String pw) {
		super();
		this.no = no;
		this.customer = customer;
		this.pw = pw;
	}

	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public long getAmount() {
		return amount;
	}


	public void setAmount(long amount) {
		this.amount = amount;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public long getLimit() {
		return limit;
	}


	public void setLimit(long limit) {
		this.limit = limit;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return String.format("Acount [no=%s, amount=%s, customer=%s, pw=%s, limit=%s, date=%s]", no, amount, customer,
				pw, limit, date);
	}
	
	
}
