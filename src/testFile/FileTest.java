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
			File inputFile=new File("C:\\Users\\������\\eclipse-workspace\\����_2022_1\\src\\testFile\\aaa.txt");//�о���¿�
			File outputFile=new File("C:\\�׽�Ʈ��\\out.txt");//����ϴ¿�

			in = new Scanner(inputFile);
			out = new PrintWriter(outputFile);

			while(in.hasNext()==true) {
				String s=in.nextLine();
				System.out.println("�о�� ���� "+s);
				out.println("�о�� ����: "+s);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("���� �����̳� �� ȭ�� ��θ� Ȯ���غ�����");
			e.printStackTrace();
		}
		finally {//������ ����Ǵ� �����
			in.close();
			out.close();
		}

		System.out.println("��");//�ֿܼ������
	}
}
