package Weeks9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GoodCalc c=new GoodCalc(); //Calculator c=new GoodClac();�� ����
		 * 
		 * System.out.println(c.add(2, 3)); System.out.println(c.subtract(2, 3));
		 * System.out.println(c.average(new int[] {1,2,3}));//��?? ����ĭ���� �����ؼ� �ִ°� ����
		 * 
		 */
		������ mr;//���� ��(���������� ������). �������̽��� �������̱� ����!
		TV tv=new TV();
		Audio au=new Audio();
		Car car=new Car();
		
		//tv���۽��Ѻ���
		mr=tv;//������Ŵ. Ÿ���� ������, ��ü�� tv
		mr.turnOn();//mr.���� �� ������ Ÿ���� ��ɵ��� ����(������ ��ü��� ������)
		mr.set_vol(5);
		mr.set_MUTE();
		
		System.out.println("===================================");
		
		//�̹���, �ǻ�Ȱó�� �ܼ��� ������ ��ü�� ����� ����
		//������ ����� ���������� ���ְ�, �� ��ü�� ���ڷ� �����Ͽ� ���۽��Ѻ��ϴ�
		My������ my_rc=new My������(tv);
		
		System.out.println("tv sound: "+my_rc.get_vol());
		System.out.println("===================================");
		my_rc.changeMode(tv);
		my_rc.set_vol(9);
		
		System.out.println("tv sound: "+my_rc.get_vol());
		
		my_rc.changeMode(au);
		System.out.println("audio sound: "+my_rc.get_vol());
		
		my_rc.ChangeMode((Object)tv);//Object�� ����ȯ�� �Ͽ� �����ϸ� ȣ��Ǵ� �޼ҵ��?
		
		my_rc.changeMode(car);
		my_rc.turnOn();
		
	}

}
