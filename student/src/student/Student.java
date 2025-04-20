/* 1. StudentMain의 나머지 기능 구현 (메시지 출력)
 * 2. Student의 생성자 구현
 * 　　기본생성자 + (학번,이름) + (다섯개의 필드를 다 사용하는거 하나)
 * 3. 학생 1인의 총점, 평균을 계산한다면?
 * 　　어떻게 처리할건지?
 * 		// 등록 기능으로 학번 이름 점수를 등록 받기
 *		// 총점, 평균은 조회에 넣기..?
 *
 *	1 모든 필드, 메서드, 생성자 > 접근제한자 붙이기 (private. public)
 *		필드 프라이빗 / 메서드 퍼블릭 / 생성자 퍼블릭
 *		게터 세터 정의
 *	2 어떤값을 입력하더라도 예외처리 (프로그램종료는 정상종료만 되도록.)
 *	3 점수값 입력의 범위 0~100만 되도록
 *	4 이름 입력은 한글만 인정, 범위 2글자~ 4글자 사이 //예외 또는 조건문 사용
 *  5 임시데이터의 점수값을 랜덤으로 배정해서 시작. (60~100 사이)
 *		
 *	6 08_Shape_예제] 2차원도형-직각삼각형 추가 / 3차원도형-원기둥, 육면체, 삼각기둥(겉넓이 부피)
 *						어떤 변수를 어떤 관계로 만들지 고민하기
 */
package student;

// Data Class
// 학생 [개개인]의 개별정보
public class Student {
	// ====================필드생성
	private int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public class subject {
	//과목들을 하나로 묶고 싶은데 
	//인터페이스와 클래스를 아직 어떻게 사용할지 감이 안옵니다.
	//게터세터를 만들고 나니 더 난잡해졌습니다.
	private int kor = 0;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	private int eng = 0;
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	private int mat = 0;
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int ranScore;

	public int total;
	public double avg;
	
	// ====================생성자 생성
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

	// ====================메소드 생성
	public int total() { // 총점계산
		return getKor() + getEng() + getMat();
	};

	public double avg() { // 평균계산
		return total() / 3d;
	};
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", getNo(), getName(), getKor(), eng, getMat(), avg(), total());
	}
	
	public static int ranScore() { //학생점수 랜덤 메소드
		int ranScore = (int)(Math.random() * 40 + 60);
		return ranScore;
	}
	
	public boolean scoreRange() { //과목점수 입력범위제한
		if (( kor > 100 && kor < 0)&&( eng > 100 && eng < 0)&&( mat > 100 && mat < 0)) {
		System.out.println("잘못된 입력값입니다.");
	} //세 과목을 전부 범위지정 해주는게 맞나,
	// 하나로 묶으면 코드가 짧아질것같은데. 어떻게 묶어야 할지 모르겠습니다.
		

	
}