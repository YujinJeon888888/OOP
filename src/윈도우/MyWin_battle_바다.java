package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 플레이어.Player;
import 플레이어.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;



public class MyWin_battle_바다 extends JFrame {
	public 요술이 p1;
	public 문어 p2;
	private JPanel contentPane;
	private JPanel panel1;
	private JLabel label1;
	private JButton button1;
	private JProgressBar bar1;
	private JPanel panel2;
	private JLabel label2;
	private JButton button2;
	private JProgressBar bar2;
	private static JTextArea ta;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	
	public static JTextArea getTa() {
		return ta;
	}
	public static void setTa(JTextArea ta) {
		MyWin_battle_바다.ta = ta;
	}
	
	public MyWin_battle_바다(요술이 p1,문어 p2) {
		this();
		this.p1=p1;//가져야하니까 객체만들어서 연결. 클래스자체가 가진것이 아니기 때문(extends가 아니니까)
		this.p2=p2;//연결했으니 이제 이 클래스에서 어디서나 p2.으로 접근 가능
		
		p1.setHp(100);
		p2.setHp(300);
		bar1.setMaximum(p1.getHp());
		bar2.setMaximum(p2.getHp());
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());
		this.setTitle(p1.이름+"\tvs\t"+p2.이름);
		this.setVisible(true);//main은 실행하는 클래스에서 불러오는거라 생성자 안에 넣는게 편함. 
		
		label1.setIcon(new ImageIcon(MyWin_battle_바다.class.getResource("/이미지/"+p1.img)));
		label2.setIcon(new ImageIcon(MyWin_battle_바다.class.getResource("/이미지/"+p2.img)));

		JOptionPane.showMessageDialog(null, p1.이름 + "와  " +p2.이름 +"   battle을 시작합니다.");
	
	}
	public void action공격하기(Player p, Player target, JProgressBar target_bar) throws InterruptedException {
		// TODO Auto-generated method stub
	
		p.공격하기(target);
		target_bar.setValue(target.getHp());
		ta.append(p.이름 + "이(가) " + target.이름 +"을(를) 공격합니다. 데미지는 "+p.get공격력()+"\n");			
		
		if(target.getHp()<=0) { 
			ta.append(p.이름 + "  Win!!!");
			JOptionPane.showMessageDialog(null,p.이름 + "  Win!!!" );
			if(p.이름=="문어"&&p1.get방어구()!=null) {//문어가 이기면
				p1.set방어력(p1.get방어력()*0.7);//방어구 내구력을 30% 깎음
				JOptionPane.showMessageDialog(null, p.이름+"이(가) 이겨 "+target.이름+"의 방어력이 30%깎였습니다!");
			}
			if(p.이름=="요술이") {//요술이가 이기면
				JOptionPane.showMessageDialog(null,p.이름 + "이(가) 최종보스를 이겼습니다! 게임 승리!!!!" );
			}	
		dispose();
		}		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWin_battle_바다 frame = new MyWin_battle_바다();
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
	public MyWin_battle_바다() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 40, 1231, 589);
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
		label1.setIcon(new ImageIcon(MyWin_battle_바다.class.getResource("/\uC774\uBBF8\uC9C0/Player.png")));
		//label1.setIcon(new ImageIcon(MyWin_battle.class.getResource("/\uC774\uBBF8\uC9C0/\uD50C\uB808\uC774\uC5B4.png")));
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setBounds(21, 25, 239, 238);
		panel1.add(label1);
		
		button1 = new JButton("\uACF5\uACA9\uD558\uAE30");
		button1.setFont(new Font("휴먼매직체", Font.PLAIN, 22));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					action공격하기(p1,p2,bar2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
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
		label2.setIcon(new ImageIcon(MyWin_battle_바다.class.getResource("/\uC774\uBBF8\uC9C0/octopus.png")));
		label2.setOpaque(true);
		label2.setBackground(Color.YELLOW);
		label2.setBounds(21, 25, 239, 238);
		panel2.add(label2);
		
		button2 = new JButton("\uACF5\uACA9\uD558\uAE30");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action공격하기(p2,p1,bar1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button2.setFont(new Font("휴먼매직체", Font.PLAIN, 22));
		button2.setBounds(76, 278, 129, 29);
		panel2.add(button2);
		
		bar2 = new JProgressBar();
		bar2.setValue(90);
		bar2.setForeground(new Color(102, 204, 255));
		bar2.setBackground(Color.LIGHT_GRAY);
		bar2.setBounds(21, 393, 239, 29);
		panel2.add(bar2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(311, 15, 580, 462);
		contentPane.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyWin_battle_바다.class.getResource("/\uC774\uBBF8\uC9C0/\uBC14\uB2E4.png")));
		lblNewLabel.setBounds(0, 0, 1209, 533);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
}
