package Chapter4;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The cat is on the table";
		int index=s.indexOf("baby");
		if(index==-1)//���� �� -1 ��ȯ
			System.out.println("table�� �����ϴ�");
		else
			System.out.println("table�� ��ġ: "+index );
	}

}
