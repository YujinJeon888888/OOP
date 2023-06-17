package 동물농장;
public class 오리 extends 동물 {



	//생성자!

	public 오리() {

	System.out.println("그냥 오리를 만듭니다.");

	}

	public 오리(String 이름) {

	this.이름 = 이름;

	System.out.println("이름이 " + 이름 +"인 오리를 만듭니다.");

	}

	    public void 헤엄치기(){

	    System.out.println(this.이름 +"이(가) 연못에서 헤엄을 칩니다.");

	    }

	    public void 움직이기() {
	    	System.out.println("푸다다닥");
	    }

	    public void 놀기(){

	    System.out.println(this.이름 +"이(가) 연못에서 헤엄을 치고 놉니다~ 룰루랄라~");

	    //그러나  헤엄치기()와 같은 동작을 한다면

	    //this.헤엄치기();로 호출할 수도 있습니다.

	   

	    }

	}