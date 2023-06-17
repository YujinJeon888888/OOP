package 무기;
public class  뚫어뽕 extends 무기 {
    private int 가격;
    //가격이 있어서 상위 클래스와 차별화됨.
    public 뚫어뽕(){
    }

  

    public 뚫어뽕(int 공격력, int 가격, String name){
    	super(name,공격력);
    	this.가격=가격;
    }



	public int get가격() {
		return 가격;
	}



	public void set가격(int 가격) {
		this.가격 = 가격;
	}

}
