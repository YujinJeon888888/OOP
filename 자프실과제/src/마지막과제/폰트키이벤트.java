package ����������;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ��ƮŰ�̺�Ʈ extends JFrame
{

	Container c;
	JLabel label;
	
	��ƮŰ�̺�Ʈ(){

		this.setTitle("+-Ű�� ��Ʈ ũ�� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300, 300);
		
		c = getContentPane();
		label = new JLabel();
		label.setText("Love Java");
		label.setFont(new Font("�޸ո���ü", Font.PLAIN, 10));
		MyKeyListener K = new MyKeyListener();
		label.addKeyListener(K);
		c.add(label);
		c.setLayout(new FlowLayout());
		//Ű �̺�Ʈ�� ���� �� �ִ� ����
		//-��� ������Ʈ
		//-���� ��Ŀ���� ���� ������Ʈ�� Ű �̺�Ʈ ����
		label.requestFocus();//�� �ƴ� ����
		
	}

	class MyKeyListener implements KeyListener	{
		@Override
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyChar() == '+')
			{
				label.setFont(new Font("�޸ո���ü", Font.PLAIN, label.getFont().getSize()+5));
			}
			if(e.getKeyChar() == '-' && label.getFont().getSize() > 5)
			{
				label.setFont(new Font("�޸ո���ü", Font.PLAIN, label.getFont().getSize()-5));
			}
		}
		@Override
		public void keyReleased(KeyEvent e)
		{

		}
		@Override
		public void keyTyped(KeyEvent e)
		{

		}

	}

	public static void main(String[] args)
	{
		new ��ƮŰ�̺�Ʈ();
	}
}



