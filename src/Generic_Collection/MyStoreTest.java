package Generic_Collection;

public class MyStoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStore<String>[] store1=new MyStore[10];//���� �� ����
		MyStore<Integer>[] store2=new MyStore[10];
		
		store1[0]=new MyStore();//�����Ŵ(����)
		store1[0].set("aaa");
		//store1[1].set(1234);//String Ÿ�Ը� ��� ���ڴϱ� �� ���
		
		store2[0]=new MyStore();
		store2[0].set(123);
		//store2[0].set("1234");//Integer Ÿ�Ը� ��� ���ڴϱ� �� ���
	}

}
