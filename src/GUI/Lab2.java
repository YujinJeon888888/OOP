package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class Lab2 extends JFrame{
	public Lab2() {
		this.setTitle("Lab2�� JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x�� ���� �����ϱ� ����
		Container contentPane=getContentPane();//����â
		contentPane.setBackground(Color.ORANGE);
		
		//��ġ�� ��ġ�ϴ� �ڵ� ���̾ƿ� �� �ϳ��� ����
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));//�����̳� ���� ������Ʈ �ø�
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		this.setSize(300,150);//ũ�⼳��
		this.setVisible(true);//������ ���̱�
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab2();//����
		//������ �ϸ� ��ü���� �ʿ�x
	}

}
