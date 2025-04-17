package student;

import java.util.Arrays;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성
	Student[] students = new Student[10];
	int count;
	
	{ //초기화 블럭
		students[count++] = new Student(1, "김", 90, 80, 90);
		//점수도 int라 랜덤값 만들면 된다. 최저점 범위지정도 가능
		students[count++] = new Student(2, "이", 80, 80, 90);
	}
	

	// ====================메소드 생성
	// ---------------------------------------등록
	void register() {
		System.out.println("[등록 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");	
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		int math = StudentUtils.nextInt("수학점수 입력 > ");
		
		//중복학번등록방지
		boolean duplicate = true;
		for (int i = 0; i < count; i++) {
			if (students[i].no == no) {
				System.out.println("이미 등록된 학번입니다.");
				//알람은 띄웠고 이제 등록 못하게 해야함
				duplicate = false;
				break;
			}
		}
		//등록가능정원추가
		if (count == students.length && duplicate) {
			students = Arrays.copyOf(students, students.length *2);
			students[count++] = new Student(no, name, kor, eng, math);
		} 
		
	}
	// ---------------------------------------조회
	void read() {
		System.out.println("[조회 기능]");

		for (int i = 0; i < count; i++) {
			// System.out.println("[" + students[i].no + "] " + students[i].name + ": " +
			// students[i].total() + " / " + students[i].avg());
			System.out.printf("[%d] %s\n\t총점 : %d , 평균 : %.2f\n", students[i].no, students[i].name, students[i].total(),
					students[i].avg());
		} // null값인 students[]는 불러오지않도록 count 이용해서 범위지정
	}

	// ---------------------------------------수정
	void modify() {
		System.out.println("[수정 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		//새 변수 만들필요 없다. 지역변수 no에 그냥 넣어둬도 됨.
		Student s = null;
		for (int i = 0; i < count; i++) {
			//배열의 길이가 아니라 count로 잡는 이유 : 널포인터 발생방지
			if (students[i].no == no) {
				s = students[i];
				//찾으면 동작그만, 대입하고 그냥 종료
				break;
			}//학생 탐색부분
		} //이부분을 따로 메서드로 뺄거라서 수정사항대입 부분을 for문에 넣지않는다.
		s.name = StudentUtils.nextLine("학생이름 수정 > ");
		s.kor = StudentUtils.nextInt("국어점수 수정 > ");
		s.eng = StudentUtils.nextInt("영어점수 수정 > ");
		s.mat = StudentUtils.nextInt("수학점수 수정 > ");
	}
	// ---------------------------------------과목별 평균값
//	void  () { 
//		System.out.println("[과목별 평균값 확인]");
	// (신규) 5. 과목별 평균값, 총평균(평균값의 평균) 출력
	// ---------------------------------------총점 석차
//	void  () { 
//		System.out.println("[총점 석차 확인]");
	//(신규) 6. 총점 석차순 정렬 (고득점자부터 출력)  : 버블정렬	
	// ---------------------------------------삭제
	void remove() {
		System.out.println("[삭제 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		
		for ( int i = 0; i < count ; i++ ) {
			if (students[i].no == no) {
				System.arraycopy(students, i + 1, students, i, count - 1 - i);
				count--; //학생의 총인원수도 줄여주자!
				break;
			}
		}
	}
	//---------------------------------------
}
