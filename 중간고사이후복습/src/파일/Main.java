package ����;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		File file=new File("C:\\�׽�Ʈ��\\�⸻����׽�Ʈ_in.txt");
		//�����̵� �� �� �ִ� 
		PrintWriter output=null;//�� �� ����ó���� �ʿ��� �ڵ�
		//�����̵� ���� �� �ִ�
		Scanner input=null;
		
		try {
			
			output=new PrintWriter("C:\\�׽�Ʈ��\\�⸻����׽�Ʈ_out.txt");
			input=new Scanner(file);//������ �о��
			
			while(input.hasNext()) {//���Ҵ��� �˾ƿ�
				String s=input.nextLine();//�о��. ���Ͽ� �ִ� ����
				System.out.println(s);// �ֿܼ� ����
				output.println(s);//���Ͽ��� ����
			}
			
			output.flush();//������ �о
			
		}catch(FileNotFoundException e) {//���Ͼ��� ����
			System.out.println("���� ����/���� ����!");
			e.printStackTrace();
		}finally {
			input.close();
			output.close();
		}
		System.out.println("��!!!");//�������� �� �� �� �ִ� �޼���. ���ܰ� ������ �� ������ �� �ִ� �޼���.
		//�ֿܼ��� ��µǴ� �޼���.
	}
}
