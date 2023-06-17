package 윈도우;
//까는거- help->마켓플레이스. 
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

//has는 필드가 갖고있게
public class MyWin_Has {
	
	JFrame frame;//가지고있으면? 필드로
	JLabel label;
	
	public MyWin_Has() {
		//frame생성, 크기, 보여주기
		frame=new JFrame();
		frame.setTitle("나의 두번째 윈도우-has 버전");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//x누르면 소멸되게. static이라 이렇게 가져옴. extends는 상속받게해서 바로 접근 가능한데 이거는 JFrame으로 접근

		frame.setSize(300,600);
		frame.setVisible(true);
		//위치
		frame.setLocation(500, 50);
		//frame.setBounds(600, 100, 300, 600);//크기, 위치 한꺼번에
		
		//라벨 생성,부착
		label=new JLabel("나의 첫번째 라벨");
		label.setBounds(50, 300, 100, 200);
		
		label.setOpaque(true);//Opaque=불투명. 기본적으로 투명하게 세팅되어있어서 불투명으로 설정하고 색 정함 
		label.setBackground(Color.yellow);
		
		frame.setLayout(null);
		frame.add(label);
		
	}
	
	public static void main(String[]args) {
		new MyWin_Has();//만들기
	}
	
}
