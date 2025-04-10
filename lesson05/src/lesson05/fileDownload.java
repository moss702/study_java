package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class fileDownload {
	public static void main(String[] args) throws Exception {
		String img = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQd1kWKsODGmz1P44kiLTfpeIOkaemYITnaRVOZEn372xCyrpNoQQ_dMDAV4dWLpVTDFekNEtlkJaDnhlTzoQWdNg";
		URL url = new URL(img);
		//URL url = new URL(img); //객체생성
		//URL > add throw > exception
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("img.png");
		
		int b = 0;
		
		while ( (b = is.read()) != -1 ) {
			fos.write(b);
		}
		fos.close();
	
	}
}
