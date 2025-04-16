package lesson07_3;

public class Access {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.getI());
		target.setI(30) ;
		System.out.println(target.getI());
	}
}


class Target { //클래스 안에 필드 생성
	private int i = 20;
	
	public int getI() { //getter
		return i;
	}
	public void setI(int i) { //setter
		if(i >= 0 && i <=100) {
			this.i = i;
		}
	}
}
