package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyView2 extends JFrame implements MouseListener,KeyListener{
	public MyView2() { 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setVisible(true);
		
		this.addMouseListener(this);//����. this:  Listner�� ������� ��ġ�� �˷���
		this.addKeyListener(this);//����
	}
	public static void main(String[]args) {
		new MyView2();
	}
	@Override//
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� Ŭ����");//���ȴ� �������� Ŭ������ �ν���
		this.setTitle("���콺�� Ŭ����");
		System.out.println(arg0.getClickCount());
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ ������ ��");
		this.setTitle("���콺�� ������ ������ ��");
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ �������� ����");
		this.setTitle("���콺�� ������ �������� ����");
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ����");
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 release");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar()+" pressed");
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			this.setLocation(this.getX()-20,this.getY());
		}

		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			this.setLocation(this.getX()+20,this.getY());
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			this.setLocation(this.getX(),this.getY()-20);
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			this.setLocation(this.getX(),this.getY()+20);
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			this.dispose();//�������
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" released");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" �Էµ�");
	}
}
