/* 1. StudentMain의 나머지 기능 구현 (메시지 출력)
 * 2. Student의 생성자 구현
 * 　　기본생성자 + (학번,이름) + (다섯개의 필드를 다 사용하는거 하나)
 * 3. 학생 1인의 총점, 평균을 계산한다면?
 * 　　어떻게 처리할건지?
 * 		// 등록 기능으로 학번 이름 점수를 등록 받기
 *		// 총점, 평균은 조회에 넣기..?
 *
 *		// 중복학번 학생 등록 방지
 *		// (신규) 5. 과목별 평균값, 총평균(평균값의 평균) 출력. main에서 추가
 *		// (신규) 6. 총점 석차순 정렬 (고득점자부터 출력)  : 버블정렬
 *		// 7.종료 
 *		// Student 클래스의 toString 재정의 (학생이 가진, 주소값이 아니라 학번이름점수가 뜨게)
 *		// ㄴproduct 마트 예제 참고 08_2
 *		//System.out.printf("[%d] %s\n\t총점 : %d , 평균 : %.2f\n", students[i].no, students[i].name, students[i].total(),
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
		return total() / 3d;
	};
	
}