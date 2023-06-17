package 장소;


import Main.*;
import Animal.*;
import Main.사냥꾼;
import 인터페이스.Escapeable;
import 인터페이스.Workable;
import Main.사냥꾼;
import Main.사냥꾼;


public class 동물원 extends Place implements  Workable, Escapeable{
	private static 동물원 instance = null;	

	private 동물원() { 	//기본 10마리
		this.where = "동물원";
		animals = new 동물[size];

	}
	public static 동물원 getInstance() {

		if(instance==null) instance = new 동물원();
		return instance;
	}

	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물원에 있는 동물들 :");

		showAnimals(animals , numOfAnimals);

	}

	//동물원 동물들의 재주부리기는 각 동물클래스에서 적절히 구현하세요
	public void work() {
		System.out.println("동물들이 동물원에서 일을 합니다.");
		System.out.println("재주를 부려서 power가 높아지면 탈출할 수 있어요.");		
		Workable [] w = getAnimals();  // Workable 한 기능으로 접근하도록 설정

		for(int i=0; i<numOfAnimals; i++) {			
			w[i].재주부리기();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public int 구매하기(동물[] 동물,int num) {//추가 .동물구매하기.
		if(동물[num] instanceof 강아지)
		{
			addAnimal(동물[num]);
			
			return 50000;
		}

		if(동물[num] instanceof 독수리)
		{
			addAnimal(동물[num]);
			return 200000;
		}

		if(동물[num] instanceof 뱀)
		{
			addAnimal(동물[num]);	
			return 70000;
		}
		if(동물[num] instanceof 상어)
		{
			addAnimal(동물[num]);	
			return 400000;
		}
		return 0;
	}
	//추가한거
	public void addAnimal(동물 ani) {
		try{
			animals[numOfAnimals] =ani;
			numOfAnimals++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("동물원에 동물이 가득 차있습니다!");//동물원으로 바꿈
		}	

	}	

}








