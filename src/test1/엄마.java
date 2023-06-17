package test1;

public class 엄마 extends test1.할머니 {//특정패키지있는거 명시하고 싶으면 test1. 명시 안해도 되면 없애고
    private String 일기장;
    public 핸드폰 핸드폰압수bag;

    public void 요리하기(){
    	System.out.println("스파게티를 만들어요~");
    }

    public void 청소하기(){
    	System.out.println("구석구석 깨끗해요");
    }

    public void 할머니처럼요리하기(){
    	super.요리하기();//거슬러올라감.
    	//new 할머니().요리하기();
    }

    public void 핸드폰뺏기(짱구 짱){
    	//짱구의 핸드폰을 가져와서 저장하고, 짱구의 폰에는 null을 대입합니다.
    	this.핸드폰압수bag=짱.getPhone();//짱구의 폰 값을 엄마의 핸드폰가방에 넣음.
    	짱.setPhone(null);//phone 의 값을 null로 세팅함
    }

}
