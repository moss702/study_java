package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//D-day counter
		// 필요한거 ? 1.오늘날짜 , 2.수료날짜
		//1970.1.1 >> 70, 0, 1 :: 2000년 >> 100
		Date today = new Date(125, 3, 21);
		Date endDate = new Date(125, 8, 29);
		
	//	System.out.println(endDate - today); //date타입이라서 안뺴준다.
		System.out.println(endDate.getTime() - today.getTime());
		
		long duration = endDate.getTime() - today.getTime();
		System.out.println(duration / 1000 / 60 / 60 / 24);
		
		
	}
}
