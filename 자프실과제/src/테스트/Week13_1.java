package �׽�Ʈ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week13_1 extends JFrame{
	public Week13_1() {
		setTitle("�巡�뵿�� YELLOW�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		setVisible(true);
		
		Container c = getContentPane();
		c.setBackground(Color.green);
		
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.yellow);
			}
		});
		c.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.green);
			}
		});
	}
	public static void main(String[] args) {
		new Week13_1();
	}
}