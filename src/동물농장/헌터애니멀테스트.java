package ��������;

import java.util.Scanner;



public class ���;ִϸ��׽�Ʈ {



	public static void show�޴�() {

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("�޴�:  1.������    2.��   3.������    4. ���     ......... 8.��������  9.����  0.����ϱ�");

		System.out.println("-----------------------------------------------------------------------");



	}





	public static void ����ϱ�(���� [] animals) {





		System.out.println("�ƹ� �����̳� ����� �غ��ϴ�. ����Ȯ���� 50% !");

		int ��ɰ���ġ = (int)(Math.random()*1000) % ����.numOfAnimals;  //�迭���� ���� ��ġ. ��������

		System.out.println("��ɰ� ��ġ�� ������ " + animals[��ɰ���ġ].�̸� +"�Դϴ�. ���� �� �������? ");

		int r = (int)(Math.random()*1000) % 2;  // 50%�� �ִ� ����� ��������, �������� 0�Ǵ� 1�� �Ǵϱ�. 2����1

		���� ����ѵ��� = animals[��ɰ���ġ];



		//1�̸� ��ɼ���. 

		if (r==1) {

			animals[��ɰ���ġ]=null;//����

			System.out.println(����ѵ���.�̸� +"��ɿ� �����߽��ϴ�!");



			animals[��ɰ���ġ] = animals[����.numOfAnimals-1]; //�� ���� ������ ���ڸ��� �Űܵα�(�� �׷��� �������ϱ�), �������濡 �����ϰ� ¯���� null ¯�� �ڵ��� �����ϱ�
			animals[����.numOfAnimals-1]=null;
			����.numOfAnimals--; 



		}

		else System.out.println(����ѵ���.�̸� +"��ɿ� �����߽��ϴ�!");



	}



	public static void  showAnimals(String ���,���� [] animals) {



		System.out.printf("[%s]�� �� %d ������ ������ �ֽ��ϴ�. \n", ���, ����.numOfAnimals);//����.num..���� ��������
		//�������� 0���� ������-1�̴ϱ�.


		//for(���� a:animals)

		//System.out.println("�����̸� :" + a.�̸�);

		//

		for(int i=0; i<����.numOfAnimals; i++)

			System.out.println("�����̸� :" + animals[i].�̸�);//��ü�� �̸��� ����



	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);

		���� [] ���� = new ����[10]; //10������.

		int menu;

		int i=1;

		int k=0;

		showAnimals("����",����);
		//������ ���� �ݺ���
		while(true) {



			if(k==10) {

				System.out.println("���������� �� á���ϴ�! ");

				break;

			}

			show�޴�();

			System.out.print("�޴� : " );

			menu=input.nextInt();

			if (menu==9)
				break;
			//++�� �ڿ� ����-> 0 �ְ��� �÷��� ��.
			if(menu==1) ����[k++]=new ������("�����"+ i++);

			if(menu==2) ����[k++]=new ����("����"+ i++);

			if(menu==3) ����[k++]=new ������("��������"+ i++);

			if(menu==4) ����[k++]=new ���("��ũ��ũ"+ i++);
			
			if(menu==0) ����ϱ�(����);
	

			showAnimals("=����=",����);

		}

		//�޴��� ���� �ݺ���(�����ϸ� �ߴ� �޴�)
		while(true)
		{
			System.out.println("1.���Ӻ���  2.����ϱ� 9.����");
			menu=input.nextInt();

			if (menu==9)//�� 9������ ����.
				break;
			if(menu==1) showAnimals("=����=",����);
			if(menu==2) ����ϱ�(����);
		}

	}



}

