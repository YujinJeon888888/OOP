package Chapter4;
//인자값 따라 호출되는 메소드 다르다는 예
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
		NumberBox obj=new NumberBox(3.14f);//float=> 상수일 시 f 붙여야 함.
		System.out.println(obj.fvalue);
		NumberBox obj2=new NumberBox(3);
		System.out.println(obj2.ivalue);
	}

}
