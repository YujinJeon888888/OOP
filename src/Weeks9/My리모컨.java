package Weeks9;

public class My������ implements ������{
	������ rc=null;
	//������
	public My������(TV tv) {
		this.rc=tv;//Ƽ�� ������Ŵ
	}
	public My������(Audio au) {
		this.rc=au;//������� ������Ŵ
	}
	public My������(������ rm) {
		this.rc=rm;//�������� ������Ŵ
	}
	//��������޼ҵ屸�����1
	//�ϳ��� �޼ҵ忡�� ���� ��ü�� �����ϴ� ����
	//������ �ϳ��� �������� ��ü�� �����Ϸ� �մϴ�. Object�� �޴� ���� �̷���
	public void ChangeMode(Object o) {
		System.out.println("���ڸ� Object�� �޾� �����մϴ�. "); 
		if(o instanceof Audio) {//� ��ü�� ���� ��(��ü)�� ���� �ִ��� �˻� �ؼ� ��� ����
			System.out.println("Audio Mode�� �ٲߴϴ�.");
			this.rc=(Audio) o;
		}
		else if(o instanceof TV) {
			System.out.println("TV Mode�� �ٲߴϴ�.");
			this.rc=(TV) o;
		}
		else System.out.println("�ڵ��� Mode�� �ٲߴϴ�.");
	}
	
	
	//��ġ����޼ҵ屸�����2
	//�޼ҵ��� ���ڷ� ���е� �ϳ��� �޼ҵ忡�� �ϳ��� ����
	public void changeMode(Audio au) {
		System.out.println("Audio mode�� �ٲߴϴ�!");
		this.rc=au;//���ڷ� Audio�޾����� ������ų �� ����
	}
	public void changeMode(TV tv) {
		System.out.println("TV mode�� �ٲߴϴ�!");
		this.rc=tv;
	}
	public void changeMode(Car car) {
		System.out.println("Car mode�� �ٲߴϴ�!");
		this.rc=car;
	}
	
	public void turnOff() {
		this.rc.turnOff();//rc�� ��򰡿� ������Ų ���´�, ������ ��ü�� �޼ҵ尡 ����ɰ���.
	}
	public void turnOn() {
		this.rc.turnOn();
	}
	public void set_vol(int vol) {
		this.rc.set_vol(vol);//rc�� ��򰡿� ������Ų ���´�, ������ ��ü�� �޼ҵ尡 ����ɰ���.
	}
	public int get_vol() {
		return this.rc.get_vol();
	    }
}
