package lesson17;

public class JoinEx {
	public static void main(String[] args) throws InterruptedException {
		MyJoin join1 = new MyJoin(1, 5000);
		MyJoin join2 = new MyJoin(5001, 10000);
		
		join1.start();
		join2.start();
		
		
		join1.join();
		join2.join();
		
		System.out.println(join1.sum + join2.sum);
		//출력을 먼저 처리해버려서 0 출력됨.
		//.join()을 추가해서, main을 기다리라고 지시.
	}
}

class MyJoin extends Thread {
	int start;
	int end;
	int sum;
	
	public MyJoin(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start ; i <=end; i++) {
			sum += i;
		}
	}
}