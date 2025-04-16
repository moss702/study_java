package student;

import java.util.Arrays;

//핵심 로직 class : CRUD
public class StudentService {
	//====================필드생성
	Student[] students = new Student[1];
	int count;
	
	int serch;
	
	//====================메소드 생성
	//등록
	void register() {
		System.out.println("등록 기능");
		//점수가 Student[0]에 저장되게 하기
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		int math = StudentUtils.nextInt("수학점수 입력 > ");

		students[count++] = new Student(no, name, kor, eng, math);
		System.out.println(count);
	
		if (count >= students.length) { //count 느는 만큼 배열 늘리기..는 안되니까 새 배열 복사..?
			Student[] students2 = new Student[count];
			Student[] Students2 = Arrays.copyOf(students, count);
			students = Students2; // 작동 안됨~!~!~!~!~!~ 
		}
	}
	
	//조회
	void read() {
		System.out.println("조회 기능");
		
		for(int i = 0 ; i < count; i++) { //null값인 students[]는 불러오지않도록 count 이용해서 범위지정
//			System.out.println("[" + students[i].no + "] " + students[i].name + ": " + students[i].total() + " / " + students[i].avg());
			System.out.printf("[%d] %s\n\t총점 : %d , 평균 : %.2f\n" , students[i].no , students[i].name , students[i].total() , students[i].avg());
		}
	}
	
	//수정
	void modify() {
		System.out.println("수정 기능");
		int serch = StudentUtils.nextInt("학생학번 입력 > ");
		
		for ( int i = 0; i < students.length ; i++ ) {
			if (students[i].no == serch ) {
				String name = StudentUtils.nextLine("학생이름 수정 > ");
				int kor = StudentUtils.nextInt("국어점수 수정 > ");
				int eng = StudentUtils.nextInt("영어점수 수정 > ");
				int math = StudentUtils.nextInt("수학점수 수정 > ");
				students[i] = new Student(serch, name, kor, eng, math);

				String edit = StudentUtils.nextLine("정말 수정하시겠습니까? y/n >");
					if (edit.equals("y")) {
						
					}
			}
		}
		
		//정말 수정할건지, 삭제할건지 한번 더 물어보기
	}
	
	//삭제
	void remove() {
		System.out.println("삭제 기능");
		// 1234중에 2가 없어진다면 124만 뜨게끔. 4를 3자리에 땡겨오기
	}
}
