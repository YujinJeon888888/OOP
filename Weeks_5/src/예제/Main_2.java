package 예제;
import java.util.Scanner;
public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangle rect=new Retangle();//객체 생성
		Scanner input=new Scanner(System.in);
		System.out.println(">>가로: ");
		rect.width=input.nextInt();
		System.out.println(">>세로: ");
		rect.height=input.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		input.close();
	}

}
