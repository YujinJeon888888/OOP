package ���;

import java.util.Scanner;

import Animal.������;
import Animal.������;
import Animal.��;
import Animal.���;
import Main.��ɲ�;

public class ������ȣ��ȸ extends Place{
	Scanner in=new Scanner(System.in);
	private static ������ȣ��ȸ instance=null;
	private int ���ü���Ȯ��=70;
	private ������ȣ��ȸ() {

	}

	public static ������ȣ��ȸ getInstance() {
		if(instance==null)
			instance=new ������ȣ��ȸ();

		return instance;
	}
	public void set���ü���Ȯ��(int percent) {
		this.���ü���Ȯ��=percent;
	}
	public int get���ü���Ȯ��() {
		return this.���ü���Ȯ��;
	}

	public void �����ϱ�(��ɲ� hunter,int num,���� forest) {
		//����Ȯ�� 70��
		���ü���Ȯ��-=hunter.get���ŷ�();//���ŷ��� �������� ���ü���Ȯ���� ��������.
    	int r=(int)(Math.random()*1000)% 100;//0~99
    	
    	if(forest.getAnimal(0)==null)
			System.out.println("������ �����ϴ�.");	
    	else {
    		if (num==1) {
    			if( r < ���ü���Ȯ��)
    			{
    				System.out.println("������ȣ��ȸ�� ���ÿ� �ɷȽ��ϴ�! ��ɿ� �����Ͽ����ϴ�!");
    				hunter.set���ָӴ�('-', 10000);
    				System.out.println("10000���� ������ �����մϴ�! ���� ���ָӴ� ����: "+hunter.get���ָӴ�());
    			}
    			else
    				hunter.����ϱ�();
    		}
    			
    		if(num==2)
    			{
    			int n=in.nextInt();
    			if( r < ���ü���Ȯ��)
    			{
    				if(forest.getAnimal(n) instanceof ������)
    				{
    				System.out.println("������ȣ��ȸ�� ���ÿ� �ɷȽ��ϴ�! ��ɿ� �����Ͽ����ϴ�!");
    				hunter.set���ָӴ�('-', 10000);
    				System.out.println("10000���� ������ �����մϴ�! ���� ���ָӴ� ����: "+hunter.get���ָӴ�());
    				}
    				else
    					System.out.println("�������� �ƴմϴ�!");
    			}
    			else if(forest.getAnimal(n) instanceof ������)
    				hunter.����ϱ�(n);
    			else
    				System.out.println("�������� �ƴմϴ�!");
    			}
    		if(num==3)
    		{
    			int n=in.nextInt();
    			if( r < ���ü���Ȯ��)
    			{
    				if(forest.getAnimal(n) instanceof ��)
    				{
    				System.out.println("������ȣ��ȸ�� ���ÿ� �ɷȽ��ϴ�! ��ɿ� �����Ͽ����ϴ�!");
    				hunter.set���ָӴ�('-', 10000);
    				System.out.println("10000���� ������ �����մϴ�! ���� ���ָӴ� ����: "+hunter.get���ָӴ�());
    				}
    				else
    					System.out.println("���� �ƴմϴ�!");
    			}
    			else if(forest.getAnimal(n) instanceof ��)
    				hunter.����ϱ�(n);
    			else
    				System.out.println("���� �ƴմϴ�!");
    			}
    		if(num==4)
    		{
    			int n=in.nextInt();
    			if( r < ���ü���Ȯ��)
    			{
    				if(forest.getAnimal(n) instanceof ������)
    				{
    				System.out.println("������ȣ��ȸ�� ���ÿ� �ɷȽ��ϴ�! ��ɿ� �����Ͽ����ϴ�!");
    				hunter.set���ָӴ�('-', 10000);
    				System.out.println("10000���� ������ �����մϴ�! ���� ���ָӴ� ����: "+hunter.get���ָӴ�());
    				}
    				else
    					System.out.println("�������� �ƴմϴ�!");
    			}
    			else if(forest.getAnimal(n) instanceof ������)
    				hunter.����ϱ�(n);
    			else
    				System.out.println("�������� �ƴմϴ�!");
    			}
    		if(num==5)
    		{
    			int n=in.nextInt();
    			if( r < ���ü���Ȯ��)
    			{
    				if(forest.getAnimal(n) instanceof ���)
    				{
    				System.out.println("������ȣ��ȸ�� ���ÿ� �ɷȽ��ϴ�! ��ɿ� �����Ͽ����ϴ�!");
    				hunter.set���ָӴ�('-', 10000);
    				System.out.println("10000���� ������ �����մϴ�! ���� ���ָӴ� ����: "+hunter.get���ָӴ�());
    				}
    				else
    					System.out.println("�� �ƴմϴ�!");
    			}
    			else if(forest.getAnimal(n) instanceof ���)
    				hunter.����ϱ�(n);
    			else
    				System.out.println("�� �ƴմϴ�!");
    			}
    	}
	}
}
