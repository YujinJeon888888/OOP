package Animal;

import Main.사냥꾼;

public class 상어 extends 동물 {
	//생성자
	public 상어() {
		this.이름 = "샤크";
		this.set사냥확률(101);//공격력:100->실제사냥확률:1퍼센트  극악확률
	}

	public 상어(String name) {
		// 공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
		this();
		this.이름 = name;
		System.out.println(this.이름);
	}
	public 상어(String name, int 사냥확률) {
		// 변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
		this(name);
		this.set사냥확률(사냥확률);
	}
	/////////////////////////
	public void 공격하기(사냥꾼 hunter) {//추가
		set공격력(100);//공격력은 무조건 100
		set사냥확률(101-get공격력()+hunter.get방어력());//사냥확률에 100-공격력을 넣음=>사냥성공확률은 1퍼센트
		System.out.println("무시무시한 이빨로 물기 스킬!");//공격메세지
		System.out.println(this.이름+"이 공격하였습니다. 데미지는 "+this.get공격력());
		//동물마다 공격력 범위 다르게 설정하고(범위는 내가 설정, 범위 안의 수는 랜덤)
		//사냥확률 set 불러서 (100-공격력) 인자로 넣기
		//사냥꾼이 사냥에 실패하면 공격메세지 출력, 성공하면 공격메세지 출력 x=>사냥꾼에서 구현하기
		//동물마다 공격메세지 다르게
	}



	public void 헤엄치기(){
		System.out.println("상어가 강에서 헤엄칩니다. 어푸어푸~");
	}

	public void 움직이기(){
		this.헤엄치기();
	}

	public void 놀기(){
		int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("여기는 숲속이잖아! 나를 어서 바다로 보내줘!!!~ 상어상어");
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
	public void 먹기() {
		System.out.println(this.이름+"이 풀이라도 뜯어먹습니다. 바다 가고 싶어 ㅠㅠ");
	}
	public void 재주부리기(){
		System.out.println("샤크샤크.. 나는 재주를 부리는 상어 ");
		System.out.println("열심히 일해서 돈도 벌고 power도 길러서 탈출을 시도해야지!");
		this.power+=30;
		System.out.println(this.이름+"의 power는 현재 "+this.power);
		if(power>=50)
			escape(this);
	}

}
