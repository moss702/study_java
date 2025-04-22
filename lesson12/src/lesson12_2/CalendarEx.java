package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

import static java.lang.System.*;


public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = getInstance();
//		Calendar cal2 = new GregorianCalendar();
		System.out.println(cal1);
//		Scanner scanner = new Scanner(in);
//		cal1.set(YEAR, 1000); //고정
		System.out.println("=====================");
		out.println(cal1.get(YEAR));
		out.println(cal1.get(MONTH));
		out.println(cal1.get(DATE));
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE));
		out.println(cal1.get(SECOND));
		out.println(cal1.get(DAY_OF_WEEK)); //일요일 : 1
		System.out.println("=====================");
//		cal1.set(MONTH, 3);
		System.out.println(cal1.getActualMaximum(DATE));
		
		cal1.add(MONTH, 150); //cal1에서 150개월 더하면?
		printCal(cal1);
		//[출력] 2037-10-22 12:04:46
		
		
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
}
