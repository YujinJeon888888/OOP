package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class Lab2 extends JFrame{
	public Lab2() {
		this.setTitle("Lab2와 JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 눌러 종료하기 위함
		Container contentPane=getContentPane();//내용창
		contentPane.setBackground(Color.ORANGE);
		
		//위치를 배치하는 자동 레이아웃 중 하나로 설정
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));//컨테이너 위에 컴포넌트 올림
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		this.setSize(300,150);//크기설정
		this.setVisible(true);//윈도우 보이기
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab2();//생성
		//생성만 하면 객체연결 필요x
	}

}
