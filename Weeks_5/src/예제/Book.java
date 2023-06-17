package 예제;

public class Book {
	String title;
	String author;
	//기본 생성자 써두기
	public Book() {	};
	//생성자
	public Book(String t) {
		this.title=t;
		this.author="작가미상";
	}
	//생성자
	public Book(String t,String a) {
		this.title=t;
		this.author=a;
	}
}
