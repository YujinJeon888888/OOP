package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lab4 extends JFrame{
	public Lab4() {
		//extends:상속=클래스내에있음=this.으로 불러오기가능
		this.setTitle("BorderLayout Sample");//경계선배치
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new BorderLayout(30,20));//가로 30 세로 20간격
		c.add(new JButton("Calculate"),BorderLayout.CENTER);//컴포넌트를 센터에 위치시킴
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);

		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab4();
	}

}
