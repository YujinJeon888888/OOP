package Animal;

import Main.사냥꾼;

public class 독수리 extends 동물 {
	
	//생성자
	public 독수리(){
		this.이름="독수리";
		this.set사냥확률(30);  //독수리 사냥확률을 30%
	}

	public 독수리(String name){    	
		//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
		this();
		this.이름= name;
		System.out.println(this.이름);
	}
	public 독수리(String name, int 사냥확률){
		//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
		this(name);
		this.set사냥확률(사냥확률);
	}
	
	/////////////////////////
	public void 재주부리기(){
		System.out.println("나는 재주를 부리는 독수리.. ");
		System.out.println("열심히 일해서 돈도 벌고 power도 길러서 탈출을 시도해야지!");
		this.power+=20;
		System.out.println(this.이름+"의 power는 현재 "+this.power);
		if(power>=50)
			escape(this);
	}
	public void 공격하기(사냥꾼 hunter) {//추가
		set공격력((int)(Math.random()*100)%(80-90+1)+80);//공격력 범위는 80~90
		set사냥확률(100-get공격력()+hunter.get방어력());//사냥확률에 100-공격력을 넣음. 
		System.out.println("발톱 박기 스킬!!!");//공격메세지
		System.out.println(this.이름+"이 공격하였습니다. 데미지는 "+this.get공격력());
		//동물마다 공격력 범위 다르게 설정하고(범위는 내가 설정, 범위 안의 수는 랜덤)
		//사냥확률 set 불러서 (100-공격력) 인자로 넣기
		//사냥꾼이 사냥에 실패하면 공격메세지 출력, 성공하면 공격메세지 출력 x=>사냥꾼에서 구현하기
		//동물마다 공격메세지 다르게
	}
	
	public void 움직이기(){
		this.날기();
	}

	public void 날기(){
		System.out.println(this.이름+"이 멋지게 날아다닙니다. 펄럭~");
	}

	public void 놀기(){
		int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("여기저리 날아다니면서 놀고 싶은"+this.이름+"가 오늘은 바빠서 놀 시간이 없음 수리수리~");
			break;
		case 1:
			먹기();
			break;
		case 2:
			움직이기();
			break;
		case 3:	
			super.자기();
			break;
		}

	}
	public void 먹기() {//동물마다 먹기 다르게 구현됨->추상    	
		System.out.println(this.이름+"이 고기를 먹습니다.");
	}


}
