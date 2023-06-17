package Animal;

import Main.사냥꾼;

public class 뱀 extends 동물 {

	//생성자
    public 뱀(){
    	this.이름="슈슈뱀"; 
    	this.set사냥확률(20); 
    }
     public 뱀(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();
    	this.이름= name; 	
    	System.out.println(this.이름);//생성자가 호출 순서는 맨 앞->생성자가 호출되고 나서 이름 설정가능->동물생성자에서 이름 프린트 해봤자 모름->여기에 이름 프린트
    }
    public 뱀(String name, int 사냥확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set사냥확률(사냥확률);
    }
    ///////////////////////////
    public void 공격하기(사냥꾼 hunter) {//추가
    	set공격력((int)(Math.random()*100)%(50-40+1)+40);//공격력 범위는 40~50
    	set사냥확률(100-get공격력()+hunter.get방어력());//사냥확률에 100-공격력을 넣음
    	System.out.println("꽈리 트기 스킬!");//공격메세지
    	System.out.println(this.이름+"이 공격하였습니다. 데미지는 "+this.get공격력());
    //동물마다 공격력 범위 다르게 설정하고(범위는 내가 설정, 범위 안의 수는 랜덤)
	//사냥확률 set 불러서 (100-공격력) 인자로 넣기
	//사냥꾼이 사냥에 실패하면 공격메세지 출력, 성공하면 공격메세지 출력 x=>사냥꾼에서 구현하기
	//동물마다 공격메세지 다르게
    }
    public void 재주부리기(){
    	System.out.println("나는 재주를 부리는 뱀.. ");
    	System.out.println("열심히 일해서 돈도 벌고 power도 길러서 탈출을 시도해야지!");
    	this.power+=10;
    	System.out.println(this.이름+"의 power는 현재 "+this.power);
    	if(power>=50)
    		escape(this);//this=이 객체를 탈출시킨다는 뜻.
      }
   
    
    
    public void 기어다니기(){
    	this.움직이기();
    }
    public void 먹기() { 	
    	System.out.println(this.이름+"이 쥐를 삼킵니다. 꿀꺽~");
    }
    
    public void 똬리틀기(){
    	System.out.println("꽈리꽈리 꽈리를 틀어보자 슈슈~");
    }
    public void 움직이기() {
    	System.out.println(this.이름+"이 기어다닙니다. 스스스...");
    }
    public void 놀기(){
    	int r=(int)(Math.random()*4);
		switch(r) {
		case 0:
			System.out.println("슈슈 ~ 슈슈~");
			똬리틀기();
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

}
