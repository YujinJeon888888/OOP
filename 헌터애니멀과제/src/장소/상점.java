package ���;
import java.util.Scanner;

import Main.��ɲ�;


public class ���� {//�߰�. ������ ������ ���� �����Ƿ� ���x
	private static ���� instance=null;
	
	private ����() {
	}

	public static ���� getInstance() {
		if(instance==null)
			instance=new ����();//���� ��ü ������ ����

		return instance;//������ü ����
	}

	private static int ��ȣ;

	static Scanner in=new Scanner(System.in);
	public static void �޴�(��ɲ� hunter) {
		ȯ���޼���();
		while(true) {
				���θ޴�();
			��ȣ=in.nextInt();
			if(��ȣ==1) {	
				���ڸ޴�();
				��ȣ=in.nextInt();
				if(��ȣ==1) {
					if(hunter.get���ָӴ�()>=20000)
					{
						���Ÿ޼���();
						hunter.����="Ǯ�ٸ���";
						hunter.set���ŷ�(10);
					}
					else
					{
						�������޼���();
					}

				}
				if(��ȣ==2) {
					if(hunter.get���ָӴ�()>=150000)
					{
						���Ÿ޼���();
						hunter.����="���׸���";
						hunter.set���ŷ�(30);
					}
					else
					{
						�������޼���();
					}
				}
				if(��ȣ==3) {
					if(hunter.get���ָӴ�()>=400000)
					{
						���Ÿ޼���();
						hunter.����="ö ����";
						hunter.set���ŷ�(60);
					}
					else
					{
						�������޼���();
					}
				}
				if(��ȣ==0)
					continue;
			
			}

			else if(��ȣ==2) {
				���ʸ޴�();
				��ȣ=in.nextInt();
				if(��ȣ==1) {
					if(hunter.get���ָӴ�()>=20000)
					{
						���Ÿ޼���();
						hunter.����="Ǯ�԰���";
						hunter.set����(10);
					}
					else
					{
						�������޼���();
					}
				}
				if(��ȣ==2) {
					if(hunter.get���ָӴ�()>=150000)
					{
						���Ÿ޼���();
						hunter.����="���װ���";
						hunter.set����(30);
					}
					else
					{
						�������޼���();
					}
				}
				if(��ȣ==3) {
					if(hunter.get���ָӴ�()>=400000) {
						���Ÿ޼���();
						hunter.����="ö ����";
						hunter.set����(60);
					}
					else
					{
						�������޼���();
					}
				}
				if(��ȣ==0)
					continue;
			
			}
			else if(��ȣ==0)
				break;
			else
				System.out.println("�׷� �޴��� �����ϴ�.");
			continue;
		}
	}


	private static void ���ʸ޴�() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("     1. Ǯ�ٰ��� 2. ���װ��� 3. ö ���� 0. �޴��� ���ư���");
		System.out.println("����:    2����           15����       40����");
		System.out.println("���:  ����+10     ����+30    ����+60");
		System.out.println("=================================================");
	}

	private static void ���ڸ޴�() {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
		System.out.println("     1. Ǯ�ٸ��� 2. ���׸��� 3. ö ���� 0. �޴��� ���ư���");
		System.out.println("����:    2����           15����       40����");
		System.out.println("���:   ����+10        ����+30     ����+60");
		System.out.println("=================================================");
	}

	private static void ���θ޴�() {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("     1. ���� 2. ���� 0. ������");
		System.out.println("================================");
	}

	private static void ���Ÿ޼���() {
		System.out.println("�������ּż� �����մϴ� *^^*");
	}
	private static void ȯ���޼���() {
		System.out.println("================================");
		System.out.println("  *^^*������� ��ݻ����Դϴ�*^^*");
		System.out.println("================================");
	}
	private static void �������޼���() {
		System.out.println("���� �����ؿ� ��_��");
	}

}
