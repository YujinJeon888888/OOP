package Weeks9;

public class SkyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sky s1=Sky.getInstance();
		Sky s2=Sky.getInstance();
		Sky s3=Sky.getInstance();
		if(s1==s2&&s2==s3)//���� ��ü ����
			System.out.println("���� ��ü�Դϴ�.");
		
		System.out.println("�Ȱ�: "+Sky.fog);//static����.
		s1.makeCloud(10);
		s1.drawSky();
	
	}

}
