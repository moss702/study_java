package serviece;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static utils.BankUtils.*;
import domain.Acount;
import domain.Customer;

public class AcountServiece {
	private List<Acount> acounts = new ArrayList<>();
	
	private static AcountServiece acountServiece = new AcountServiece();
	private AcountServiece() {}
	public static AcountServiece getInstance() {
		return acountServiece;
	}
	
	private CustomerServiece customerServiece = CustomerServiece .getInstance();
	
	//개설
	public void open() {
		int no = 1;
		if(!acounts.isEmpty()) {
			no = acounts.get(acounts.size()-1).getNo()+1;
		}
		acounts.add(new Acount(no, customerServiece.getLoginCustomer(), nextLine("비밀번호 > ")));
	}
	
	//출력
	public void print(List<Acount> list) {
		for(Acount a : list) { 
			System.out.println(a);
		}
	}
	
	
	//입금
	public void deposit() {
		List<Acount> myAcounts = findAcountsBy(customerServiece.getLoginCustomer());
		print(myAcounts);
		int no = nextInt("입금할 계좌를 입력하세요 > ");
		Acount acount = findBy(no);
		if(acount == null) { //잘못된 계좌 입력시
			System.out.println("없는 계좌번호 입니다 > ");
			return;
		}
		acount.setAmount(acount.getAmount() + nextLong("입금할 금액을 입력하세요 > "));
	}
	
	//출금
	public void withdraw() {
		List<Acount> myAcounts = findAcountsBy(customerServiece.getLoginCustomer());
		print(myAcounts);
		int no = nextInt("출금할 계좌를 입력하세요 > ");
		Acount acount = findBy(no);
		if(acount == null) { //잘못된 계좌 입력시
			System.out.println("없는 계좌번호 입니다 > ");
			return;
		}
		long amount = nextLong("출금할 금액을 입력하세요 > ");
		if(acount.getAmount() < amount) {
			System.out.println("잔고가 부족합니다.");
			return;
		}
		acount.setAmount(acount.getAmount() - amount);
	}
	
	//이체
	public void transfer() {
		List<Acount> myAcounts = findAcountsBy(customerServiece.getLoginCustomer());
		print(myAcounts);
		int no = nextInt("출금할 계좌를 입력하세요 > ");
		Acount acount = findBy(no);
		if(acount == null) { //잘못된 계좌 입력시
			System.out.println("없는 계좌번호 입니다 > ");
			return;
		}		
		long amount = nextLong("이체할 금액을 입력하세요 > ");
		if(acount.getAmount() < amount) {
			System.out.println("잔고가 부족합니다.");
			return;
		}		
		int targetNo = nextInt("이체 대상 계좌번호를 입력하세요 > ");
		Acount targetAcount = findBy(targetNo);
		if(targetAcount == null) {
			System.out.println("없는 계좌번호 입니다 > ");
			return;
		}
		String targetName = targetAcount.getCustomer().getName();
		if(nextConfirm(targetName + "님의 계좌로 " + amount + "원을 입금합니다.")) {
			System.out.println("취소되었습니다.");
			return;
		}
		acount.setAmount(acount.getAmount() - amount); //내 계좌 금액 체크.
		targetAcount.setAmount(targetAcount.getAmount() + amount); //계좌이체
	}
	
	//해지
	public void close() {
		List<Acount> myAcounts = findAcountsBy(customerServiece.getLoginCustomer());
		print(myAcounts);
		int no = nextInt("해지할 계좌를 입력하세요 > ");
		Acount acount = findBy(no);
		if(acount == null) { //잘못된 계좌 입력시
			System.out.println("없는 계좌번호 입니다 > ");
			return;
		}
		if(!nextConfirm("정말 해지하시겠습니까? (*남은잔고는 사라집니다.)")) {
			return;
		}
		acounts.remove(acount);
	}
	
	//입력:고객, 출력:list<계좌>
	public List<Acount> findAcountsBy(Customer c) {
//		List<Acount> ret = new ArrayList<>();
//		for(Acount a : acounts) {
//			if(customerServiece.getLoginCustomer() == c) {
//				ret.add(a);
//			}
//		}
//		return ret;
		
		return acounts.stream().filter(a -> a.getCustomer() == c).collect(Collectors.toList());
	}
	
	//findBy
	public Acount findBy(int no) {
		for(Acount a : acounts) {
			if(no == a. getNo()) {
				return a;
			}
		}
		return null;
	}
	
	
}