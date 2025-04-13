package practice;

public class Ex0414_quiz {
		public static void main(String[] args) {
		
			int[] shoe = new int[10];
			
			for (int i = 0 ; i < shoe.length; i++) {
					shoe[i] = 250 + (5 * i) ;
			}
			

			for (int size : shoe) {  // 향상된 for문 : 배열의 항목 수 만큼 실행부분 반복. 배열을 순서대로 꺼내서 size 에 대입
				System.out.println("신발 사이즈 "+ size + " (재고있음)");				
			}
			
			
		}
}
