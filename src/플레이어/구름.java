package �÷��̾�;


import java.util.Scanner;

import Main.Main;
import ������.MyWin_battle_��;
import �������̽�.Ÿ�ڹ�Ʋ;

public class ���� extends Player  implements Ÿ�ڹ�Ʋ{
    private int count=0;
    public String s1="����ȭ ���� �Ǿ����ϴ�.";
    public String s2="��Ÿ���� HelloWorld";
    public String s3="���Ⱑ   ��� ������!!^^";//3��
    public String s4="����û öâ���� ��öâ���̳� ��öâ���̳�";
    public String s5="�ð� ���� ������ ���� ���� ������";
    private String �Է°�;
    public int r;
    public String[] s= {s1,s2,s3,s4,s5};
    
    public ����(){
    }

    public ����(String �̸�, String img,int hp){
    	super(�̸�,img,hp);
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String get�Է°�() {
		return �Է°�;
	}

	public void set�Է°�(String �Է°�) {
		this.�Է°� = �Է°�;
	}

	@Override
	public void �����ϱ�(Player target) throws InterruptedException {
		// TODO Auto-generated method stub		
		Ÿ��ġ��();
	}
	//Ÿ�ڹ�Ʋ�� view���� ���̱� ������ view���� ������.
	//ta���� ������ ����� s[r]�� ���ϴ� ���̱� ������ �ֿܼ��� �񱳰� �� ��. 
	
	public void Ÿ��ġ��() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
				//��������(�����ϱ� ������ ��)
				System.out.println("���̴� ������ ��Ȯ�� ����ġ����");
				r=(int)(Math.random()*5);//�ֻ���������
				//�ֿܼ� �ȳ�
				System.out.println(s[r]);
			
	}

	@Override
	public int ����üũ(Player target) {
		// TODO Auto-generated method stub
		����� p1=(�����)target;//�ٿ�ĳ����
		//����üũ					
		//view
		if(MyWin_battle_��.getTa().getText().equals(s[r]))
			return 1;//����̰� �̰�ٴ� ��
		else {
			this.count++;
			return 2;//������ �̰�ٴ� ��
		}
	
	}


  

}
