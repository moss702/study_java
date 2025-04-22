/* 
 * 이름 유효성(학생 이름에 해당하는부분)을 정규표현식으로 수정
 * 배열이었던 부분을 Array리스트로 수정
 */
package student;

// Data Class
// 학생 [개개인]의 개별정보
public class Student {
	// ====================필드
	private int no;
	private String name;

	private int kor = 0;
	private int eng = 0;
	private int mat = 0;
	
	public int ranScore;

	public int total;
	public double avg;
	
	// ====================생성자
	public Student() {
	};

	public Student(int no, String name) {
		this.setNo(no);
		this.setName(name);
	};

	public Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMat(mat);
	};
	// ====================getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	// ====================setter		
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	// ====================메소드
	public int total() { // 총점계산
		return getKor() + getEng() + getMat();
	};

	public double avg() { // 평균계산
		return total() / 3d;
	}
	
	public String toString() { //학생 toString
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", getNo(), getName(), getKor(), getEng(), getMat(), avg(), total());
	}
		
}