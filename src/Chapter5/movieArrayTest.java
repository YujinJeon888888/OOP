package Chapter5;
import java.util.*;
public class movieArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Movie[] list=new Movie[2];
		//(무비형)리스트 공간 ->2개 방
		for(int i=0;i<list.length;i++) {
			System.out.println("영화제목: ");
			String title=scanner.nextLine();
			System.out.println("영화감독: ");
			String director=scanner.nextLine();
			list[i]=new Movie(title,director);//각 방->그 무비의 타이틀, 디렉터 가리킴
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("{ "+list[i].title+", "+list[i].director+" }");
		}
	}

}
