package 장소;
import java.util.ArrayList;


import Animal.동물;
import Main.Main;

public abstract class Place {	
	
	String where;
	protected  동물[]  animals = null;  //최대 10마리로 세팅!
	public int numOfAnimals=0;
	int size = 10;  //크기
	public int getSize() {
		return this.size;
	}
	public 동물 [] getAnimals() {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		return this.animals;
	}	
	public 동물 getAnimal() {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		int r=(int)(Math.random()*1000)% numOfAnimals;
    	return this.animals[r];
	}	
	//추가 . 오버로딩. 동물 중 한 마리를 골라잡아서 리턴하는거니까 동물[]이 아니라 동물타입이다.
	public 동물 getAnimal(int num) {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
    	return this.animals[num];
	}
	
	public void  showAnimals() {
		
		System.out.print("(총 " + numOfAnimals+"마리)");
		
		for(int i=0; i<this.animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	public static void  showAnimals(동물 [] animals,int count) {
		
		System.out.print("(총 " + count +"마리)");
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	
	public  void set동물(동물 ani, int r) {
		animals[r] = ani;
		
	}
	public void addAnimal(동물 ani) {
		try{
			animals[numOfAnimals] =ani;
			numOfAnimals++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("숲속공간에 동물이 가득 차있습니다!");
		}	
		
	}	
	public  void removeAnimal(동물 ani) {
		int i=0;
		for(i=0; i<numOfAnimals; i++) {
			if(animals[i] == ani) {
				animals[i]=null;
				break;
			}
		}			
		animals[i]= animals[numOfAnimals-1];
		animals[numOfAnimals-1]=null;
		numOfAnimals--;
	}
}
