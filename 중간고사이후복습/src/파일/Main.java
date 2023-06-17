package 파일;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		File file=new File("C:\\테스트용\\기말고사테스트_in.txt");
		//무엇이든 쓸 수 있는 
		PrintWriter output=null;//둘 다 예외처리가 필요한 코드
		//무엇이든 읽을 수 있는
		Scanner input=null;
		
		try {
			
			output=new PrintWriter("C:\\테스트용\\기말고사테스트_out.txt");
			input=new Scanner(file);//파일을 읽어옴
			
			while(input.hasNext()) {//남았는지 알아옴
				String s=input.nextLine();//읽어옴. 파일에 있는 라인
				System.out.println(s);// 콘솔에 쓰고
				output.println(s);//파일에도 쓰고
			}
			
			output.flush();//남은거 밀어냄
			
		}catch(FileNotFoundException e) {//파일없는 예외
			System.out.println("파일 열기/쓰기 문제!");
			e.printStackTrace();
		}finally {
			input.close();
			output.close();
		}
		System.out.println("끝!!!");//성공했을 때 볼 수 있는 메세지. 예외가 잡혔을 때 도달할 수 있는 메세지.
		//콘솔에만 출력되는 메세지.
	}
}
