package Object_String;

public class Rect {
	int width;
	int height;
	
	public Rect(int width,int height) {
		this.height=height;
		this.width=width;
	}
	public boolean equals(Object obj) {//����Ŭ������ �Ű�������
		Rect p=(Rect)obj;//����������ȯ
		if(this.width*this.height==p.width*p.height) {//�ּҰ� �ƴ϶� ���빰 ��
			return true;
		}
		else
			return false;
	}
}
