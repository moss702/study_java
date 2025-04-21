package student;

public class TEST {
	public static void main(String[] args) {
		int[] n = new int [10];
		
		for (int i = 0 ; i < n.length; i++) {
			n[i] = nan.ranScore();
			System.out.println();
		};
		System.out.println(nan.toString);
	}
}
class nan{	
	
	public static char[] toString;

	public static int ranScore() {
	int ranScore = (int)(Math.random() * 40 + 60);
	return ranScore;
	}
}