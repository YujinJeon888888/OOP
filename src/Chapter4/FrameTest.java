package Chapter4;
import javax.swing.*;//javax.swing이라는 패키지 안의 모든 클래스를 읽어들인다.
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			JFrame f=new JFrame("Frame Test");//JFrame 클래스의 객체를 생성한다. 생성자를 호출한다.
			f.setSize(300, 200);//JFrame 클래스의 메소드를 호출한다.
			f.setLocation(i*30, 20);//윈도우의 위치를 설정한다.
			f.setVisible(true);
		}
	}

}
