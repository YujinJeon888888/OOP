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
		la.setLocation(130,50);//��ġ
		la.setSize(200,20);//������
		c.add(la);//la�� ����
		
		for(int i=1;i<=9;i++) {
			JButton b=new JButton(Integer.toString(i));//���ڸ� ���ڿ���
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);//��ư����
		}
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}