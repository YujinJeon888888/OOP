package ���;


import Main.*;
import Animal.*;
import Main.��ɲ�;
import �������̽�.Escapeable;
import �������̽�.Workable;
import Main.��ɲ�;
import Main.��ɲ�;


public class ������ extends Place implements  Workable, Escapeable{
	private static ������ instance = null;	

	private ������() { 	//�⺻ 10����
		this.where = "������";
		animals = new ����[size];

	}
	public static ������ getInstance() {

		if(instance==null) instance = new ������();
		return instance;
	}

	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## �������� �ִ� ������ :");

		showAnimals(animals , numOfAnimals);

	}

	//������ �������� ���ֺθ���� �� ����Ŭ�������� ������ �����ϼ���
	public void work() {
		System.out.println("�������� ���������� ���� �մϴ�.");
		System.out.println("���ָ� �η��� power�� �������� Ż���� �� �־��.");		
		Workable [] w = getAnimals();  // Workable �� ������� �����ϵ��� ����

		for(int i=0; i<numOfAnimals; i++) {			
			w[i].���ֺθ���();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public int �����ϱ�(����[] ����,int num) {//�߰� .���������ϱ�.
		if(����[num] instanceof ������)
		{
			addAnimal(����[num]);
			
			return 50000;
		}

		if(����[num] instanceof ������)
		{
			addAnimal(����[num]);
			return 200000;
		}

		if(����[num] instanceof ��)
		{
			addAnimal(����[num]);	
			return 70000;
		}
		if(����[num] instanceof ���)
		{
			addAnimal(����[num]);	
			return 400000;
		}
		return 0;
	}
	//�߰��Ѱ�
	public void addAnimal(���� ani) {
		try{
			animals[numOfAnimals] =ani;
			numOfAnimals++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� ������ ���� ���ֽ��ϴ�!");//���������� �ٲ�
		}	

	}	

}








