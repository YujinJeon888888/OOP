package 상속_다형성_인터페이스_랩;

public class GeometryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry[] shapes=new Geometry[3];//공간만 만들음
		//객체에 연결시킴
		//업캐스팅됨(Geometry가 상위니까 자동형변환)
		shapes[0]=new Circle(2.0);
		shapes[1]=new Square(5.0);
		shapes[2]=new Triangle(8.0,5.0,5.0);
		
		//보이는 것 확인
		//shapes[0].
	}

}
