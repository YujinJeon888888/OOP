package �׽�Ʈ;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week13_2 extends JFrame{
	public Week13_2() {
		setTitle("+,-Ű�� ��Ʈ ũ�� �����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));      //�⺻ 10
		c.add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		
		la.addKeyListener(new KeyAdapter() {	//�͸� ������
			public void keyPressed(KeyEvent e) {	//Ű�� ������ �̺�Ʈ �߻�
				if (e.getKeyChar() == '+'){	
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					label.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
				else if (e.getKeyChar() == '-'){
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					if (size <= 5) return;
					label.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
		});
	}
	public static void main(String[] args) {
		new Week13_2();
	}
}