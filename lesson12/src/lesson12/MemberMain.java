package lesson12;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member("새똥이", "02-1234-5678");
		Member member2 = new Member("개똥이", "02-1234-5678");
		
		System.out.println(member.equals(member2));
		//필요하면 오버라이딩해서 써라.
		System.out.println(member == member2);
		
		Member m = member.clone();
		System.out.println(m);
	}
}
