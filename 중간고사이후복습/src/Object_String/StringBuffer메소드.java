package Object_String;

public class StringBuffer�޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("This");//���� ��Ʈ��.
		
		//���ڿ� �����̱�
		sb.append(" is Pencil");
		System.out.println(sb);
		
		//"my"���ڿ� ����
		sb.insert(7," my");
		System.out.println(sb);
		
		//my�� your�� ����
		sb.replace(8, 10, "your");//8���� 10������ your�� �ٲٱ�
		System.out.println(sb);
		
		//your����: ��ġ 8���� 13������ ����
		sb.delete(8, 13);
		System.out.println(sb);
		
		//��Ʈ�� ���� �� ���ڿ� ���� ����
		sb.setLength(4);
		System.out.println(sb);
		
		//��Ʈ�� ������ ���� ũ�� ����
		System.out.println(sb.capacity());
		
		//��Ʈ�������� ���ڵ��� �ݴ� ������ ����
		System.out.println(sb.reverse());
	}

}
