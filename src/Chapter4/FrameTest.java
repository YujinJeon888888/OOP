package Chapter4;
import javax.swing.*;//javax.swing�̶�� ��Ű�� ���� ��� Ŭ������ �о���δ�.
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			JFrame f=new JFrame("Frame Test");//JFrame Ŭ������ ��ü�� �����Ѵ�. �����ڸ� ȣ���Ѵ�.
			f.setSize(300, 200);//JFrame Ŭ������ �޼ҵ带 ȣ���Ѵ�.
			f.setLocation(i*30, 20);//�������� ��ġ�� �����Ѵ�.
			f.setVisible(true);
		}
	}

}
