package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lab3 extends JFrame{
	
	public Lab3() {
		this.setTitle("FlowLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();//contentpane:내용영역
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//왼쪽부터정렬 ,수평, 수직
		c.add(new JButton("add"));//버튼: 컴포넌트 . 인자에 바로 생성//컨테이너=>컴포넌트
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab3();
	}

}
