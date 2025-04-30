package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconn { //DBconnection
	public static void main(String[] args) throws Exception {
		//1.접속객체 취득
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","sample","1234");
		System.out.println(conn);
		
		//2.문장생성
		Statement stmt = conn.createStatement();
		
		//3.문장 실행 후 결과 반환
		ResultSet rs = stmt.executeQuery("select * from student");
		//resultSet : 결과표 - 행열로 된.
		
		//4.결과순회 후 파싱
		while(rs.next()) { //next : 커서이동 
			System.out.println(rs.getInt("studno") + " :: " + rs.getString("name"));
		}
	}
	

}
