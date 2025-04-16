package student;

import java.util.Arrays;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성
	Student[] students = new Student[1];
	int count;

	// ====================메소드 생성
	// ---------------------------------------등록
	void register() {
		System.out.println("[등록 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		int math = StudentUtils.nextInt("수학점수 입력 > ");

		students[count++] = new Student(no, name, kor, eng, math);
		System.out.println(count);
		// 점수가 Student[0]에 저장됨

		if (count >= students.length) {
			students = Arrays.copyOf(students, count + 1);
		} // 저장 가능한 학생 수 증가
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
		int serch = StudentUtils.nextInt("학생학번 입력 > ");

		for (int i = 0; i < students.length; i++) {
			if (students[i].no == serch) {
				String name = StudentUtils.nextLine("학생이름 수정 > ");
				int kor = StudentUtils.nextInt("국어점수 수정 > ");
				int eng = StudentUtils.nextInt("영어점수 수정 > ");
				int math = StudentUtils.nextInt("수학점수 수정 > ");

				String edit = StudentUtils.nextLine("정말 수정하시겠습니까? y/n > ");
				if (edit.equals("y")) { // boolean으로 하고 싶은데 입력을 참/거짓으로 받을수 있을까요..?
					students[i] = new Student(serch, name, kor, eng, math);
					break;
				} else if (edit.equals("n")) {
					break;
				} // y/n 두가지 전부 작동이 되긴 하는데!!! 코드가 안예뻐요..!!!
					// 조금 더 간결하게 하고싶으니까 수업전까지 더 고민해보기.
			}
		}
	}

	// ---------------------------------------삭제
	void remove() {
		System.out.println("[삭제 기능]");
		// 1234중에 2가 없어진다면 124만 뜨게끔. 4를 3자리에 땡겨오기
		int serch = StudentUtils.nextInt("학생학번 입력 > ");
		
		for ( int i = 0; i < students.length ; i++ ) {
			if (students[i].no == serch ) {
				System.out.printf("[%d] %s\n\t총점 : %d , 평균 : %.2f\n", students[i].no, students[i].name, students[i].total(),
						students[i].avg());
				String edit = StudentUtils.nextLine("정말 삭제하시겠습니까? y/n > ");
				if (edit.equals("y")) { //삭제안하고 다음인덱스를 덮어쓰면 될거같음..					
					//헉 포인터익셉션 에러났음!!!!
					for(int j = i + 1; j < students.length ;) {
					students[i]= students[j];
					i++; j++;
					break;
					}
				} else {
					break;
				}
				//수정기능에서는 실행 됐는데 왜 y 입력받은순간 터질까요..?
			}	
		}
	}
	//---------------------------------------
}
