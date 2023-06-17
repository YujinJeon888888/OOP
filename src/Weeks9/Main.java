package Weeks9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GoodCalc c=new GoodCalc(); //Calculator c=new GoodClac();도 가능
		 * 
		 * System.out.println(c.add(2, 3)); System.out.println(c.subtract(2, 3));
		 * System.out.println(c.average(new int[] {1,2,3}));//오?? 인자칸에서 생성해서 넣는거 가능
		 * 
		 */
		리모컨 mr;//선언만 함(참조변수만 생성됨). 인터페이스는 참조용이기 때문!
		TV tv=new TV();
		Audio au=new Audio();
		Car car=new Car();
		
		//tv동작시켜보기
		mr=tv;//참조시킴. 타입은 리모컨, 실체는 tv
		mr.turnOn();//mr.했을 때 리모컨 타입의 기능들이 보임(동작은 객체대로 동작함)
		mr.set_vol(5);
		mr.set_MUTE();
		
		System.out.println("===================================");
		
		//이번엔, 실생활처럼 단순한 리모컨 객체를 만들어 접근
		//리모컨 기능이 참조변수로 들어가있고, 각 객체를 인자로 세팅하여 동작시켜봅니다
		My리모컨 my_rc=new My리모컨(tv);
		
		System.out.println("tv sound: "+my_rc.get_vol());
		System.out.println("===================================");
		my_rc.changeMode(tv);
		my_rc.set_vol(9);
		
		System.out.println("tv sound: "+my_rc.get_vol());
		
		my_rc.changeMode(au);
		System.out.println("audio sound: "+my_rc.get_vol());
		
		my_rc.ChangeMode((Object)tv);//Object로 형변환을 하여 전달하면 호출되는 메소드는?
		
		my_rc.changeMode(car);
		my_rc.turnOn();
		
	}

}
