package Main;

import java.util.ArrayList;
import java.util.List;

import ����.����;
import ������.MyWin_battle_��;
import ������.Timebar;
import ������.����ȭ��;

import �÷��̾�.Player;
import �÷��̾�.����;
import �÷��̾�.����;
import �÷��̾�.��;
import �÷��̾�.�����;
import �÷��̾�.�ذ�;

import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//�����ι�
		���� ����=new ����("����","octopus.png",300);		
		����� �����=new �����("�����","Player.png",100);
		�� ��=new ��("��","sue.png",100);
		���� ����=new ����("����","cloud.png",3);
		�ذ� �ذ�=new �ذ�("�ذ�","skeleton.png",40);
		
		//����
		//����� ������ ����(����� ������ Ŭ���� �̸��� �޶���) Į Ŭ���� ����� new����� �ٲ���.
		�ذ�.setWeapon(new ����("�ذ��� ��öĮ",10));//�ϴ��� �⺻���ݷ� 10�ִµ� �޼ҵ忡�� �������� ���ݷ� ������ ��
		
		//����ȭ��ȣ��
		new ����ȭ��(����,  ����, �� ,����� ,  �ذ�);
		
		
    	//����Ʈ
//		List<Player> ps=new ArrayList<Player>();
//		ps.add(����);
//		ps.add(�����);
//		ps.add(��);
//		ps.add(����);
//		ps.add(�ذ�);
//	
	
		
		
//		�ȿ��� ���� ����. ������ ������� �ڵ尡 �� ����
//		ps.add(new ��("����",30,20)); 
		
		//�������� �ο� ���� ��
//		Player p1,p2;
//		while(true) {
//			int r1=(int)(Math.random()*100)%ps.size();//0~ũ��-1�� ����(�ε������)
//			p1=ps.get(r1);
//
//			int r2=(int)(Math.random()*100)%ps.size();
//			p2=ps.get(r2);
//
//			if(r1!=r2) break;//������ ��� ������, �ٸ��� ����.(�ߺ��Ǹ� �� �Ǵϱ�) 
//		}

		//�������. ����(����̰� �������� �����ϸ� ���� ����)
//		p1.setWeapon(new ������("������",10));
//		p2.setWeapon(new Weapon("����10��",10));
//		Player.show_header(); //static�̴ϱ� Ŭ������ ����(����ȰŴϱ�)
//		p1.show();
//		p2.show();

		//�ٷμ���
		//p1.setWeapon(new Weapon("����10��",30));	
		//consoleTest(p1,p2);
		
	}

//	public static void consoleTest(Player p1,Player p2) throws InterruptedException {
//
//		while (true) {
//			if (p1.getHp() <= 0 || p2.getHp() <= 0)
//				break;
//			// ��������!
//			if ((int) (Math.random() * 1000) % 2 == 1)
//				p1.�����ϱ�(p2);
//			else
//				p2.�����ϱ�(p1);
//			// p1.attack(p2);
//			// p2.attack(p1);
//
//			// Player.show_header();
//			p1.show();
//			p2.show();
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if (p1.getHp() <= 0)
//			System.out.println(p2.�̸� + " Win!");
//		else
//			System.out.println(p1.�̸� + " Win!");
//
//	}

}

