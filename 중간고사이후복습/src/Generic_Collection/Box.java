package Generic_Collection;

public class Box<T> {//TŸ�Ը� ��������.
	//Ŭ������ Ÿ���� ���ϴ� �Ŵϱ� Ŭ���� ���� <>�� �˸�
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[]args) {
		Box<String> box=new Box<String> ();
		box.setT("dd");
		//box.setT(dad);//������ ������(������ ���� ���� �� �ִ�)
		String str=box.getT();
		//int i=box.getT();//������
		
		Box<Integer> d=new Box<Integer>();
		d.setT(6);
		int value=d.getT();//���� ��ڽ�
		
		//��~~~~~~~~~~~��!
		//���ʸ� ����ϴ� ����
		//Ÿ�� �̽�ĳ���� ������ �� ����
		//���� �� ��Ÿ��-Ÿ�� ���� ���� �� ����
		//������ �ÿ� �̸� Ÿ���� ���ϰ� üũ�Ͽ� ������ �߻���Ŵ(���࿡���� ������ �����ѵ� ������ ������ �̸� �˸� ���ϴϱ�)
	
	}
}
