package Week4;

public class For���ǿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0���� 10���� Ȧ�� ���
		for(int i=1;i<10;i+=2) {
			System.out.println(i+" ");
		}
		System.out.println("====================");
		//1���� 2000���� 2�� n�� ���ϱ�
		for(int i=1;i<=2000;i*=2) { 
				System.out.println(i);
		}
		System.out.println("=================");	
		//0���� 100������ ������ ���ϱ�
		for(int i=0,sum=0;i<=100;i++) {
			sum+=i;
			if(i==100)
			System.out.println(sum);
		}
		System.out.println("=====================");
		//100���� 0���� �Ųٷ� ī��Ʈ
		for(int i=100;i>=0;i--) {
			System.out.println(i);
			if(i==90)
				break;
		}
	}

}
