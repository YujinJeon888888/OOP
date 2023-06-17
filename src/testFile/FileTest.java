package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=null;
		PrintWriter out=null;
		try {
			File inputFile=new File("C:\\Users\\전문경\\eclipse-workspace\\수업_2022_1\\src\\testFile\\aaa.txt");//읽어오는용
			File outputFile=new File("C:\\테스트용\\out.txt");//출력하는용

			in = new Scanner(inputFile);
			out = new PrintWriter(outputFile);

			while(in.hasNext()==true) {
				String s=in.nextLine();
				System.out.println("읽어온 내용 "+s);
				out.println("읽어온 내용: "+s);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("읽을 파일이나 쓸 화일 경로를 확인해보세요");
			e.printStackTrace();
		}
		finally {//무조건 실행되는 문장들
			in.close();
			out.close();
		}

		System.out.println("끝");//콘솔에만출력
	}
}
