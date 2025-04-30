package lesson19;

import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws Exception {
		String addr = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjBfMjg4%2FMDAxNzQyNDM4OTA3MTg5.S2xiRyZMcr56DhNBY0fZYFyqQgZ_bZNtZG__p0w5Wigg.3nfMQWkJ8kKXU6_FXbg8lrkJo4j4Gzl1aHSwTTsV8yYg.PNG%2F9.png&type=sc960_832";
		URL url = new URL(addr);
		System.out.println(url.getProtocol()); // https
		System.out.println(url.getHost()); // search.pstatic.net
		System.out.println(url.getPort()); // -1 이 주소상에서는 포트를 찾을수없음.
		System.out.println(url.getPath()); // /common/
		System.out.println(url.getFile()); // /common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjBfMjg4%2FMDAxNzQyNDM4OTA3MTg5.S2xiRyZMcr56DhNBY0fZYFyqQgZ_bZNtZG__p0w5Wigg.3nfMQWkJ8kKXU6_FXbg8lrkJo4j4Gzl1aHSwTTsV8yYg.PNG%2F9.png&type=sc960_832
		System.out.println(url.getQuery()); // src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjBfMjg4%2FMDAxNzQyNDM4OTA3MTg5.S2xiRyZMcr56DhNBY0fZYFyqQgZ_bZNtZG__p0w5Wigg.3nfMQWkJ8kKXU6_FXbg8lrkJo4j4Gzl1aHSwTTsV8yYg.PNG%2F9.png&type=sc960_832
		System.out.println(url.getRef()); //쿼리스트링 옆에 #하고 붙는것. 앵커라고도 한다.
		
	}
}
