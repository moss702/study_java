package student;

import java.util.Arrays;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성
	Student[] students = new Student[10];
	Student[] sortedStudents = new Student[students.length];
	int count;
	
	int[] n = new int [10];
	
	for (int i = 0 ; i < n.length; i++) {
		n[i] = Student.ranScore();
		System.out.println();
	};
	//하~ 이녀석~ 랜덤 여러번 돌리게 어케함~?
	// 배열 만들어서 넣어두고 쓰기?
	//아니? 그때그때 돌리고싶은데?
	
	
	{ //초기화 블럭
		students[count++] = new Student(1, "김밥", n, n, n);
		students[count++] = new Student(2, "샌드위치", 80, 80, 80);
		students[count++] = new Student(3, "햄부기", 90, 90, 90);
		students[count++] = new Student(4, "육쌈냉면", 100, 100, 100);
		
	//	sortedStudents = Arrays.copyOf(students, students.length);
		sortedStudents = students.clone();
		rank();
	}
	// ====================메소드 생성
	// ---------------------------------------등록
	Student findBy(int no) {//반환 : 학생 / 입력 : 학번
		Student student = null;
		for (int i = 0; i < count; i++) {
			if (students[i].no == no) {
				student = students[i];
				break;
			}
		}	
		return student;
		//해당타입의 기본값을 반환해줘야 한다.
		//하지만 찾는다면? 그 타입을 반환
	}

	void register() {
		System.out.println("[등록 기능]");
		
		//등록.학번
		int no = StudentUtils.nextInt("학생학번 입력 > ");	
		//중복학번등록방지
		Student s = findBy(no);
		if(s != null) {
			System.out.println("이미 등록된 학번입니다.");
			return;
		}
		//등록.이름,점수
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		//이름등록범위제한
		if (name.length() < 2 || name.length() > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		} 
		// else if () //한글입력제한... 헉 문자열인디?
		
		
		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		int mat = StudentUtils.nextInt("수학점수 입력 > ");
		
//		if (  > 100 ||  < 0) {
//			System.out.println("잘못된 입력값입니다.");
//			return;
//		}
		
		//등록가능정원추가
		if (count == students.length) {
			students = Arrays.copyOf(students, students.length *2);
		} 
		students[count++] = new Student(no, name, kor, eng, mat);
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
		
	}
	// ---------------------------------------조회
	void read() {
		System.out.println("[조회 기능]");
		print(students);		
	}
	
	void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);		
	}
	
	void print(Student[] stu) {
		for(int i = 0 ; i < count ; i++) {
			System.out.println(stu[i]);
		}
	}

	// ---------------------------------------수정
	void modify() {
		System.out.println("[수정 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}

		s.name = StudentUtils.nextLine("학생이름 수정 > ");
		s.kor = StudentUtils.nextInt("국어점수 수정 > ");
		s.eng = StudentUtils.nextInt("영어점수 수정 > ");
		s.mat = StudentUtils.nextInt("수학점수 수정 > ");
		
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	// ---------------------------------------삭제
	void remove() {
		System.out.println("[삭제 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		for ( int i = 0; i < count ; i++ ) {
			if (students[i].no == no) {
				System.arraycopy(students, i + 1, students, i, count - 1 - i);
				count--; //학생의 총인원수도 줄여주자!
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}
	// ---------------------------------------과목별 평균값 및 전체평균
	void  allAvg() { 
		System.out.println("[과목별 평균값 확인]");
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		for(int i = 0 ; i < count ; i++) {
			avgKor = students[i].kor;
			avgEng = students[i].eng;
			avgMat = students[i].mat;
		}
		avgKor /= (double)count;
		avgEng /= (double)count;
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어평균 : " + avgKor);
		System.out.println("영어평균 : " + avgEng);
		System.out.println("수학평균 : " + avgMat);
		System.out.println("전체평균 : " + avgAll);
	}

	// ---------------------------------------총점 석차
	void rank() {
		System.out.println("[총점 석차]");
		for(int i = 0 ; i < count - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < count ; j++) {
				if(sortedStudents[idx].total() < sortedStudents[j].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
		}		
	}
	//---------------------------------------
}
