package ����ó��;

import java.util.Scanner;

public class ����ó�� {
	//throw
	public  static void method1() {
		try {

			method2();
		}catch(ClassNotFoundException e) {
			System.out.println("�׷� Ŭ������ �����ϴ�!");
			System.out.println(e.getMessage());
			//e.printStackTrace();//���ϴ��������˷���(�����޼���)
		}
	}

	public  static void method2() throws ClassNotFoundException {//throws-���ѱ�=> ȣ���Ѱ����� ��=method2

		Class clazz =  Class.forName("java.lang.String2");
	}

	public static void main(String[] args) {
		//main���� ������ os�� ����.

		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//0���� ������, index �߸� ���
		int [] ar=new int[5];
		//ar[10]=100;
		//��ȿ�����ʰ�,�����Ͽ��� �� ����
		//java.lang.ArrayIndexOutOfBoundsException(���� �˷���)
		int result=0;
		//Thread.sleep(1000);//����� �θ� ������. ���ͷ�Ƽ�� �ͼ���=Ȯ�ο���(�����Ϸ�üũ����)
		//��õ ���: try, Throw. try���� �� ����

		method1();

		try {
			//�ȿ� �־���� ��. 
		
			ar[4]=100;
			//���ܻ�� 1 = ArrayIndexOutOfBoundsException
			//ar[10]=100;//���� �߻� ����Ǵ� �� �ش�
			
								 //���ܻ�� 1 = ArrayIndexOutOfBoundsException
			for(int i=0; i<5;i++)//���� 15����->5����������(���ٰ�����)=>���ܹ߻�=>catch�鷶�ٰ� finally �鷶�ٰ� ����
				System.out.println(ar[i]);

			int d=5;
			//���ܻ�� 2 = ArithmeticException //0���� ��������
			//result = d/0;//0���� ���� ��=>���࿡�� ��ƾߵ�=>catch
		 
			//������ aa=new ������();//������. ������ class�����ϱ�
			
			//���ܻ�� 3 = ArrayStoreException // ���� �̻��ϰ� ��(String��ü�ε� Integer�� ����)
			// Object x[] = new String[3];
		    // x[0] = new Integer(0);
		     
		     ///////////////////////////////////////////////
			Thread.sleep(1000);//1000�� 1��, ������ �ִ� ��. ��ǥ�� ���ܹ߻� ����->���� ���� ����
			//Ȯ�ο���->����ó������ �ֱ⸸ �ϸ� ���. �����ϵǵ��� ������
			//Thread.sleep(1000);<-�̰� Ȯ�ο��ܶ�°� �����Ͽ����� �׳� ����ó������ �ֱ⸸ �ϸ� ����ȴٴ°ǰ���?=O

			System.out.println("������ �Է��ϼ���");
									//���ܻ�� 4 InputMismatchException // Ÿ�� �̻��Ѱ�(�ȸ´°�) ����
			int num=input.nextInt();//abcd, ū �� ���� �غ���(�ٵ� ���� �� �����->����Ʒ� catch���� ���� ��)
		
			// ���ܻ�� 5 ClassCastException // ĳ����(����ȯ) �̻���
			 Object x = new Integer(0);
		     System.out.println((String)x);

			
		} 
		catch(java.lang.ArrayStoreException e) {

			System.out.println("�߸��� ������ ��ü�� �����߾��");
		}
		catch(java.lang.ClassCastException e) {

			System.out.println("ĳ����(����ȯ)�� �̻��ϳ׿�. ");
		}
		catch(java.lang.ArithmeticException e) {

			System.out.println("0���� ������ �����ϴ�!");
			//result=10;//��������. ����������(���ȿ��� ������ ������ �� ������ ����)=>�ٱ����� �����ϱ�
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e�� �������� ��� ��
			System.out.println("�Ƹ��� �迭�� �ε����� ��ȿ������ �ʰ��Ǿ��� �ſ���!");
			System.out.println(e.getMessage());//�����޽���
			System.out.println(e.toString());//��� �׾������� �˷���(���°����)
			e.printStackTrace();//���, �� �׾����� �� ������ (��������)
		}

		catch(Exception e) {
			System.out.println("������ ���� ���� ���ܰ� ���⼭ ó���˴ϴ�!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {

			System.out.println("���ܰ� �ְų� ���ų� �׻� ����Ǵ� ���Դϴ�.");

		}
		//try��� ��(��������)
		System.out.println("������� ����� �� �������?");
		System.out.println("�� ������ �� ���ִٸ� ���α׷��� �ƹ� ������ ���� ��쿡��!");


	}

}
