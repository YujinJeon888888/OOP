package Main;
import java.util.Scanner;

import Animal.������;
import Animal.������;
import Animal.����;
import Animal.��;
import Animal.���;
import ���.��������;
import ���.������ȣ��ȸ;
import ���.������;
import ���.����;
import ���.����;

//�������� �� ��ü�迭 �ǽ��� ���� �׽�Ʈ 
public class Main {

	public static void menu����() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("���ӿ� ��������:  1.������      2.��               3.������                     4. ���       ");
		System.out.println("   	     ����  : 11.����ϱ�  12.������ ���� ���ۺ��� 13. ���������� ���� ���ۺ���   14.�������� ���� ���ۺ��� \n\t\t 15. �����Ǹ� 16. ��������");
		System.out.println("   ���� ����  : 21.���Ӻ���  22.��ɲ��� �������庸��   23.����������   24. ��� ���� 25. ��ɲ� ����â      0.����");
		System.out.println("-----------------------------------------------------------------------");
	}
	

    public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
    	Scanner input = new Scanner(System.in);
    	���� forest = ����.getInstance();
    	������ zoo = ������.getInstance();
    	�������� farm = ��������.getInstance();
    	���� store=����.getInstance();
    	������ȣ��ȸ protect_association=������ȣ��ȸ.getInstance();
    	
		int menu =0 ; 
		
		//��ɲ� ����
		��ɲ� hunter  = new ��ɲ�();
		hunter.showInfo();

		//������ �Ѹ��� ����  �� ���!
		������ d = new ������("�����");
		boolean sig=hunter.����ϱ�(d);
		
		//����� �����ߴٸ�, �������忡 �ֱ�, �� ������ addAnimal()�� ���ȭ�� �� �ְ� "��ɰ�"���� �ӹ��� �ñ� �� ����
		if (sig==true) farm.addAnimal(d);
		hunter.show();
		farm.show();
		//////////////////////////////////////////////////////

		//�޴��� ���۽�Ű��
		System.out.println("------------------------------------------------------");
		System.out.println("���� 20���� �̸��̸� �Ļ��ϰ� GAME OVER �˴ϴ�. ");
		System.out.println("���� ���� ��� GAME OVER�� ���غ����� *^^*!");
		int i=0;
		while(true) {
			
			menu����();
			System.out.print("menu: ");
			menu= input.nextInt();
			if(menu==0) {
				System.out.println("���α׷� ����!");
				break;
			}		
			if(hunter.get���ָӴ�() < -200000)
				{
				System.out.println("���� �����ؼ� �Ļ��߽��ϴ�.");
				System.out.println("=====================");
				System.out.println("  !!!GAME OVER!!!");
				System.out.println("=====================");
				break;
				}
			switch (menu) {
				case 1:
					forest.addAnimal(new ������("�����" + (i++)));
					break;
				case 2:
					forest.addAnimal(new ��("������" + (i++)));
					break;
				case 3:
					forest.addAnimal(new ������("��������" + (i++)));
					break;
				case 4:
					forest.addAnimal(new ���("��ũ" + (i++)));
					break;				
				
				/////////////////////////////////////////
				case 11:
					if (forest.numOfAnimals == 1) {
					System.out.println("���°踦 ���� �Ѹ����� ����Ӵϴ�.");
					continue;
					}
					
					��ɸ޴�();
					Scanner in=new Scanner(System.in);
					int num=in.nextInt();
					forest.show();
					protect_association.�����ϱ�(hunter,num,forest);					
					
					break;
				case 12: 	
					forest.���();
					break;
				case 13:// ��������Ȱ������ - Ż��õ�!
					farm.escape();
					break;
				case 14: //������ Ȱ������ - ���ϱ�();	
					zoo.work();
					break;
				case 15: //�������� ���� �Ǹ�	
					hunter.�Ǹ��ϱ�();
					break;
				case 16:
					store.�޴�(hunter);
					break;
				case 21:
					forest.show();
					break;
				case 22:
					hunter.show();
					break;
				case 23:
					zoo.show();
					break;
				case 24:
					forest.show();
					farm.show();
					zoo.show();
					break;
				case 25:
					hunter.showInfo();
					break;
				default:
					System.out.println("�׷� �޴��� �����ϴ�.");
					break;	
				}				
		}
	
		       
    }


	private static void ��ɸ޴�() {
		// TODO Auto-generated method stub
		System.out.println("===================================================");
		System.out.println("1. ������� 2. ������ 3. �� 4. ������ 5. ��� ");
		System.out.println("===================================================");
		
	}

}


