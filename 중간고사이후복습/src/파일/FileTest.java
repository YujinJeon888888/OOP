package ����;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws FileNotFoundException {//ȣ���� ���� ���ѱ�
		// TODO Auto-generated method stub
		Scanner in=null;
		PrintWriter out=null;
		
		File inputFile=new File("C:\\Users\\������\\eclipse-workspace\\�߰�������ĺ���\\src\\����\\a");//�о�� ����
		File outputFile=new File("C:\\�׽�Ʈ��\\�⸻����׽�Ʈ_out.txt");
	
		in=new Scanner(inputFile);//�������� ����
		out=new PrintWriter(outputFile);//�� ���� ����
		
		while(in.hasNext()==true) {
			String s=in.nextLine();//�����а�
			System.out.println("���� ����: "+ s);//�ֿܼ����
			out.println();
			//out.append("\n");//�����ǹ�
			out.append("�о�� ����: "+s+"\n");//���Ͽ����
		}
		
		//������ ��� �� �ݵ�� �ݾ��ش�
		in.close();
		out.close();
		
		System.out.println("�ֿܼ��� ���: ��~~~~~~~~~~");//����ó�� �ȵǸ� �� �� ���� �޼���(��������� �� �ƴٴ� ���̴ϱ�)
	}
}
