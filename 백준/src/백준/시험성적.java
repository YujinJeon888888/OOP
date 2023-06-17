package 백준;
import java.util.*;
public class 시험성적 {
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
//70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int score;
			score=in.nextInt();
			score/=10;
			switch(score)
			{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
		
			default:
				System.out.println("F");
				break;
			}
	}

}
