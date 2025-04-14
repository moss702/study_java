package lesson07;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m = new Member(); //Member
		m.num = 1;
		m.name = "전상현";
		m.age = 28;
		
		Member m2 = new Member();
		m2.num = 2;
		m2.name = "김지유";
		m2.age = 22;
		//객체에 접근하기 위해서는 .을 사용한다.
		
		m2 = m ;
		m2.age = 30;
		m.num = 3;
		
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);
		
		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);

		
		if (m == m2) {
			System.out.println("m 개체와 m2 객체는 같다.");
		} else {
			System.out.println("m 개체와 m2 객체는 같지않다.");
		}
		//주소가 달라서 같지않다고 한다!
		//같게 하고 싶다면? m2 = m ; 식으로 대입해주면 된다.
	}
}
