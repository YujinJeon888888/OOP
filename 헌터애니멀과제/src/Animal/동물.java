package Animal;
import Main.*;
import 인터페이스.Escapeable;
import 인터페이스.Huntable;
import 인터페이스.Moveable;
import 인터페이스.Playable;
import 인터페이스.Workable;
import 장소.동물원;
import 장소.숲속;

public abstract class 동물 implements Playable, Moveable, Huntable, Workable, Escapeable {
	public String 이름;
	private int 나이;
	private int 사냥확률;
	public int power;
	private int 공격력;//추가
	//생성자
	public 동물(){
		System.out.println("동물을 한마리 생성합니다 : ");
	}
	public 동물(String 이름){
		this.이름=이름;
		System.out.println("동물을 한마리 생성합니다 : ");
		System.out.println(this.이름);
	}
	public 동물(String name, int 사냥확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.사냥확률=사냥확률;
    	System.out.println("동물을 한마리 생성합니다 : ");
		System.out.println(this.이름);
    }

	////////////////////
	public int get나이(){

		return this.나이;
	}

	public void set나이(int 나이){
		this.나이 = 나이;
	}   
	public int get공격력(){//추가

		return this.공격력;
	}

	public void set공격력(int 공격력){//추가
		this.공격력 = 공격력;
	} 
	public int get사냥확률(){

		return this.사냥확률;
	}

	public void set사냥확률(int 사냥확률){
		this.사냥확률 = 사냥확률;
	} 
	public void set사냥확률(char plus_or_minus,int 사냥확률){//추가
		if(plus_or_minus=='+')
		this.사냥확률 += 사냥확률;
		if(plus_or_minus=='-')
			this.사냥확률 -= 사냥확률;
	}   
	
	public abstract void 공격하기(사냥꾼 hunter);//추가
		//동물마다 공격력 범위 다르게 설정하고(범위는 내가 설정, 범위 안의 수는 랜덤)
		//사냥확률 set 불러서 (100-공격력) 인자로 넣기
		//사냥꾼이 사냥에 실패하면 공격메세지 출력, 성공하면 공격메세지 출력 x
		//동물마다 공격메세지 다르게
		
	public abstract void 놀기();//동물마다 놀기 다르게 구현됨->추상 . 인터페이스 또 abstract로 내리는 것 가능

	public abstract void 먹기();
		

	public void 자기() {//동물마다 다 같은 동작->오버라이딩 x
		System.out.println(this.이름+"이 잠을 잡니다. zZZ");
	}

	public abstract void 움직이기();//동물마다 놀기 다르게 구현됨->추상
	
	
	public void show(){
		
	}
	
	public void escape(동물 animal) {
		System.out.println("어머나 동물이 탈출을 합니다..");
		동물원 zoo=동물원.getInstance();//불러오기. 객체 하나니까 불러옴=싱글톤, new x
		숲속 forest=숲속.getInstance();
		//같은동물있는지찾는 반복문
		동물[] animals=zoo.getAnimals();
		for(int n=0;n<zoo.numOfAnimals;n++) {
			if(animals[n]==animal)
				break;
		}
		//찾아서 forest 에 넣기
		zoo.removeAnimal(animal);
		forest.addAnimal(animal);
		
		
		
	}

}
