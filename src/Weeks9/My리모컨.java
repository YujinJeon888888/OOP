package Weeks9;

public class My리모컨 implements 리모컨{
	리모컨 rc=null;
	//생성자
	public My리모컨(TV tv) {
		this.rc=tv;//티비를 참조시킴
	}
	public My리모컨(Audio au) {
		this.rc=au;//오디오를 참조시킴
	}
	public My리모컨(리모컨 rm) {
		this.rc=rm;//리모컨을 참조시킴
	}
	//장지변경메소드구현방법1
	//하나의 메소드에서 여러 객체를 구분하는 동작
	//리모컨 하나로 여러개의 객체를 연결하려 합니다. Object로 받는 경우는 이렇게
	public void ChangeMode(Object o) {
		System.out.println("인자를 Object로 받아 변경합니다. "); 
		if(o instanceof Audio) {//어떤 객체의 참조 값(실체)이 들어와 있는지 검사 해서 사용 가능
			System.out.println("Audio Mode로 바꿉니다.");
			this.rc=(Audio) o;
		}
		else if(o instanceof TV) {
			System.out.println("TV Mode로 바꿉니다.");
			this.rc=(TV) o;
		}
		else System.out.println("자동차 Mode로 바꿉니다.");
	}
	
	
	//장치변경메소드구현방법2
	//메소드의 인자로 구분된 하나의 메소드에서 하나의 동작
	public void changeMode(Audio au) {
		System.out.println("Audio mode로 바꿉니다!");
		this.rc=au;//인자로 Audio받았으니 참조시킬 수 있음
	}
	public void changeMode(TV tv) {
		System.out.println("TV mode로 바꿉니다!");
		this.rc=tv;
	}
	public void changeMode(Car car) {
		System.out.println("Car mode로 바꿉니다!");
		this.rc=car;
	}
	
	public void turnOff() {
		this.rc.turnOff();//rc를 어딘가에 참조시킨 상태니, 참조한 객체의 메소드가 실행될것임.
	}
	public void turnOn() {
		this.rc.turnOn();
	}
	public void set_vol(int vol) {
		this.rc.set_vol(vol);//rc를 어딘가에 참조시킨 상태니, 참조한 객체의 메소드가 실행될것임.
	}
	public int get_vol() {
		return this.rc.get_vol();
	    }
}
