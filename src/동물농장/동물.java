package ��������;
public  class ���� implements Playable, Moveable {

	public String �̸�;

	private int ����;

	public int hp;

	public int power;

	private int money;



	static int numOfAnimals=0;  //��ü �������� �Ѱ� �ִ� �Ӽ�->static//��ü���� �ٸ����� �ƴ�, ��ü�� �����ϴ� �Ӽ�



	public ����(){//������

		System.out.println("��������");

		numOfAnimals++;//���� ������ ������ ���� ������ ++

	}



	public ����(String �̸�){//�Ű������ִ� ������

		numOfAnimals++;

		this.�̸� = �̸�;

		System.out.println("�������� \n �̸� : " + this.�̸�);

	}



	public int get����(){//����:private->getter setter:private�� ���� �����ϰ� ��.

		return this.����;

	}



	public void set����(int ����){

		this.���� = ����;

	}



	public int getMoney(){

		return this.money;

	}



	public void setMoney(int money){

		this.money = money;

	}



	public  void ���() {

		System.out.println("������ ���ӿ��� �پ��ϴ�~");

	}  



	public  void �Ա�() {

		System.out.println("������ ���ӿ��� Ǯ�� ���Խ��ϴ�~");

	}



	public  void �ڱ�() {

		System.out.println("������ ���ӿ��� ���� ��ϴ�~");

	}



	public  void �����̱�() {

		System.out.println("������ ���ӿ��� �����Դϴ�~");

	}



	public void show(){

		System.out.println("== ���� ==");

		System.out.printf("�̸� : %s  ���� : %d \n",this.�̸�, this.����);

		System.out.printf("hp : %d  power : %d  money: %d \n",this.hp, this.power, this.money);   

	}



}