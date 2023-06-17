package 윈도우;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

//리스너: 인터페이스!= 추상 메소드 가지고 있음
public class 이벤트발생 extends JFrame implements MouseListener, KeyListener{

	public 이벤트발생() {
		this.setSize(300,500);
		this.setVisible(true);
		//x눌렀을 때 메모리 삭제되게
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//마우스 리스너 달아줘야 마우스리스너 작동
		this.addMouseListener(this);//this: 오버라이딩 해야할 메소드가 여기 있어(클래스 내에 구현해놨음)
		//없으면 이렇게 생성해주고, 생성과 동시에 안에서 넣어줌
		//this.addMouseListener(new MouseListener() {
		//	
		//});
		this.addKeyListener(this);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new 이벤트발생();
	}
	
	//추상메소드들 오버라이딩
	//키
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" pressed");
		
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT)
			this.setLocation(this.getX()-20, this.getY());
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT)
			this.setLocation(this.getX()+20, this.getY());
		if(arg0.getKeyCode()==KeyEvent.VK_UP)
			this.setLocation(this.getX(), this.getY()-20);
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN)
			this.setLocation(this.getX(), this.getY()+20);
		if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
			this.dispose();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" released");
	}

	@Override
	//방향키는 type이 안됨.방향키는 입력이라고 안하고 눌렸다고 함->방향키:press에 넣기
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" typed");
	}

	
	//마우스
	@Override//클릭: 눌렸다가 떨어짐.
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭!");//마우스 엔터드: 마우스가 들어옴!
		this.setTitle("마우스 클릭!");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 프레임 영역에 들어감!");//마우스 엔터드: 마우스가 들어옴!
		this.setTitle("마우스가 프레임 영역에 들어감!");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스가 프레임 영역에서 벗어님!");//마우스 익시트: 마우스가 나감
		this.setTitle("마우스가 프레임 영역에서 벗어남!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 눌림!");//마우스 엔터드: 마우스가 들어옴!
		this.setTitle("마우스 눌림!");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 떼짐!");//마우스 엔터드: 마우스가 들어옴!
		this.setTitle("마우스 떼짐!");
	}

}
