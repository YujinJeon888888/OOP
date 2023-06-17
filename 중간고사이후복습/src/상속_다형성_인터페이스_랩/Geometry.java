package 상속_다형성_인터페이스_랩;
public interface Geometry {

	public static final double PI=3.14159;//인터페이스->객체 만드는 용 아님->멤버변수 사용 불가->상수만 가능
	
    public double area();

    public double perimeter();

    public default void showInfo() {
    	System.out.println("현재 PI값: "+PI);
    }

}
