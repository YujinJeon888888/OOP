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
		
		this.addMouseListener(this);//부착. this:  Listner가 어딨는지 위치를 알려줌
		this.addKeyListener(this);//부착
	}
	public static void main(String[]args) {
		new MyView2();
	}
	@Override//
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 클릭됨");//눌렸다 떼어져야 클릭으로 인식함
		this.setTitle("마우스가 클릭됨");
		System.out.println(arg0.getClickCount());
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 프레임 영역에 들어감");
		this.setTitle("마우스가 프레임 영역에 들어감");
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 프레임 영역에서 나감");
		this.setTitle("마우스가 프레임 영역에서 나감");
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 눌림");
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 release");
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
			this.dispose();//사라지게
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
		System.out.println(arg0.getKeyChar()+" 입력됨");
	}
}
