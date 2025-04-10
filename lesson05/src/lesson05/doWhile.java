package lesson05;

public class doWhile {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i ;
			i++;
		} while(false);
		//최초 한번만 실행하기 때문에
		
		System.out.print("합계 : " + sum);
		System.out.println(", i  : " + i);

		
		sum = 0 ;
		i = 1 ;
		while(sum == i){
			sum += i ;
			i++;
		}
		
		System.out.print("합계 : " + sum);
		System.out.println( ", i  : " + i);
	
		
		
		
	}
}
