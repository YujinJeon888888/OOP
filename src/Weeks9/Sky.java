package Weeks9;

public class Sky {
	private static Sky instance=null;//static->�ϳ��� ����. �����Ǵ� �Ӽ�.->Sky.���� ����.
	
	static int fog=3;//static����
	int cloud;
	
	private Sky() {
		System.out.println("�ϴ� ��ü�� �����մϴ�.");
	}
	public static Sky getInstance() {
		if(instance==null)
			instance=new Sky();//�ϴ� ��ü ������ ����
		else
			System.out.println("�̹� �����Ǿ����ϴ�.");//�� ���� �� �ϰ�
		return instance;//�ϴð�ü ����(����Ÿ��: Sky)
	}
	public void makeCloud(int num) {
		cloud=num;//��������
	}
	public void drawSky() {
		String s="@@@";//�������
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<this.cloud;i++) {//���� ������ŭ ������� �׸��� �ݺ�
			System.out.printf("%7s",s);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
	}
}
