package Object_String;

public class Point {

	//	//���� �޼ҵ�
//	public String toString() {//��ü�̸��� �ؽ��ڵ�
//		return getClass().getName()+"@"+Integer.toHexString(hashCode());
//	}//�������̵�������.
//	
	//�翬�� PointŬ������ Object�� ����ϴϱ� ���⼭ �������̵�.
	//(Main���� PointŬ������ �޼ҵ� ȣ���ҰŴϱ�.)
	public String toString() {//��ü�̸��� �ؽ��ڵ�
		return "PointŬ��������";
	}//�������̵�������.
	
	int x,y;
	public Point(int x,int y) {
	this.x=x;
	this.y=y;
	}
	
	public boolean equals(Object obj) {
		Point p=(Point)obj;//����������ȯ. �̰Ŵ� ����������ȯ
		//Point pp=new Object(); �̰Ŷ��� �ٸ�����.(������ü�� �����þ߷� �����Ű�� �ϴ°Ŵϱ�)
		
		if(x==p.x&&y==p.y) {
			return true;
		}
		else
			return false;
	}
}
