package lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("호스트명 : " + ip.getHostName());
		System.out.println("ip : " + ip.getHostAddress());
		
		//ip전체
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		//
		
		for(InetAddress i : ips) {
			System.out.println("ip 주소 : " + i);
		}
		
		byte[] ipAddr = ip.getAddress();
		for (byte b : ipAddr) {
			System.out.print((b < 0 ? b + 256 : b) + ".");
		}
		
		System.out.println();
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터 ip : " + local);
		
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getAddress() + "주소 : " + ip2);
	}
}
