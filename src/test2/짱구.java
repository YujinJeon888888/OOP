package test2;

public class 짱구 extends 엄마 {
    private 핸드폰 phone=new 핸드폰();

    public void setPhone(핸드폰 phone){
    	this.phone=phone;
    }

    public 핸드폰 getPhone(){
        return this.phone;
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
    	super.요리하기();
    }

    public void 할머니처럼요리하기(){
    	super.할머니처럼요리하기();//super super(x) super은 한 번만. 이 기능 엄마한테 물려받은거임.
    }

    public void 요리하기(엄마 mom){
    	mom.요리하기();//엄마한테시킴. 
    }

    public void 요리하기(할머니 grandma){
    	grandma.요리하기();
    }

    public void 공부하기(){
    	if(phone==null) 열심히공부하기();
    	else {
    		for(int i=0;i<10;i++)
    			System.out.println("공부하는 척...");
    	}
    }

}
