package ������;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;

//extends�� Ŭ������ �����ְ�
//��ư���̱�
public class MyWin_Extends extends JFrame{
	JButton btn;
	
	public MyWin_Extends() {
		//�ʼ�=ũ��,�����ֱ�
		this.setSize(700, 300);
		this.setVisible(true);
		
		//�����鿩��
		this.setTitle("���� ù��° ������-extends ����");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x������ �Ҹ�ǰ�
		
		//��ư����, ����
		btn=new JButton();
		btn.setText("���� ù��° ��ư");
		btn.setBounds(300, 100, 150, 100);
		//����
		btn.setBackground(Color.orange);
		btn.setForeground(Color.blue);
		
		this.setLayout(null);//����� ���̾ƿ� �����ذ� �Ⱦ��ٴ� ��
		this.add(btn);
		
	}
	
	public static void main(String[]args) {
		new MyWin_Extends();//����- ������ ���� �ʴ� ����: ������ �ʿ� ���	
	}
	
}
