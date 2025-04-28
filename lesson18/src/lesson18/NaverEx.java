package lesson18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NaverEx {
	//https://www.naver.com
	// url > isr > br(readLine)
	
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://git-scm.com");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//버퍼드리더를 쓰기위해서는 리더타입이어야 한다. 변환필요
		
		
		int line = 1;
		
		while(true) {
			String s = br.readLine();
			if(s == null) break;
			System.out.println(line++ + " :: " + s);
		}
		
	}
}
