package lesson17;

import java.io.IOException;

public class ProcessEx {
	public static void main(String[] args) throws Exception {
		Process p1 = Runtime.getRuntime().exec("notepad.exe");
		Process p2 = Runtime.getRuntime().exec("mapaint.exe");
		
		p1.waitFor();
		p2.destroy();
	}
}
