package ���_������_�������̽�;

public class GoodCalc {
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract (int a,int b) {
		if(a>b)
			return a-b;
		if(b>a)
			return b-a;
		return 0;//�� �̿��� ���� ���� �����Ŵϱ�->�׷� ���� 0
		//�Ͽ�ư �߿��ѰŴ� if�� �� �ɸ� ���� �����ϴ� ���� ���ǵǾ�� ��.
	}
	public double average(int[] a) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}//�迭�� �޾����ϱ� �ε����� ���� �����ؾ���.
		
		return sum/a.length;
	}
}
