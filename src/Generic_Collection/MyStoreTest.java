package Generic_Collection;

public class MyStoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStore<String>[] store1=new MyStore[10];//선언만 한 상태
		MyStore<Integer>[] store2=new MyStore[10];
		
		store1[0]=new MyStore();//연결시킴(생성)
		store1[0].set("aaa");
		//store1[1].set(1234);//String 타입만 담는 상자니까 안 담김
		
		store2[0]=new MyStore();
		store2[0].set(123);
		//store2[0].set("1234");//Integer 타입만 담는 상자니까 안 담김
	}

}
