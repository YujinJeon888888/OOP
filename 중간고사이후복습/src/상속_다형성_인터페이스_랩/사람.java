package 상속_다형성_인터페이스_랩;

public class 사람 extends 동물 implements Think_able {
    private int 주민번호=2116020;
    private String 감정="기분좋다";

    public 사람(){
    	
    }

    public 사람(String 이름){
    	super(이름);
    }

    public void 먹기(){
    	System.out.println("엽떡 얌얌긋");
    }

    public void 자기(){
    	System.out.println(" 쿨쿨룰");
    }

    public void 놀기(){
    	System.out.println("닌텐도~재밌다~");
    }

    public void 정보보기(){
    	System.out.println("이름: "+super.get이름());
    	System.out.println("주민번호: "+this.주민번호);
    	System.out.println("감정: "+this.감정);
    }

    public void 생각하기(){
    	System.out.println("생각중");
    }

}
