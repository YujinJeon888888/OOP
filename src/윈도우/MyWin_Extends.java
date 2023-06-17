package 윈도우;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;

//extends는 클래스가 갖고있게
//버튼붙이기
public class MyWin_Extends extends JFrame{
	JButton btn;
	
	public MyWin_Extends() {
		//필수=크기,보여주기
		this.setSize(700, 300);
		this.setVisible(true);
		
		//정성들여서
		this.setTitle("나의 첫번째 윈도우-extends 버전");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 소멸되게
		
		//버튼생성, 부착
		btn=new JButton();
		btn.setText("나의 첫번째 버튼");
		btn.setBounds(300, 100, 150, 100);
		//색깔
		btn.setBackground(Color.orange);
		btn.setForeground(Color.blue);
		
		this.setLayout(null);//맘대로 레이아웃 정해준거 안쓴다는 뜻
		this.add(btn);
		
	}
	
	public static void main(String[]args) {
		new MyWin_Extends();//생성- 변수로 받지 않는 이유: 저장할 필요 없어서	
	}
	
}
