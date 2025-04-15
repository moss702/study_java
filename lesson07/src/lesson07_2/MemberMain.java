package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {
		//this : 미래에 생성될 객체의 주소값
		Member m = new Member(20);
		//new Member 생성자 호출
		System.out.println(m.num);
		System.out.println(m);
		Member member = m.m1(); 
		System.out.println(member);
		//m과 member의 주소가 동일하다
		// this? 주소
	//	m.m2(m); (this:내타입
		
	}
}
class Member {
	int num = 10;
	Member(int num){
		this.num = num ; //생성자
		//동명의 생성자인데 this.이 없다면?
		//main에서 20을 준다고 해도 무시하고 가장 가까운 10의 값을 덮어써서 가져온다.
	}
	Member m1() { //매서드 //근데 반환타입이 본인
		return this;
	}
	void m2(Member m) { //반환은 안함. 근데 날 출력함?
		System.out.println(m);
	}
}
