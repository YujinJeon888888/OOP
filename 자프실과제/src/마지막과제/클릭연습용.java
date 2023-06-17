package 마지막과제;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class 클릭연습용 extends JFrame{
	Container c;
	JLabel label;
	public 클릭연습용() {
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("클릭하면 레이블 이동");
		this.setSize(300, 300);
		c=this.getContentPane();
		label=new JLabel();
		label.setText("c");
		c.setLayout(new FlowLayout());
		label.setLocation(50, 50);
		c.add(label);
		
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setLocation((int)(Math.random()*299),(int)(Math.random()*299));
			
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 클릭연습용();
		
	}

}
