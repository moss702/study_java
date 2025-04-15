/* 1. StudentMain의 나머지 기능 구현 (메시지 출력)
 * 2. Student의 생성자 구현
 * 　　기본생성자 + (학번,이름) + (다섯개의 필드를 다 사용하는거 하나)
 * 3. 학생 1인의 총점, 평균을 계산한다면?
 * 　　어떻게 처리할건지?
 * 		// 등록 기능으로 학번 이름 점수를 등록 받기
 *		// 총점, 평균은 조회에 넣기..?
 *		
 */
package student;

// Data Class
// 학생 개개인의 개별정보
public class Student {
	//====================필드생성
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	int sum;
	int avg;

	//====================메소드 생성
	Student() {};
	
	Student(int no, String name) {
		this.no = no;
		this.name = name;
	};
	
	Student(int no, String name, int kor, int eng, int mat){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	};
	//======================================================
	void StudentSum(int sum){
		this.sum = (kor + eng + mat) ;
//		this.sum = sum;
	};
	void StudentAvg(int avg) {
//		this.avg = sum / sum.length;
	};
}