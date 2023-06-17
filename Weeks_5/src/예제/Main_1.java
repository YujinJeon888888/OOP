package 예제;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza=new Circle();//Circle 객체 생성
		pizza.radius=10;//피자의 반지름을 10으로 설정
		pizza.name="자바피자";//피자의 이름을 설정
		double area=pizza.getArea();//피자의 면적 알아내기
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle dounut;
		dounut=new Circle();//도넛 객체 생성
		dounut.radius=2;
		dounut.name="자바도넛";//도넛의 이름 설정
		area=dounut.getArea();//도넛의 면적 알아내기
		System.out.println(dounut.name+"의 면적은"+area);
	}

}
