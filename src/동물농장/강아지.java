package 동물농장;

public class 강아지 extends 동물 implements Playable {
    String 숨겨둔간식;

    public 강아지(){
    	super();//생성자 super()로 부름//super()한번이라도 작성하면 자동으로 생성 안해주기 때문
    }

    public 강아지(String name){
    	super(name);//name초기화하는 생성자를 부름
    }

    public String get숨겨둔간식(){
        return this.숨겨둔간식;
    }

    public void set숨겨둔간식(String 숨겨둔간식){
    //set이니 숨겨둔간식 셋.
    	this.숨겨둔간식=숨겨둔간식;//입력한대로 넣음
    }

    public void 움직이기(){
    	System.out.println("와다다다다다");
    }

    public void 놀기(){
    	System.out.println("멍멍!");
    }

    public void 애교부리기(){
    }

    public void 인형물어뜯기(){
    }

    public void 신발물고도망가기(){
    }

    public void 공부하기(){
    }

    public void 소리내기(){
    }

}
