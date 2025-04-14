package lesson06_2;

public class ArrEx10 {
	public static void main(String[] args) {
		//다차원 배열
		//3x3 배열
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; 
		//int로 구성된 2차원 배열
		//안에 들어갈 수 있는건 int 1차원 배열
		//arr[0]은 1이 아니라 {1,2,3}임.
		//1차원 배열의 모임이기 때문에, 1차원 배열을 하나로 봐야함.
		
		//그럼 4에 접근하려면?
		//arr[1]에 들어가서 [0]을 찾는다
		System.out.println(arr[1][0]);
		
		
		String[][][] strs = {
				{},{{"A", "B", "C"} , {"가","나","다"}} , {{"0","1"}}
		};
		//블럭 잘 봐야 함..!!
		//str.length는 3개.
		System.out.println(strs.length);
//		{},
//		{{"A", "B", "C"} , {"가","나","다"}} , 
//		{{"0","1"}}

		System.out.println(strs[1].length); // 그럼 이녀석의 길이는?! 
		//[1] 한번 들어간거니까 2차원 배열 :abc 가나다
		//[1][1] 두번 들어가면 1차원 배열  :가나다
		//[1][1][1] 세번 들어가면 타입 개체 :나		
		
	}
}
