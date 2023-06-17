package 파일;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws FileNotFoundException {//호출한 곳에 떠넘김
		// TODO Auto-generated method stub
		Scanner in=null;
		PrintWriter out=null;
		
		File inputFile=new File("C:\\Users\\전문경\\eclipse-workspace\\중간고사이후복습\\src\\파일\\a");//읽어올 파일
		File outputFile=new File("C:\\테스트용\\기말고사테스트_out.txt");
	
		in=new Scanner(inputFile);//읽을파일 넣음
		out=new PrintWriter(outputFile);//쓸 파일 넣음
		
		while(in.hasNext()==true) {
			String s=in.nextLine();//한줄읽고
			System.out.println("들어온 내용: "+ s);//콘솔에출력
			out.println();
			//out.append("\n");//같은의미
			out.append("읽어온 내용: "+s+"\n");//파일에출력
		}
		
		//파일은 사용 후 반드시 닫아준다
		in.close();
		out.close();
		
		System.out.println("콘솔에만 출력: 끝~~~~~~~~~~");//예외처리 안되면 볼 수 없는 메세지(정상실행이 안 됐다는 뜻이니까)
	}
}
