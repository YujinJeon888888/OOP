package Object_String;

import java.util.Calendar;

public class CalendarŬ���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calender�� �߻�Ŭ����->new Calender�� ���� �Ұ���. gerInstance()�� ����!
		//�޼ҵ���� gerInstance()�� �� �̱��� �ƴ�
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)+1;//now�� ����� ��. ���� 0~11�̶� +1��
		
		Calendar first=Calendar.getInstance();
		
		first.clear();//���� ��¥�� �ð� ������ ��� ����
		first.set(2022, 0,1);//2022�� 1�� 1��
		first.set(Calendar.HOUR_OF_DAY,20);//���� 8�÷� ����
		first.set(Calendar.MINUTE,30);//30������ ����
		System.out.println(first.getTime());
	}
}
