package �׽�Ʈ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week13_3 extends JFrame{
	public Week13_3() {
		setTitle("RandomC");	//���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//������ ���� �� ���α׷� ����
		setSize(300, 300);	//ũ�� ����
		setVisible(true);	//â ���̱�

		Container c = getContentPane();	//����Ʈ�� ����
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setSize(10, 10);
		la.setLocation(100, 100);
		c.add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		
		la.addMouseListener(new MouseAdapter() {	//�͸� ������
			public void mouseClicked(MouseEvent e) {	//Ű�� ������ �̺�Ʈ �߻�
				JLabel label = (JLabel)e.getSource();	//�̺�Ʈ �߻� �� ���۷��� ����
				label.setLocation((int)(Math.random()*250), (int)(Math.random()*250));
			}
		});
	}
	public static void main(String[] args) {
		new Week13_3();
	}
}