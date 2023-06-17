package 마지막과제;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 폰트키이벤트 extends JFrame
{

	Container c;
	JLabel label;
	
	폰트키이벤트(){

		this.setTitle("+-키로 폰트 크기 변경");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300, 300);
		
		c = getContentPane();
		label = new JLabel();
		label.setText("Love Java");
		label.setFont(new Font("휴먼매직체", Font.PLAIN, 10));
		MyKeyListener K = new MyKeyListener();
		label.addKeyListener(K);
		c.add(label);
		c.setLayout(new FlowLayout());
		//키 이벤트를 받을 수 있는 조건
		//-모든 컴포넌트
		//-현재 포커스를 가진 컴포넌트가 키 이벤트 독점
		label.requestFocus();//안 됐던 이유
		
	}

	class MyKeyListener implements KeyListener	{
		@Override
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyChar() == '+')
			{
				label.setFont(new Font("휴먼매직체", Font.PLAIN, label.getFont().getSize()+5));
			}
			if(e.getKeyChar() == '-' && label.getFont().getSize() > 5)
			{
				label.setFont(new Font("휴먼매직체", Font.PLAIN, label.getFont().getSize()-5));
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
		new 폰트키이벤트();
	}
}



