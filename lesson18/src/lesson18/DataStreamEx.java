package lesson18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) throws Exception {
//		System.out.println(Math.PI);
//
		//파일생성
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
//		dos.writeDouble(Math.PI);
//		dos.close();
		
		dos.writeChar('A');
		dos.writeChar('B');
		dos.writeChar('C');
		dos.writeChar('D');
		dos.writeLong(10);

		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		long l= dis.readLong();
		System.out.println(Long.toHexString(l));
		System.out.println(dis.readInt()); //0
		System.out.println(dis.readInt()); //10
		dis.close();

		
//		//읽기
//		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
//		double d= dis.readDouble();
//		System.out.println(d);
//		dis.close();
		
		
		
	}
}
