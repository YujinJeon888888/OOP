package Generic_Collection;

import java.util.ArrayList;

public class Box<T> {//���ʸ�Ŭ����
	
	private T t;
	//������ ������ �� 1. �迭
	private T[] ar;//�Ϲݹ迭 �����ϴ� �� �����ѵ�,
	
	
	//������ ������ �� 2.
	public ArrayList <T> al;//������ �̷��� ����
	
	public Box() {
		//ar=new T[10];//�� �ڵ尡 ������.(�츮�� �˴� ������� ���� �� ��)
		ar=(T[])new Object[10];//��ü�迭 ����� ����ȯ. �̷��� �ϸ� �Ǵµ� ������.����Ŭ������ ����Ŭ�������ϴ°�? �ǹ�x
		al=new ArrayList();
		
	}
	
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t=t;
	}
}

