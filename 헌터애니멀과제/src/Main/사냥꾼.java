package Main;
import Animal.강아지;
import Animal.독수리;
import Animal.동물;
import Animal.뱀;
import Animal.상어;
import 장소.*;
import java.util.Scanner;
public class 사냥꾼 {
	
	동물농장 farm = 동물농장.getInstance();//불러오기
	숲속 forest = 숲속.getInstance();
	동물원 zoo = 동물원.getInstance();
	
	
	private int 은신력=0;
	private int 방어력=0;
	private int 돈주머니=10000; //기본 1만원
	public String 모자=null;
	public String 갑옷=null;
	
	public void 판매하기() {
		farm.showAnimals();
		int num=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		this.돈주머니+=zoo.구매하기(farm.getAnimals(),num);
		
		//같은동물있는지찾는 반복문(내가 넘긴 동물이랑 내가 동물농장에 갖고있는 동물 . 넘긴동물이랑 가지고있는 동물이랑 같으면 지워야함
		동물[] animals=farm.getAnimals();
		for(int n=0;n<farm.numOfAnimals;n++) {
			if(animals[n]==farm.getAnimal(num))
				break;
		}
		//찾아서 내 농장에서 지우기
		farm.removeAnimal(farm.getAnimal(num));
	}
	
	public int get돈주머니(){//추가

		return this.돈주머니;
	}

	public void set돈주머니(int 돈){//추가
		this.돈주머니 = 돈;
	} 
	public void set돈주머니(char plus_or_minus,int 돈){//추가, 더하고 빼기용
		if(plus_or_minus=='+')
			this.돈주머니 += 돈;
		if(plus_or_minus=='-')
			this.돈주머니 -= 돈;
	} 
	public int get은신력(){//추가

		return this.은신력;
	}

	public void set은신력(int 은신력){//추가
		this.은신력 = 은신력;
	} 
	public int get방어력(){//추가

		return this.방어력;
	}

	public void set방어력(int 방어력){//추가
		this.방어력 = 방어력;
	} 
	/////////////////
	public 사냥꾼() {
		
		System.out.println("########################################################");
		System.out.println(" 두둥 ! 숲속에 사냥꾼이 나타났습니다.! 이제사냥을 시작합니다.");
		System.out.println("########################################################");
	} 
	
    public 사냥꾼(int size){
    	this();
    	동물농장 farm = 동물농장.getInstance(size);
    }
    ///////////////
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("사냥꾼의 동물농장 크기 : " + farm.getSize());
    	System.out.println("사냥꾼의 money: " + this.돈주머니 +"원");    	
    	System.out.println("사냥꾼의 갑옷: " + this.갑옷 + " 방어력: "+this.방어력);    
    	System.out.println("사냥꾼의 모자: " + this.모자 + " 은신력: "+this.은신력);  
    	System.out.println("동물농장에 있는 동물 수: " + farm.numOfAnimals);
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals();
    }
 
	public void  show() {
		System.out.println("==========================================================================");
		System.out.print("##  사냥꾼의 동물농장 :");	
		farm.showAnimals();
	}
	
    public boolean 사냥하기(동물 ani){    	
    	System.out.println("무조건 성공! 뭐든지 잡고 본다! " + ani.이름);    	
    	return  true;
    }
 
    public boolean 사냥하기(강아지 dog){
   
    	boolean signal = doRandom(dog);
    	return signal;
    }
   
    public boolean 사냥하기(뱀 snake){    	
    	boolean signal = doRandom(snake);
    	return signal;  
    }
    
    public boolean 사냥하기(독수리 eagle){
    	boolean signal = doRandom(eagle);
    	return signal;  
    }
    public boolean 사냥하기(상어 shark){
    	boolean signal = doRandom(shark);
    	return signal;  
    }
    //동물들의 사냥확률에 따라 사냥성공여부 결과 리턴
    public boolean doRandom(동물 animal) {
    	int r=(int)(Math.random()*1000)% 100;//0~99
    	animal.공격하기(this);//추가. 동물이 공격 시도
    	if( r < animal.get사냥확률()) {
    		System.out.println(animal.이름+"의 공격을 막았습니다!");//추가
    		System.out.println(animal.이름 + "사냥하기 성공!");
    		return true;
    	}
    	else {
    		System.out.println(animal.이름+"에 의한 타격이 큽니다!");//추가
    		System.out.println(animal.이름 + "사냥하기 실패!");    	
    	}
    	return false;
    }
    
    //장소별로 오버로딩 가능
    public void 사냥하기(){
    	
    	//1. 동물배열중에서 랜덤하게 아무거나 고르기 : getAnimal()
    
    	동물 ani = forest.getAnimal();
    	boolean sig=false;    
    
    	if (ani instanceof 강아지) sig=사냥하기((강아지)ani);
    	else if (ani instanceof 뱀) sig=사냥하기((뱀)ani);
    	else if (ani instanceof 독수리) sig=사냥하기((독수리)ani);
    	else if (ani instanceof 상어) sig=사냥하기((상어)ani);
    	else sig = 사냥하기(ani);  // 동물을 인자로 받는 사냥하기가 호출됨.

    	//3. 숲에서 removeAnimal(), 동물농장에 addAnimal() 
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}    
    }
   
    //골라서사냥하기
    public void 사냥하기(int num){
    	
    	//1. 동물배열중에서 랜덤하게 아무거나 고르기 : getAnimal()    
    	동물 ani = forest.getAnimal(num);
    	boolean sig=false;    
    
    	if (ani instanceof 강아지) sig=사냥하기((강아지)ani);
    	else if (ani instanceof 뱀) sig=사냥하기((뱀)ani);
    	else if (ani instanceof 독수리) sig=사냥하기((독수리)ani);
    	else if (ani instanceof 상어) sig=사냥하기((상어)ani);
    	else sig = 사냥하기(ani);  // 동물을 인자로 받는 사냥하기가 호출됨.

    	//3. 숲에서 removeAnimal(), 동물농장에 addAnimal() 
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}    
    }
   
    
    public void 사냥하기(동물 [] animals){
    	//...
    	
    }
 

  
}
