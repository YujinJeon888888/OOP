package ������;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import �÷��̾�.Player;
import �÷��̾�.����;
import �÷��̾�.�����;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class MyWin_battle_�� extends JFrame {
	public ����� p1;
	public ���� p2;

	private JPanel contentPane;
	private JPanel panel1;
	private JLabel label1;
	private JButton button1;
	private JProgressBar bar1;
	private JPanel panel2;
	private JLabel label2;
	private JProgressBar bar2;
	private static JTextArea ta;//static
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	Thread t;

	
	public static JTextArea getTa() {
		return ta;
	}

	public static void setTa(JTextArea ta) {
		MyWin_battle_��.ta = ta;
	}

	/**
	 * Launch the application.
	 */
	public MyWin_battle_��(����� p1,���� p2) {//���ڷ� �ް�
		this();
		this.p1=p1;//�������ϴϱ� ��ü���� ����. Ŭ������ü�� �������� �ƴϱ� ����(extends�� �ƴϴϱ�)
		this.p2=p2;//���������� ���� �� Ŭ�������� ��𼭳� p2.���� ���� ����
		
		p1.setCount(0);
		p2.setCount(0);
		bar1.setMaximum(3);
		bar2.setMaximum(3);
		bar1.setValue(0);
		bar2.setValue(0);

		this.setTitle(p1.�̸�+"\tvs\t"+p2.�̸�);
		this.setVisible(true);//main�� �����ϴ� Ŭ�������� �ҷ����°Ŷ� ������ �ȿ� �ִ°� ����. 

		System.out.println(p1.img); 
		System.out.println(p2.img); 
		label1.setIcon(new ImageIcon(MyWin_battle_��.class.getResource("/�̹���/"+p1.img)));
		label2.setIcon(new ImageIcon(MyWin_battle_��.class.getResource("/�̹���/"+p2.img)));

		
		

	}

	public void actionŸ��ġ��( ) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//�̰� view���� �ߴ°�
		JOptionPane.showMessageDialog(null, "Ÿ�ڹ�Ʋ�� �����մϴ�.! ���� ���̴� ������ �ܿ��� �Ȱ��� ������...~");
		p2.Ÿ��ġ��();//������ ������
		
		//������ ������ ������ view���� ��
		JOptionPane.showMessageDialog(null, p2.s[p2.r]);
		
		//�ֿܼ��� �Է¹����� �ϴ�(Scanner) ta���� �Է¹޴°� �ȵż� ����
		//p1.Ÿ��ġ��();//����̴� �Է��� ��.(�޼ҵ�: �ֿܼ��� �Է�), view������ ta�� �Է� 

	}



	public static void main(String[] args) {

		MyWin_battle_�� frame = new MyWin_battle_��();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MyWin_battle_��() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40,40, 1231, 589);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
		panel1.setBounds(17, 15, 277, 462);
		contentPane.add(panel1);
		panel1.setLayout(null);

		label1 = new JLabel("New label");
		label1.setIcon(new ImageIcon(MyWin_battle_��.class.getResource("/\uC774\uBBF8\uC9C0/Player.png")));
		//label1.setIcon(new ImageIcon(MyWin_battle.class.getResource("/\uC774\uBBF8\uC9C0/\uD50C\uB808\uC774\uC5B4.png")));
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setBounds(21, 25, 239, 238);
		panel1.add(label1);

		button1 = new JButton("\uC2DC\uC791\uD558\uAE30");

		button1.addActionListener(new ActionListener() {//��������.���� �ȵʹ���
			public void actionPerformed(ActionEvent arg0) {
	            t = new Thread(new Timebar(12));
	               t.start();
	               
	            try {
	               actionŸ��ġ��( );
	            } catch (InterruptedException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	            }
	            //�������� �̱� �� ����
	            if(p1.getCount()>=3) { //����̰� �̱��
	               ta.append(p1.�̸� + "  Win!!!");
	               JOptionPane.showMessageDialog(null,p1.�̸� + "  Win!!!" );
	               p1.set���ָӴ�(p1.get���ָӴ�()+100000);
	               JOptionPane.showMessageDialog(null,"�������� ��Ʋ���� �̰� 100,000���� ������ϴ�! ��ȣ!" );
	               dispose();
	            }
	            if(p2.getCount()>=3) {//������ �̱�� 
	               ta.append(p2.�̸� + "  Win!!!");
	               JOptionPane.showMessageDialog(null,p2.�̸� + "  Win!!!" );
	               if(p1.get��()!=null) {
	                  p1.set��(null);
	                  JOptionPane.showMessageDialog(null, "������ �ٶ��� �Ҿ� ������� ������ �����ϴ�! ������� ������ ���ư� ���������ϴ�!" );
	               }
	               dispose();
	            }
	         }
	      });
	
		button1.setFont(new Font("�޸ո���ü", Font.PLAIN, 22));

		button1.setBounds(76, 278, 129, 29);
		panel1.add(button1);

		bar1 = new JProgressBar();
		bar1.setBackground(Color.LIGHT_GRAY);
		bar1.setForeground(Color.GREEN);
		bar1.setValue(90);
		bar1.setBounds(21, 393, 239, 29);
		panel1.add(bar1);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.ORANGE);
		panel2.setBounds(915, 15, 277, 462);
		contentPane.add(panel2);

		label2 = new JLabel("New label");
		label2.setIcon(new ImageIcon(MyWin_battle_��.class.getResource("/\uC774\uBBF8\uC9C0/cloud.png")));
		label2.setOpaque(true);
		label2.setBackground(Color.YELLOW);
		label2.setBounds(21, 25, 239, 238);
		panel2.add(label2);

		bar2 = new JProgressBar();
		bar2.setValue(90);
		bar2.setForeground(new Color(153, 255, 51));
		bar2.setBackground(Color.LIGHT_GRAY);
		bar2.setBounds(21, 393, 239, 29);
		panel2.add(bar2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(311, 15, 580, 300);
		contentPane.add(scrollPane);

		ta = new JTextArea();
		scrollPane.setViewportView(ta);

		btnNewButton = new JButton("\uC815\uB2F5\uCCB4\uD06C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(t.getState()==Thread.State.TERMINATED) {//TERMINATED: �����
		               JOptionPane.showMessageDialog(null, "�ð��� �ʰ��Ǿ� Ż���Դϴ�!");
		               return;//ȣ��ε��ư�
		            }
				
				if (p1.����üũ(p2)==1&&p2.����üũ(p1)==1)//����̰������� 
				{
					JOptionPane.showMessageDialog(null, "�¾ҽ��ϴ�!"); 
					bar1.setValue(p1.getCount());
				}
				else if(p1.����üũ(p2)==2&&p2.����üũ(p1)==2)//�����̰�������
				{
					JOptionPane.showMessageDialog(null, "Ʋ�Ƚ��ϴ�!");
					bar2.setValue(p2.getCount());
				}

			}
		});
		btnNewButton.setFont(new Font("�޸ո���ü", Font.PLAIN, 30));
		btnNewButton.setBounds(311, 330, 580, 42);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyWin_battle_��.class.getResource("/\uC774\uBBF8\uC9C0/\uC232.png")));
		lblNewLabel.setBounds(0, 0, 1209, 533);
		contentPane.add(lblNewLabel);

		setVisible(true);
	}
}
