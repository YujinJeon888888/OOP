package Chapter2;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1.�ڹ� ���� �����Ǵ� 8������ ���� �ڷ����� �����ΰ�?
				byte, char, short, int, 
				long, double, float, boolean
		2. ���ڿ��� � Ŭ������ �̿��Ͽ� ó���� �� �ִ°�?
				String
		3. �ֹε�Ϲ�ȣ�� ���α׷����� �����Ϸ��� �ڹ��� � �ڷ����� �����ϴ� ���� ������
				int
		4. ���� �߿��� �ùٸ� �ּ��� �ƴ� ����?
				"/*�ּ�"
		5. ���� �ڵ忡�� ������ ����� �����Ͻÿ�
*/			
	//	6. ������ ���� �ڵ忡�� ������ ���϶�.
				int v=10;
				int k=v++%5;
				System.out.println(v+"��"+k);
				//1)v��k�� ����?->v:11, k:0
				
				//2)���� �� ��° ������ int k=++v%5;���ٸ� v�� k�� ����? ->v:11, k=1
				v=10;
				k=++v%5;
				System.out.println(v+"��"+k);
		//7. ���� ������� �������� ����� ��°���� �����ÿ�
		System.out.println("100"+"200");
		System.out.println(100+200);
		System.out.println("100"+200);
		/*		100200
				300
				100200*/
		//8. ���� ���α׷��� �����?
			//10209->Ʋ��
			//��:309
		int i1=10;
		int i2=20;
		String s1="9";
		System.out.println(i1+i2+s1);//i1+i2:30
		//9. ���� ������ ����� �� ���� i�� ����? ����� Math.random()�� 0���� ũ�� 1���� ���� �Ǽ��� ��ȯ�Ѵ�.
				int i=(int)Math.random();
				System.out.println(i);
		//��:0
		
		//10. boolean ������ ���� true���� false�� ������Ű���� � �����ڸ� ����ؾ� �ϴ°�?
				//!true
				System.out.println(!true);
		//11. 2���� ���� ���Ϸ��� �Ѵ�. =�����ڸ� ����Ͽ��� �ϴ°�? �ƴϸ� ==�����ڸ� ����Ͽ��� �ϴ°�?
				//==
		//12. ���� ���α׷��� �����?
				//abcghidef
				String S1="abc";
				String S2="def";
				String S3=S2;
				S2="ghi";
				System.out.println(S1+S2+S3);
		//13. ���� ���α׷��� �����?
				// b: false
				int x=100;
				double y=123.4;
				boolean b= (x == y);
				System.out.println(b);
		14. ���� ���α׷����� 6�� ���� �� �� ��µǴ� ������ �����϶�.
		//i++������
		15. �� ������ ������ ��, ������ ���� ǥ�� ����Ͻÿ�. ����ڴ� 2 3 �� ���� �Է��Ѵٰ� �����Ѵ�.
		
	}

}
