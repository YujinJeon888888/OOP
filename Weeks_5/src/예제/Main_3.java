package 예제;

public class Main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle_3 pizza=new Circle_3(10,"자바피자");//Circle 객체 생성, 반지름 10(주고 시작)
	
	double area=pizza.getArea();
	System.out.println(pizza.name+"의 면적은 "+area);
	
	Circle_3 donut=new Circle_3();//Circle 객체 생성, 반지름 1//Circle 객체 생성, 기본 생성자 호출(빈몸)
	donut.name="도넛피자";
	area=donut.getArea();
	System.out.println(donut.name+"의 면적은"+area);
	
	}

}
