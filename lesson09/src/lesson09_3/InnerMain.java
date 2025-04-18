package lesson09_3;

public class InnerMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i;
		Outer.SInner si;
//		i = new Outer().new Inner();
		i = outer.new Inner();
		si = new Outer.SInner();
	}
}

class Outer {
	class Inner{ //static이 없어 인스턴스하려면 Outer부터 new해줘야함
		
	}
	
	static class SInner{
		
	}

	void m() {
		class Local { //지역변수
			
		}
	}


}
