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
	int no;
	String name;
	
//	public class subject {
		int kor = 0;
		int eng = 0;
		int mat = 0;
	//}
	int ranScore;

	int total;
	double avg;
	
	// ====================생성자 생성
	Student() {
	};

	Student(int no, String name) {
		this.no = no;
		this.name = name;
	};

	Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	};

	// ====================메소드 생성
	int total() { // 총점계산
		return kor + eng + mat;
	};

	double avg() { // 평균계산
		return total() / 3d;
	};
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
	}
	
	public static int ranScore() {
		int ranScore = (int)(Math.random() * 40 + 60);
		return ranScore;
	}
	
}