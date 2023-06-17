package 짱구는못말려;

public class 짱구 extends 엄마 {
    private 핸드폰 phone=new 핸드폰();

    public void setPhone(핸드폰 phone){//빈 공간에 phone을 쥐여줌.
    	this.phone=phone;
    }

    public 핸드폰 getPhone(){
    	return this.phone;//값 내보냄
    }

    public void 요리하기(){
    	System.out.println("컵라면을 끓여요~");
    }

    public void 청소하기(){
    	System.out.println("이불을 덮어요~");
    }

    public void 열심히공부하기(){
    	System.out.println("열심열심!");
    }

    public void 엄마처럼요리하기(){
    	super.요리하기();//엄마의 요리하기 메소드로 거슬러 올라감.
    }

    public void 할머니처럼요리하기(){
    	super.할머니처럼요리하기();//엄마의 할머니처럼 요리하기 메소드로 거슬러 올라감.
    }

    public void 요리하기(엄마 mom){
    	mom.요리하기();//엄마변수참조->엄마한테시킴.
    }

    public void 요리하기(할머니 grandma){
    	grandma.요리하기();//할머니변수참조->할머니한테 시킴.
    }

    public void 공부하기(){
    	if(phone==null) 열심히공부하기();//핸드폰 값이 없으면 열심히 공부
    	else{
    		for(int i=0;i<10;i++)
    			System.out.println("공부하는 척...");//핸드폰 있으면 공부하는척.
    		}
    	}
}