package 동물농장;
public class 독수리 extends 동물 {
    public int 날개;

    public 독수리(String 이름){
    	super(이름);//생성자
    }

    public 독수리(String 이름, int 날개){//생성자2
    	super();
    	this.이름=이름;
    	this.날개=날개;
    	
    }

    public void 움직이기(){
    }

    public void 날기(){
    }

    public void 놀기(){
    }

}
