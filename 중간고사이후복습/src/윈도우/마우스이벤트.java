package ������;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ���콺�̺�Ʈ extends JFrame implements MouseListener {



	private JPanel contentPane;
	public JLabel la=new JLabel("Hello");
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ���콺�̺�Ʈ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setTitle("���콺 �̺�Ʈ ����");
		this.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Container c=getContentPane();
		c.addMouseListener(this);//���콺������ ����. ����Ʈ���ο�.		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);//c�� label�� �÷�����
	}

	public static void main(String[] args) {
		new ���콺�̺�Ʈ();
	}
	
	
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
		int x=e.getX();
		int y=e.getY();

		la.setLocation(x, y);
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}



}


