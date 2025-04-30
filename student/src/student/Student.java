/* 
 * 학생예제 내의 정렬을 List의 sort로 구현, Comparator 사용
 * Map을 사용한 문자 빈도수 계산 (Ex250423)
 */
package student;

import java.io.Serializable;

// Data Class
// 학생 [개개인]의 개별정보
public class Student implements Comparable<Student>, Serializable {
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
		return String.format("%5d %10s %5d %5d %5d %6.2f %5d", getNo(), getName(), getKor(), getEng(), getMat(), avg(), total());
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}	
	
	public static Builder builder(){ //빌더 인스턴스 생성.
		//스테틱 클래스. 만들어야할(호출되야할) 클래스도 스테틱이어야 한다.
		return new Builder();
	}
	static class Builder {
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor(int kor) {
			this.kor = kor;
			return this;			
		}
		public Builder eng(int eng) {
			this.eng = eng;
			return this;			
		}
		public Builder mat(int mat) {
			this.mat = mat;
			return this;			
		}
		public Student build() {
			return new Student(this);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
//	public static void main(String[] args) {
//		Student student = Student.builder().no(1).name("새똥").build();
//		//빌더와 빌드 사이 .을 통해 필요한 녀석에게만 접근.
//		//메서드 체인? 지속적으로 자기값으로 돌아옴. 빌더 . 학번. 빌더. 네임.
//		System.out.println(student);
//	}
//	
	
}