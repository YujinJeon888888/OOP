package Chapter4;

public class Dice {

	private int value;

	//������
	public Dice() {
		value=0;
	}

	public void roll() {
		value=(int)(Math.random()*6+1);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int num) {
		value=num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1=new Dice();
		Dice dice2=new Dice();
		int count=0;
		dice1.setValue(3);
		dice2.setValue(5);
		while(true) {
			dice1.roll();
			dice2.roll();
			System.out.println("�ֻ��� 1: "+dice1.getValue()+" �ֻ���2: "+dice2.getValue());
			count++;
			
			if(dice1.getValue()+dice2.getValue()==2)
			{
				System.out.println("(1,1)�� ������ �� �ɸ� Ƚ��: "+count);
				break;
			}
		}
	}//main

}//class
