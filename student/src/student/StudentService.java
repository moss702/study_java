package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성
	List<Student> students = new ArrayList<Student>();
	//Student[] students = new Student[10];
	List<Student> sortedStudents = new ArrayList<Student>();
//	Student[] sortedStudents = new Student[students.length];
//	public int count;
	
	{ //초기화 블럭
		students.add(new Student(1, "김밥", ranScore(), ranScore(), ranScore()));
		students.add(new Student(2, "햄부기", ranScore(), ranScore(), ranScore()));
		students.add(new Student(3, "샌드위치", ranScore(), ranScore(), ranScore()));
		students.add(new Student(4, "오믈렛", ranScore(), ranScore(), ranScore()));
//		students[count++] = new Student(1, "김밥", ranScore(), ranScore(), ranScore());
//		students[count++] = new Student(2, "샌드위치", ranScore(), ranScore(), ranScore());
//		students[count++] = new Student(3, "햄부기", ranScore(), ranScore(), ranScore());
//		students[count++] = new Student(4, "육쌈냉면", ranScore(), ranScore(), ranScore());
		
		sortedStudents = students;
		rank();
	}
	
	public int ranScore() { //학생점수 랜덤 메소드
		return (int)(Math.random() * 41 + 60);
	}
	
	// ====================메소드 생성
	//학번탐색
	public Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNo() == no) {
				student = students.get(i);
				break;
			}
		}	
		return student;
	}
	
	//점수입력범위체크
	public int checkRange(String subject, int input, int start, int end) {
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다." + start + "~" + end + "사이 입력.");
		}
		return input;
	}
	//점수입력범위체크 오버로딩
	public int checkRange(String subject, int input) { 
		return checkRange(subject, input, 0, 100);
	}
	
	//학생이름입력제한
	public String inputName() {
//		String name = StudentUtils.nextLine("학생이름 입력 > ");
//		if(name.length() < 2 || name.length() > 4) {
//			throw new IllegalArgumentException("이름은 2~4글자로 입력하세요");
//		}
//		for(int i = 0 ; i < name.length() ; i++) {
//			if(name.charAt(i)<'가' || name.charAt(i) > '힣') {
//				throw new IllegalArgumentException("이름은 한글로 구성되어야 합니다");
//			}
//		}
//		return name;
//	}
		String name = StudentUtils.nextLine("학생이름 입력 > ");
		String n = "[가-힣]{2,4}";		
		
		if(!name.matches(n)) {
			throw new IllegalArgumentException("이름은 한글 2~4글자로 입력하세요");
		}
		return name;
	}

	// ---------------------------------------등록

	public void register() {
		int no;
		System.out.println("[등록 기능]");
		//등록.학번
			no = StudentUtils.nextInt("학생학번 입력 > ");	
			//중복학번등록방지
			Student s = findBy(no);
			if(s != null) {
				System.out.println("이미 등록된 학번입니다.");
				return;
			}
		
		String name = inputName();

		int kor = StudentUtils.nextInt("국어점수 입력 > ");
		checkRange("국어", kor);
		int eng = StudentUtils.nextInt("영어점수 입력 > ");
		checkRange("영어", eng);
		int mat = StudentUtils.nextInt("수학점수 입력 > ");
		checkRange("수학", mat);
		
//		//등록가능정원추가
//		if(students.size == ) {
//			students = Arrays.copyOf(students, students.length * 2);
//		}
//		students[count++] = new Student(no, name, kor, eng, mat);
//		sortedStudents = Arrays.copyOf(students, students.length);
//		sortedStudents = students;
//		rank();
		
	}
	// ---------------------------------------조회
	public void read() {
		System.out.println("[조회 기능]");
//		print(students);
		for (int i = 0; i < students.size(); i++) {
		System.out.println(students.get(i).toString());
		}
	}
	
	public void readOrder() {
		System.out.println("석차순 조회 기능");
//		print(sortedStudents);		
		System.out.println(sortedStudents.toString());
	}
	
//	public void print(Student[] stu) {
//		for(int i = 0 ; i < count ; i++) {
//			System.out.println(stu[i]);
//		}
//	}
	// ---------------------------------------수정
	public void modify() {
		System.out.println("[수정 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}

		s.setName(StudentUtils.nextLine("학생이름 수정 > "));
		s.setKor(checkRange("국어", StudentUtils.nextInt("국어점수 수정 > ")));
		s.setEng(checkRange("영어", StudentUtils.nextInt("영어점수 수정 > ")));
		s.setMat(checkRange("수학", StudentUtils.nextInt("수학점수 수정 > ")));
		
//		sortedStudents = Arrays.copyOf(students, students.length);
//		sortedStudents = students;
//		rank();
	}
	// ---------------------------------------삭제
	public void remove() {
		System.out.println("[삭제 기능]");
		int no = StudentUtils.nextInt("학생학번 입력 > ");
		
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		for ( int i = 0; i < students.size() ; i++ ) {
			if (students.get(i).getNo() == no) {
//				System.arraycopy(students, i + 1, students, i, count - 1 - i);
//				count--;
				String y = StudentUtils.nextLine("정말 삭제하시겠습니까 y/n");
				if(StudentUtils.nextConfirm(y)) {
					students.remove(i);				
					break;
				}
				break;
			}
		}
//		sortedStudents = Arrays.copyOf(students, students.length);
//		sortedStudents = students;
//		rank();
	}
	// ---------------------------------------과목별 평균값 및 전체평균
	public void  allAvg() { 
		System.out.println("[과목별 평균값 확인]");
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		for(int i = 0 ; i < students.size() ; i++) {
			avgKor = students.get(i).getKor();
			avgEng = students.get(i).getEng();
			avgMat = students.get(i).getMat();
		}
		avgKor /= (double)students.size(); 
		avgEng /= (double)students.size();
		avgMat /= (double)students.size(); 
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.println(students.size() + "명의 학생 평균");
		System.out.println("국어평균 : " + avgKor);
		System.out.println("영어평균 : " + avgEng);
		System.out.println("수학평균 : " + avgMat);
		System.out.println("전체평균 : " + avgAll);
	}

	// ---------------------------------------총점 석차
	public void rank() {
		System.out.println("[총점 석차]");
		for(int i = 0 ; i < students.size() - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < students.size() ; j++) {
				if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents.get(i);
//			sortedStudents.get(i) = sortedStudents.get(idx);
//			sortedStudents.get(idx) = tmp;
		}		
	}
	//---------------------------------------
}
