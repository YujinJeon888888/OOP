package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lab4 extends JFrame{
	public Lab4() {
		//extends:���=Ŭ������������=this.���� �ҷ����Ⱑ��
		this.setTitle("BorderLayout Sample");//��輱��ġ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new BorderLayout(30,20));//���� 30 ���� 20����
		c.add(new JButton("Calculate"),BorderLayout.CENTER);//������Ʈ�� ���Ϳ� ��ġ��Ŵ
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
