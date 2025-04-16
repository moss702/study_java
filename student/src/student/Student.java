/* 1. StudentMain의 나머지 기능 구현 (메시지 출력)
 * 2. Student의 생성자 구현
 * 　　기본생성자 + (학번,이름) + (다섯개의 필드를 다 사용하는거 하나)
 * 3. 학생 1인의 총점, 평균을 계산한다면?
 * 　　어떻게 처리할건지?
 * 		// 등록 기능으로 학번 이름 점수를 등록 받기
 *		// 총점, 평균은 조회에 넣기..?
 *
 *		// double타입으로 평균 계산하기!
 *		// 수정 및 삭제 기능 구현해오기!
 *		// 　(학번을 입력 받아서 그 학생만 수정 및 삭제하게끔.)
 *		// 수정? 학번을 제외한 이름, 세과목의 점수가 수정 가능해야 함.
 *		// 기존 값 덮어쓰기
 *		// 등록 : 배열의 길이를 넘는 추가 학생 등록 시 배열의 길이 늘리기.
 *		// 
 */
package student;

// Data Class
// 학생 [개개인]의 개별정보
public class Student {
	// ====================필드생성
	int no;
	String name;
	int kor;
	int eng;
	int mat;

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
		return this.total() / 3;
	};
	
}