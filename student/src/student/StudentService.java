package student;

import java.util.Arrays;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성
	Student[] students = new Student[10];
	Student[] sortedStudents = new Student[students.length];
	int count;
	
	int n = Student.ranScore();
/*	int[] n = new int [3];
	for (int i = 0 ; i < n.length; i++) {
		n[i] = Student.ranScore();
		System.out.println();
	}; */
	// 60~100 난수를 만들긴했는데 학생들 점수가 전부 똑같이 들어갑니다..
	// 배열 만들어서 난수 넣어두고 각자 꺼내 쓰기?.......
	
	
	{ //초기화 블럭
		students[count++] = new Student(1, "김밥", n, n, n);
		students[count++] = new Student(2, "샌드위치", 80, 80, 80);
		students[count++] = new Student(3, "햄부기", 90, 90, 90);
		students[count++] = new Student(4, "육쌈냉면", 100, 100, 100);
		
		sortedStudents = students.clone();
		rank();
	}
	// ====================메소드 생성
	// ---------------------------------------등록
	Student findBy(int no) {//반환 : 학생 / 입력 : 학번
		Student student = null;
		for (int i = 0; i < count; i++) {
			if (students[i].getNo() == no) {
				student = students[i];
				break;
			}
		}	
		return student;
		//해당타입의 기본값을 반환해줘야 한다.
		//하지만 찾는다면? 그 타입을 반환
	}

	void register() {
		int no;
		System.out.println("[등록 기능]");
		//등록.학번
		try {
			no = StudentUtils.nextInt("학생학번 입력 > ");	
			//중복학번등록방지
			Student s = findBy(no);
			if(s != null) {
				System.out.println("이미 등록된 학번입니다.");
				return;
			}
		} catch (ArrayStoreException notNum) {
			System.out.println("잘못된 입력입니다.");
			return;			
		}
		//등록.이름,점수
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		//이름등록범위제한
		if (name.length() < 2 || name.length() > 4) {
			System.out.println("잘못된 입력입니다.");
			return;
		} 
		// else if () //한글입력제한...
/*		if (name >= "가" && name <= "힣") {
			System.out.println("잘못된 입력입니다.");
			return;
		} */ // char가 아니라 string 제한해야하는데
		 
		
		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		int mat = StudentUtils.nextInt("수학점수 입력 > ");
		//scoreRange();
		
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

		s.setName(StudentUtils.nextLine("학생이름 수정 > "));
		s.setKor(StudentUtils.nextInt("국어점수 수정 > "));
		s.setEng(StudentUtils.nextInt("영어점수 수정 > "));
		s.setMat(StudentUtils.nextInt("수학점수 수정 > "));
		
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
			if (students[i].getNo() == no) {
				System.arraycopy(students, i + 1, students, i, count - 1 - i);
				count--;
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
			avgKor = students[i].getKor();
			avgEng = students[i].getEng();
			avgMat = students[i].getMat();
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
