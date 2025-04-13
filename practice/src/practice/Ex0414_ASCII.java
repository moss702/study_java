package practice;

public class Ex0414_ASCII {
	public static void main(String[] args) {
		//아스키코드에 대해
		
		char c = 'A';
		System.out.print(c);
		System.out.println((int)c);
		
		c = 'a';
		System.out.print(c);
		System.out.println((int)c);
		
		c = '0';
		System.out.print(c);
		System.out.println((int)c);
		
		//=========================================
		char ch = 'A';
		String[][] seat3 = new String[10][15];
	//	String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		
		for (int i = 0; i < seat3.length; i++) {
			for (int j =0; j < seat3[i].length; j++) {
				seat3[i][j] = String.valueOf(ch) +(j+1);	
			}
			ch++;
		}
		
		for (int i = 0; i < seat3.length ; i++) { //행(세로)
			for (int j =0; j < seat3[i].length; j++) { //열(가로)
				System.out.print(seat3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
