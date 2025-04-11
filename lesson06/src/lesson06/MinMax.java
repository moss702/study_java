package lesson06;

public class MinMax {
	public static void main(String[] args) {
		int[] arr = {4,1,3,5,6}; //비교해서 더 큰걸 int max에 덮어쓰기
		//합계와 평균 구하기
		int sum = 0 ;
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / arr.length);
		
		
		int min = arr[0] ; 
		int max = arr[0] ; 
		//배열에 음수가 있으면 0이 최대값이 되어버리기 때문에
		//0으로 초기값 지정하면 안됨. 인덱스 0번을 초기화값으로 설정
		
		for (int i = 1 ; i < arr.length ; i++) {
			if (max > arr[i]) { // [0]과 [1]를 비교. [0]이 더 크다면?
				max = arr[i]; //max에 덮어쓰기
			}
			else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 :: " + max);
		System.out.println("최소값 :: " + min);
		
	}

}
