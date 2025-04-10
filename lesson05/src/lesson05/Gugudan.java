package lesson05;

public class Gugudan {
	public static void main(String[] args) {
		for(int i=2 ; i <= 4 ; i ++) {
			for(int j=1 ; j <= 2 ; j ++) {
				System.out.printf("%d * %d = %d\n", i , j, i * j);
			}
			System.out.println("----------");
		}
	}
}
