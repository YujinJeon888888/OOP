package ���ʸ�_�÷���;
import java.util.*;
public class SetTest {
//Set(����)�� ������ ���� , �ߺ��� ������� ����
//���� ������� �����͸� �����ϰ� ���� �� ���
//{1,2,3,4,5}�� �����̰� {1,1,1,3,4}�� ������ �ƴϴϱ�(����������)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		set.add("milk");
		set.add("����");
		set.add("����");
		set.add("������");
		set.add("��ġ");
		set.add("��ġ");//�� �� �߰������� �ϳ��� ����. 
		//LinkedHashSet���� �Է��� ������� ��µ�
		//TreeSet���� �Է��� ������� ��µ�
		System.out.println(set);
		if(set.contains("��ġ")) {
			System.out.println("��ġ�� ���ԵǾ� ����");
		}
	}

}
