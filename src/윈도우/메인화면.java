package ������;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Main;
import �÷��̾�.����;
import �÷��̾�.����;
import �÷��̾�.��;
import �÷��̾�.�����;
import �÷��̾�.�ذ�;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ����ȭ�� extends JFrame {

	private JPanel panel;
	private JPanel contentPane;
	private JButton ����ư;
	private JLabel lblNewLabel;
	private JButton �ٴٹ�ư;
	private JButton �����ư;
	private JButton ���۰��Թ�ư;
	private JLabel lbl;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		����ȭ�� frame = new ����ȭ��();
		//����ȭ�� frame = new ����ȭ��(����,  ����, �� ,����� ,  �ذ�);
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
//	MainŬ������  main�޼ҵ忡�� ����� ������ �������� �ʹٸ�,  ���ڷ� ������ �޾ƾ��ؿ�
	public ����ȭ��(���� ����, ���� ����, �� ��,����� �����, �ذ� �ذ�) {
		//�����=Main.class.getDeclaredFields(�����);//getDeclaredFields:�����Ŭ�������� ����� ��� �ʵ带 �������� ��
		
		this();
		
	
		//this.setVisible(true);
		����ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MyWin_battle_��(�����,����);
				
				
			}
		});
		
		�ٴٹ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MyWin_battle_�ٴ�(�����,����);
			}
		});
		
		�����ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MyWin_battle_����(�����,�ذ�);
			}
		});
		
		���۰��Թ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=(int)(Math.random()*3);
				if(r==0) {//3����1 Ȯ���� �� ����
					new MyWin_battle_���۰���_��(�����,��);
				}
				else
					new MyWin_battle_���۰���(�����);
			}
		});
		
	}

	public ����ȭ��() {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 40, 1231, 589);
		
		this.setTitle("���������������� ȭ�� �Դϴ٢�����������");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBounds(17, 15, 1175, 503);
		setContentPane(contentPane);
		
//		panel = new JPanel();
//		panel.setBackground(Color.ORANGE);
//		panel.setBounds(17, 15, 1175, 503);
//		contentPane.add(panel);
//		panel.setLayout(null);
		
		����ư = new JButton("\uC232");
		
		����ư.setFont(new Font("�޸ո���ü", Font.BOLD, 22));
		����ư.setBounds(110, 388, 172, 85);
		contentPane.add(����ư);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("�޸ո���ü", Font.BOLD, 22));
		lblNewLabel.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uC96C\uB2C8\uBC84\uB85C\uACE0.png")));
		lblNewLabel.setBounds(260, 15, 617, 99);
		contentPane.add(lblNewLabel);
		
		�ٴٹ�ư = new JButton("\uBC14\uB2E4");
		�ٴٹ�ư.setFont(new Font("�޸ո���ü", Font.BOLD, 22));
		�ٴٹ�ư.setBounds(616, 388, 172, 85);
		contentPane.add(�ٴٹ�ư);
		
		�����ư = new JButton("\uAD11\uC0B0");
		
		�����ư.setFont(new Font("�޸ո���ü", Font.BOLD, 22));
		�����ư.setBounds(364, 388, 172, 85);
		contentPane.add(�����ư);
		
		���۰��Թ�ư = new JButton("\uAD6C\uBA4D\uAC00\uAC8C");
		���۰��Թ�ư.setFont(new Font("�޸ո���ü", Font.BOLD, 22));
		���۰��Թ�ư.setBounds(880, 388, 172, 85);
		contentPane.add(���۰��Թ�ư);
		
		lbl = new JLabel("\uAC00\uACE0 \uC2F6\uC740 \uC7A5\uC18C\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		lbl.setFont(new Font("�޸ո���ü", Font.PLAIN, 35));
		lbl.setBounds(390, 212, 539, 119);
		contentPane.add(lbl);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uC2DC\uB098\uBAA8\uB864.png")));
		lblNewLabel_1.setBounds(0, 0, 742, 533);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uBB34\uC9C0\uAC1C.png")));
		lblNewLabel_2.setBounds(709, 0, 500, 533);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uD558\uD22C.png")));
		lblNewLabel_3.setBounds(135, 92, 978, 140);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uC720\uB2C8\uCF58.png")));
		lblNewLabel_4.setBounds(740, 223, 743, 310);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(����ȭ��.class.getResource("/\uC774\uBBF8\uC9C0/\uB098\uBE44.png")));
		lblNewLabel_5.setBounds(772, 0, 437, 284);
		contentPane.add(lblNewLabel_5);
		setVisible(true);
	}
}
