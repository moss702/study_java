package studyA;

public class BookClass {
	public static void main(String[] args) {
//1. 클래스 (필드 & 메서드 포함)
//문제: Book이라는 클래스를 만들고, 책 제목과 저자 이름을 필드로 가지게 해보자.
//생성자와 정보를 출력하는 메서드(printInfo)를 작성해보자.
		Book book = new Book();
		
		System.out.println(book);
		
	}
}

class Book { //하나의 클래스에는 하나의 퍼블릭 클래스만
	String title;
	String author;
	
	{
		title = "title";
		author = "author";
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Book [책 제목 = " + title + ", 저자 =" + author + "]";
	}	
}