package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
//핵심 로직 class : CRUD
public class StudentService {
	// ====================필드 생성====================
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents; //아래 초기화블럭에서 인스턴스화할거라서 여기서 new 안해도된다
	
	
	{ //초기화 블럭
		ObjectInputStream ois = null; //try catch 해야해서 밖에서 선언. (보조스트림이기 때문에 close해줘야한다)
		try {
			ois = new ObjectInputStream(new FileInputStream("data/student.ser")); //그냥 슬래시만 써도 하위디렉토리로 연결
			//직렬화(시리얼라이즈) 파일
			//확장자명 아무거나 넣어도 상관없음 : 해석하는건 운영체제 담당.
			students = (List<Student>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 불러올 수 없습니다. 임시 데이터셋으로 진행합니다.");
			students.add(new Student(1, "김밥", ranScore(), ranScore(), ranScore()));
			students.add(new Student(2, "햄부기", ranScore(), ranScore(), ranScore()));
			students.add(new Student(3, "샌드위치", ranScore(), ranScore(), ranScore()));
			students.add(new Student(4, "오믈렛", ranScore(), ranScore(), ranScore()));
		} catch(Exception e) {
			e.printStackTrace();
		}
		//students.forEach(System.out::println);
		sortedStudents = new ArrayList<Student>(students);
		rank();
	}
	
	private static StudentService studentService = new StudentService();
	//static이 붙으면 한번만 초기화. 안붙으면(재귀호출) 스택오버플로우 발생가능성 높아짐
	//클래스변수의 라이프사이클(초기화시점)을 이해ㅡ
	
	private StudentService() {
	
	}
	public static StudentService getInstance() {
		return studentService;
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
		save();
		
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
		//stu.forEach(System.out::println);
		stu.forEach(s -> System.out.println(s));
		save();
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
		save();
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
		save();
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
//		sortedStudents.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.total() - o1.total();
//				
//				//평균으로 하고 싶다면? 더블에도 기본 컴페어가 있다
//				//return Double.compare(o2.avg(), o1.avg()) ;
//			}
//
//		});

		//==============2
		//sortedStudents = new ArrayList<>(new TreeSet<>(sortedStudents));
		// student에서 컴페어를 추가하고, 정렬규칙을 가진 student에게 의존.

		//==============3
	Collections.sort(sortedStudents, (o1, o2) -> o2.total() - o1.total());
	
	}
	
	//---------------------------------------학생 파일 저장
	private void save() { //파일이 다른곳에서 열려있다면 저장이 안됨. *예외발생
		try {
			File file = new File("data"); //현재 디렉토리 위치 기준(상대경로)
			if(!file.exists()) { //데이터파일이 없다면?
				file.mkdirs(); //생성해라
			}
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(file, "student.ser"))); //file 밑에 "student.ser" 파일을 만들겠다.
			oos.writeObject(students);
			oos.close();
		} catch (IOException e) {
			System.out.println("파일 접근 권한이 없습니다.");
			
		}
	}
	

	
	
} //studentServiece 닫는블럭
