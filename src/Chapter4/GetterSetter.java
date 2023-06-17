package Chapter4;

public class GetterSetter {
	private int 积老=1121;
	public void set积老(int num){
		积老=num;
	}
	public int get积老() {
		return 积老;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GetterSetter test1=new GetterSetter();
	test1.set积老(1021);
	System.out.println(test1.get积老());

	}
}