package _0330;

public class test {
	private static void showArray(int[] ar) {//���ڸ� 1���� ����: 1���� ó����
		// TODO Auto-generated method stub
		//���ιݺ�������
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println();
	}
	public static void showArray(int [][] ar) {//���ڸ� 2���� ����: 2���� ó����
		//�ܺιݺ�������. 1�� �ݺ��� �� showArray 1���迭 �޴¾ִ� n�� �ݺ���. �ᱹ ar[0][]�� �� ar[0][1][2][3]����Ѵٴ� �Ŵϱ�  
		for(int row=0; row<ar.length; row++)//ar[0][]���� �޾Ƶ����� ����, ����� 2���迭 ó���ϴ� ��, ����� 1���迭 ó���ϴ� ������ �����ϱ�
			showArray(ar[row]);//2���迭�� 1���迭 ó���ϴ� ������ ����: �� ó���ѰŸ� �� ó���Ѱŷ� ����: �ึ�� �� ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar= {{1,2},{3,4}};
		showArray(ar);
		
	}

}
//ar[1][]�� ����� �ȵǴµ�? �� ��������ȭx ar[][]: 2���迭 ar[]: 1���迭��. ���ڷ� 1���迭�� ������ ar[0]�̷������� �����Ұ���. 1���迭�� �ٷ�ٴ� �����Ͽ� �ε����� �����ϴ°ű� ������ ar[][2]�̷��� ����� �� �����ߴ� ��ó�� ���� �ʴ� ����. 