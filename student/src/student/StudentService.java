package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성====================
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents; //아래 초기화블럭에서 인스턴스화할거라서 여기서 new 안해도된다
	
	
	{ //초기화 블럭
		students.add(new Student(1, "김밥", ranScore(), ranScore(), ranScore()));
		students.add(new Student(2, "햄부기", ranScore(), ranScore(), ranScore()));
		students.add(new Student(3, "샌드위치", ranScore(), ranScore(), ranScore()));
		students.add(new Student(4, "오믈렛", ranScore(), ranScore(), ranScore()));
		
		sortedStudents = new ArrayList<Student>(students);
		rank();
	}
	
	// ====================메소드 생성====================
	//학생점수 랜덤
	public int ranScore() { 
		return (int)(Math.random() * 41 + 60);
	}

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
	public int checkRange(String subject, int input) { 
		return checkRange(subject, input, 0, 100);
	}
	
	//학생이름입력제한
	public String inputName() {
		String name = StudentUtils.nextLine("학생이름 입력 > ");		
		if(!name.matches("[가-힣]{2,4}")) {			
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
		
		Student s2 = new Student(no, name, kor, eng, mat);
		students.add(s2);
		sortedStudents.add(s2);
		rank();
		
	}
	// ---------------------------------------조회
	public void read() {
		System.out.println("[조회 기능]");
		print(students);
	}
	
	public void readOrder() {
		System.out.println("[석차순 조회 기능]");
		print(sortedStudents);
	}
	
	//출력 메소드
	public void print(List<Student> stu) {
//		for(int i = 0 ; i < stu.size() ; i++) {
//			System.out.println(stu.get(i));
//		} 
		stu.forEach(System.out::println);
		stu.forEach(s -> System.out.println(s));
	}
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

		rank();
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
		students.remove(s);
		sortedStudents.remove(s);
	}
	// ---------------------------------------과목별 평균값 및 전체평균
	public void  allAvg() { 
		System.out.println("[과목별 평균값 확인]");
//		students.stream().map(s -> s.getKor());
		
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		for(int i = 0 ; i < students.size() ; i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat();
		}
		avgKor /= (double)students.size(); 
		avgEng /= (double)students.size();
		avgMat /= (double)students.size(); 
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.println(students.size() + "명의 학생 평균");
		System.out.println("국어평균 : " + avgKor);
		System.out.println("영어평균 : " + avgEng);
		System.out.println("수학평균 : " + avgMat);
		System.out.printf("전체평균 : %.2f\n", avgAll);
	}

	// ---------------------------------------총점 석차 재정렬
	public void rank() {
		for(int i = 0 ; i < students.size() - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < students.size() ; j++) {
				if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents.get(i);
			sortedStudents.set(i, sortedStudents.get(idx));
			sortedStudents.set(idx , tmp);
		}		
	}
	//---------------------------------------
	
	public void compareTo(Student no) {	// 학번순 , 총점순
		if(students.get(0).getNo() == 1) {
			return ;
		}
		return;
					//((Comparable<String>) no).compareTo(no.getNo());
//		Comparator<Integer> comparator = new Comparator<>() {
//			public int compare(Integer o1, Integer o2) {
//				return -(o1 - o2);
//			}
//		};
//		students.sort(comparator);
//		System.out.println(students);
		
		
	
	};
	
} //studentServiece 닫는블럭
