package ������;
//��°�- help->�����÷��̽�. 
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

//has�� �ʵ尡 �����ְ�
public class MyWin_Has {
	
	JFrame frame;//������������? �ʵ��
	JLabel label;
	
	public MyWin_Has() {
		//frame����, ũ��, �����ֱ�
		frame=new JFrame();
		frame.setTitle("���� �ι�° ������-has ����");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//x������ �Ҹ�ǰ�. static�̶� �̷��� ������. extends�� ��ӹް��ؼ� �ٷ� ���� �����ѵ� �̰Ŵ� JFrame���� ����

		frame.setSize(300,600);
		frame.setVisible(true);
		//��ġ
		frame.setLocation(500, 50);
		//frame.setBounds(600, 100, 300, 600);//ũ��, ��ġ �Ѳ�����
		
		//�� ����,����
		label=new JLabel("���� ù��° ��");
		label.setBounds(50, 300, 100, 200);
		
		label.setOpaque(true);//Opaque=������. �⺻������ �����ϰ� ���õǾ��־ ���������� �����ϰ� �� ���� 
		label.setBackground(Color.yellow);
		
		frame.setLayout(null);
		frame.add(label);
		
	}
	
	public static void main(String[]args) {
		new MyWin_Has();//�����
	}
	
}
