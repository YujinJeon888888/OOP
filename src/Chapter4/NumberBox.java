package Chapter4;
//���ڰ� ���� ȣ��Ǵ� �޼ҵ� �ٸ��ٴ� ��
public class NumberBox {
	public int ivalue;
	public float fvalue;
	
	public NumberBox(){
	}
	public NumberBox(int d){
		ivalue=d;
	}
	public NumberBox(float num){
		fvalue=num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberBox obj=new NumberBox(3.14f);//float=> ����� �� f �ٿ��� ��.
		System.out.println(obj.fvalue);
		NumberBox obj2=new NumberBox(3);
		System.out.println(obj2.ivalue);
	}

}
