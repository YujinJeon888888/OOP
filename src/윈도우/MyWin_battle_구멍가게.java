package ������;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ����.�վ��;
import ��.����;
import �÷��̾�.�����;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWin_battle_���۰��� extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton ö���ʹ�ư;
	private JButton ���̾ư��ʹ�ư;
	private JButton �������ʹ�ư;
	private JButton ���̾ƶվ�͹�ư;
	private JButton ö�վ�͹�ư;
	private JButton �����վ�͹�ư;
	private JLabel ���۰��԰��Ƕ�;
	private JLabel �̹�����;
	private JLabel �ȳ�����;
	private ����� p1;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWin_battle_���۰��� frame = new MyWin_battle_���۰���();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyWin_battle_���۰���() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 40, 1231, 589);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 1209, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("\uB098\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("�޸ո���ü", Font.PLAIN, 19));
		btnNewButton.setBounds(925, 70, 129, 38);
		panel.add(btnNewButton);

		lblNewLabel = new JLabel("\uAC00\uACA9: 30,000\uC6D0, \uACF5\uACA9\uB825: +10");
		lblNewLabel.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		lblNewLabel.setBounds(568, 222, 211, 96);
		panel.add(lblNewLabel);
		this.setTitle("���������������� �Դϴ٢�����������");
		ö���ʹ�ư = new JButton("\uCCA0 \uAC11\uC637");
		ö���ʹ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ʱ����ϱ�(new ����(20,100000,"ö ����"));//�����ϱ� newö�������� �ߴ� �� �������� �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		ö���ʹ�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 25));
		ö���ʹ�ư.setBackground(Color.LIGHT_GRAY);
		ö���ʹ�ư.setBounds(808, 369, 157, 91);
		panel.add(ö���ʹ�ư);

		���̾ư��ʹ�ư = new JButton("\uB2E4\uC774\uC544 \uAC11\uC637");
		���̾ư��ʹ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ʱ����ϱ�(new ����(80,200000,"���̾� ����"));//�����ϱ� new���̾ư������� �ߴ� �� �������� �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		���̾ư��ʹ�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 25));
		���̾ư��ʹ�ư.setBackground(Color.LIGHT_GRAY);
		���̾ư��ʹ�ư.setBounds(1015, 369, 157, 91);
		panel.add(���̾ư��ʹ�ư);

		�������ʹ�ư = new JButton("\uB098\uBB34 \uAC11\uC637");
		�������ʹ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ʱ����ϱ�(new ����(10,30000,"���� ����"));//�����ϱ� new������������ �ߴ� �� �������� �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		�������ʹ�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 25));
		�������ʹ�ư.setBackground(Color.LIGHT_GRAY);
		�������ʹ�ư.setBounds(595, 369, 157, 91);
		panel.add(�������ʹ�ư);

		���̾ƶվ�͹�ư = new JButton("\uB2E4\uC774\uC544 \r\n\uB6AB\uC5B4\uBF55");
		���̾ƶվ�͹�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ⱸ���ϱ�(new �վ��(80,200000,"���̾� �վ��"));//�����ϱ� new���̾ƶվ������ �ߴ� �� �վ������ �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		���̾ƶվ�͹�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 20));
		���̾ƶվ�͹�ư.setBackground(Color.LIGHT_GRAY);
		���̾ƶվ�͹�ư.setBounds(1015, 138, 157, 91);
		panel.add(���̾ƶվ�͹�ư);

		ö�վ�͹�ư = new JButton("\uCCA0 \uB6AB\uC5B4\uBF55");
		ö�վ�͹�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���ⱸ���ϱ�(new �վ��(20,100000,"ö �վ��"));//�����ϱ� newö�վ������ �ߴ� �� �վ������ �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		ö�վ�͹�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 25));
		ö�վ�͹�ư.setBackground(Color.LIGHT_GRAY);
		ö�վ�͹�ư.setBounds(808, 136, 157, 91);
		panel.add(ö�վ�͹�ư);

		�����վ�͹�ư = new JButton("\uB098\uBB34 \uB6AB\uC5B4\uBF55");
		�����վ�͹�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				���ⱸ���ϱ�(new �վ��(10,30000,"���� �վ��"));//�����ϱ� new�����վ������ �ߴ� �� �վ������ �ٲ�(����� ������ ���� Ŭ������ ����)
			}
		});
		�����վ�͹�ư.setBackground(Color.LIGHT_GRAY);
		�����վ�͹�ư.setFont(new Font("�޸ո���ü", Font.PLAIN, 25));
		�����վ�͹�ư.setBounds(595, 136, 157, 91);
		panel.add(�����վ�͹�ư);

		���۰��԰��Ƕ� = new JLabel("   \uAD6C\uBA4D\uAC00\uAC8C");
		���۰��԰��Ƕ�.setFont(new Font("�޸ո���ü", Font.PLAIN, 30));
		���۰��԰��Ƕ�.setBackground(Color.GREEN);
		���۰��԰��Ƕ�.setOpaque(true);
		���۰��԰��Ƕ�.setBounds(161, 57, 176, 106);
		panel.add(���۰��԰��Ƕ�);

		�̹����� = new JLabel("\r\n");
		�̹�����.setFont(new Font("�޸ո���ü", Font.PLAIN, 30));
		�̹�����.setBackground(Color.YELLOW);
		�̹�����.setIcon(new ImageIcon(MyWin_battle_���۰���.class.getResource("/\uC774\uBBF8\uC9C0/\uC0C1\uC810.png")));
		�̹�����.setBounds(0, 0, 479, 533);
		panel.add(�̹�����);

		�ȳ����� = new JLabel("\uAD6C\uC785\uD560 \uD56D\uBAA9\uC744 \uC120\uD0DD\uD558\uC138\uC694!");
		�ȳ�����.setFont(new Font("�޸ո���ü", Font.PLAIN, 30));
		�ȳ�����.setBounds(570, 57, 411, 64);
		panel.add(�ȳ�����);

		label = new JLabel("\uAC00\uACA9: 100,000\uC6D0, \uACF5\uACA9\uB825: +20");
		label.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		label.setBounds(787, 222, 211, 96);
		panel.add(label);

		label_1 = new JLabel("\uAC00\uACA9: 200,000\uC6D0, \uACF5\uACA9\uB825: +80");
		label_1.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		label_1.setBounds(998, 222, 211, 96);
		panel.add(label_1);

		label_2 = new JLabel("\uAC00\uACA9: 30,000\uC6D0, \uBC29\uC5B4\uB825: +10");
		label_2.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		label_2.setBounds(570, 437, 211, 96);
		panel.add(label_2);

		label_3 = new JLabel("\uAC00\uACA9: 100,000\uC6D0, \uBC29\uC5B4\uB825: +20");
		label_3.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		label_3.setBounds(787, 437, 211, 96);
		panel.add(label_3);

		label_4 = new JLabel("\uAC00\uACA9: 200,000\uC6D0, \uBC29\uC5B4\uB825: +80");
		label_4.setFont(new Font("�޸ո���ü", Font.PLAIN, 16));
		label_4.setBounds(998, 437, 211, 96);
		panel.add(label_4);
	}

	public MyWin_battle_���۰���(����� �����) { 
		this();
		p1=�����;
	}
	private void ���ʱ����ϱ�(���� ����) {//�Ű�����Ÿ��: ����  //Ŭ�����̸��� �ٸ��� ����� ���Ҵ� Ŭ������ �����, ����Ŭ������ ����, �̸�, ���¸� �ٸ��� ������.
		// TODO Auto-generated method stub
		if(p1.get���ָӴ�()>=����.get����()) {
			if(����.get����()==30000) JOptionPane.showMessageDialog(null, "���� ������ �����߽��ϴ�.");//�������� � �������� ����
			else if(����.get����()==100000) JOptionPane.showMessageDialog(null, "ö ������ �����߽��ϴ�.");
			else if(����.get����()==200000) JOptionPane.showMessageDialog(null, "���̾� ������ �����߽��ϴ�.");

			p1.set���ָӴ�(p1.get���ָӴ�()-����.get����());
			p1.set��(����);//���� �㿩�ֱ�
			p1.set����(p1.get��().get����());//������� ���� ���¸�ŭ ������� ������ ������.
		}
		else
			JOptionPane.showMessageDialog(null, "���� ���ڶ��ϴ�!");
	}
	private void ���ⱸ���ϱ�(�վ�� ����) {//�Ű�����Ÿ��: �վ��//Ŭ�����̸��� �ٸ��� ����� ���Ҵ� Ŭ������ �����, �վ��Ŭ������ ����, �̸�, ���ݷ¸� �ٸ��� ������.
		// TODO Auto-generated method stub
		if(p1.get���ָӴ�()>=����.get����()) {
			if(����.get����()==30000) JOptionPane.showMessageDialog(null, "���� �վ���� �����߽��ϴ�.");//�������� � �������� ����
			else if(����.get����()==100000) JOptionPane.showMessageDialog(null, "ö �վ���� �����߽��ϴ�.");
			else if(����.get����()==200000) JOptionPane.showMessageDialog(null, "���̾� �վ���� �����߽��ϴ�.");

			p1.set���ָӴ�(p1.get���ָӴ�()-����.get����());
			p1.setWeapon(����);//���� �㿩�ֱ�
			
		}
		else
			JOptionPane.showMessageDialog(null, "���� ���ڶ��ϴ�!");
	}
}
