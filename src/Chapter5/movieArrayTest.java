package Chapter5;
import java.util.*;
public class movieArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Movie[] list=new Movie[2];
		//(������)����Ʈ ���� ->2�� ��
		for(int i=0;i<list.length;i++) {
			System.out.println("��ȭ����: ");
			String title=scanner.nextLine();
			System.out.println("��ȭ����: ");
			String director=scanner.nextLine();
			list[i]=new Movie(title,director);//�� ��->�� ������ Ÿ��Ʋ, ���� ����Ŵ
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("{ "+list[i].title+", "+list[i].director+" }");
		}
	}

}
