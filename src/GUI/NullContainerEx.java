package GUI;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		this.setTitle("NullContainer Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		
		JLabel la=new JLabel("Hello, Press Button");
		la.setLocation(130,50);//위치
		la.setSize(200,20);//사이즈
		c.add(la);//la를 더함
		
		for(int i=1;i<=9;i++) {
			JButton b=new JButton(Integer.toString(i));//숫자를 문자열로
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);//버튼부착
		}
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
