package lesson05;

public class Sam {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 50 ; i++) {
			int count = 0; //박수를 칠 횟수 
			int tmp = i; 		
			
			do { //박수 횟수 반복
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					// 0 3 6 9 && 0은 빼고
					count++;
				}
			}while ((tmp /= 10) !=0); 
			
//			if(i % 3 == 0) count++;
			
			if(count > 0) { 
				System.out.print(i + " :: ");
				for(int j = 0 ; j < count ; j++) {
					System.out.print("짝"); //3일때마다 박수
				}
				System.out.println();
			}	
			else {
				System.out.println(i);
			}
		}	
	}
}
