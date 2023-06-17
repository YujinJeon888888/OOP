package 테스트;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week13_2 extends JFrame{
	public Week13_2() {
		setTitle("+,-키로 폰트 크기 조정하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));      //기본 10
		c.add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		
		la.addKeyListener(new KeyAdapter() {	//익명 리스너
			public void keyPressed(KeyEvent e) {	//키가 눌리면 이벤트 발생
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