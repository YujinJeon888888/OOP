package ������;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

//������: �������̽�!= �߻� �޼ҵ� ������ ����
public class �̺�Ʈ�߻� extends JFrame implements MouseListener, KeyListener{

	public �̺�Ʈ�߻�() {
		this.setSize(300,500);
		this.setVisible(true);
		//x������ �� �޸� �����ǰ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���콺 ������ �޾���� ���콺������ �۵�
		this.addMouseListener(this);//this: �������̵� �ؾ��� �޼ҵ尡 ���� �־�(Ŭ���� ���� �����س���)
		//������ �̷��� �������ְ�, ������ ���ÿ� �ȿ��� �־���
		//this.addMouseListener(new MouseListener() {
		//	
		//});
		this.addKeyListener(this);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new �̺�Ʈ�߻�();
	}
	
	//�߻�޼ҵ�� �������̵�
	//Ű
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
	//����Ű�� type�� �ȵ�.����Ű�� �Է��̶�� ���ϰ� ���ȴٰ� ��->����Ű:press�� �ֱ�
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar()+" typed");
	}

	
	//���콺
	@Override//Ŭ��: ���ȴٰ� ������.
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 Ŭ��!");//���콺 ���͵�: ���콺�� ����!
		this.setTitle("���콺 Ŭ��!");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ ������ ��!");//���콺 ���͵�: ���콺�� ����!
		this.setTitle("���콺�� ������ ������ ��!");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ �������� �����!");//���콺 �ͽ�Ʈ: ���콺�� ����
		this.setTitle("���콺�� ������ �������� ���!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ����!");//���콺 ���͵�: ���콺�� ����!
		this.setTitle("���콺 ����!");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ����!");//���콺 ���͵�: ���콺�� ����!
		this.setTitle("���콺 ����!");
	}

}
