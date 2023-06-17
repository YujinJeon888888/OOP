package 짱구는못말려;

public class 엄마 extends 할머니 {
    private String 일기장;
    private 핸드폰 핸드폰압수bag;

    public void 요리하기(){
    	System.out.println("스파게티를 만들어요~");//오버라이딩
    }

    public void 청소하기(){
    	System.out.println("구석구석 깨끗하게 청소해요~");
    }

    public void 할머니처럼요리하기(){
    	super.요리하기();//할머니의 요리하기로 거슬러 올라감
    }

    public void 핸드폰뺏기(짱구 짱){
    	//짱구의 핸드폰을 가져와서 저장하고, 짱구의 폰에는 null을 대입합니다.(짱구 클래스에서는 핸드폰 값이 null이됨.)
    	this.핸드폰압수bag=짱.getPhone();//짱.으로 기능 참조, getphone은 핸드폰 값 리턴함->핸드폰압수bag에 핸드폰 값 들어감.
    	짱.setPhone(null);//짱.으로 기능 참조, 핸드폰 값을 null로 만듦.
    	System.out.println("엄마가 핸드폰을 뺏었습니다!");
    }

}
