package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;



public class MyView extends JFrame implements MouseListener, KeyListener{

	public MyView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
		
		//������ ����!
		this.addMouseListener(this);
		this.addKeyListener(this);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		new MyView();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� Ŭ����");
		this.setTitle("���콺�� Ŭ����");
		System.out.println(e.getClickCount());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ����");
		this.setTitle("���콺�� ����");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 released!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ ������ ����");		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ �������� ���!");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar() + " pressed");				

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) this.setLocation(this.getX() + 20, this.getY());
		if (e.getKeyCode() == KeyEvent.VK_LEFT) this.setLocation(this.getX() - 20, this.getY());
		if (e.getKeyCode() == KeyEvent.VK_UP) this.setLocation(this.getX() , this.getY()-20);
		if (e.getKeyCode() == KeyEvent.VK_DOWN) this.setLocation(this.getX(), this.getY()+20);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	

	
}