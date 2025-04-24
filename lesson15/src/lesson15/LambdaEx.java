package lesson15;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i * i;
		
		System.out.println(inter.la(10));
		
		MyInter inter2 = new MyInter() {
			
			@Override
			public int la(int i) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
//		Object o2 = i -> i * i;
		//익명클래스 없는 람다식만 있으면 무슨 타입인지 모름
		Object o2 = (MyInter) i -> i * i;
		//이거 MyInter(람다)야~ 알려주면 잘 된다.
		
		Runnable runnable = () -> {
			System.out.println("Run");
		};
		runnable.run();
		//추상메서드 한개면 뭐든 람다식이 될 수 있다.
		
	}
}

//람다식이 되기 위한 조건 : 단 1개의 추상메서드
@FunctionalInterface //함수형 인터페이스
interface MyInter{ 
	int la(int i);
}
