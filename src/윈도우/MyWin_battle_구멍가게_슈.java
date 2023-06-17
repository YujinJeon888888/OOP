package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 플레이어.Player;
import 플레이어.슈;
import 플레이어.요술이;

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

public class MyWin_battle_구멍가게_슈 extends JFrame {
	public 요술이 p1;
	public 슈 p2;
	
	private JPanel contentPane;
	private JPanel panel1;
	private JLabel label1;
	private JButton button1;
	private JProgressBar bar1;
	private JPanel panel2;
	private JLabel label2;
	private JButton button2;
	private JProgressBar bar2;
	private JTextArea ta;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public MyWin_battle_구멍가게_슈(요술이 p1,슈 p2) {
		this();
		this.p1=p1;//가져야하니까 객체만들어서 연결. 클래스자체가 가진것이 아니기 때문(extends가 아니니까)
		this.p2=p2;
		
		p1.setHp(100);
		p2.setHp(100);
		bar1.setMaximum(p1.getHp());
		bar2.setMaximum(p2.getHp());
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());
		this.setTitle(p1.이름+"\tvs\t"+p2.이름);
		this.setVisible(true);//main은 실행하는 클래스에서 불러오는거라 생성자 안에 넣는게 편함. 
		
		label1.setIcon(new ImageIcon(MyWin_battle_구멍가게_슈.class.getResource("/이미지/"+p1.img)));
		label2.setIcon(new ImageIcon(MyWin_battle_구멍가게_슈.class.getResource("/이미지/"+p2.img)));
		JOptionPane.showMessageDialog(null, "상점에 갑자기 슈가 나타났습니다! 슈가 라면끓이기를 시킵니다.");
		JOptionPane.showMessageDialog(null, p1.이름 + "와  " +p2.이름 +"   battle을 시작합니다.");
		int r=(int)(Math.random()*2);
		if(r==0) //슈랑은 데미지랑 hp가 똑같아서 선제공격권을 정했음. 다른 건 안 정함
			JOptionPane.showMessageDialog(null, "선제공격권은 "+p1.이름+"에게 있습니다.");
		else if(r==1)
			JOptionPane.showMessageDialog(null, "선제공격권은 "+p2.이름+"에게 있습니다.");
	}
	public void action공격하기_요술이가(요술이 p, 슈 target, JProgressBar target_bar) throws InterruptedException {
		// TODO Auto-generated method stub
		p.라면끓이기(target);
		target_bar.setValue(target.getHp()-p.getHands());
		ta.append(p.이름 + "이(가) 라면을" +p.getHands() +"개 끓입니다. 데미지는 "+p.getHands()+"\n");		
		
		
		if(target.getHp()<=0) { 
			
			ta.append(p.이름 + "  Win!!!");
			JOptionPane.showMessageDialog(null,p.이름 + "  Win!!!"+ target.이름+"에게 간신히 이겼습니다." );
			p1.set돈주머니(p1.get돈주머니()+5000);
			JOptionPane.showMessageDialog(null,"악독한"+target.이름+"이(가) 꼴랑 5,000원을 줍니다. 그래도 받아서 다행이네요 ^^" );
			dispose();
		}		
	}
	public void action공격하기_슈가(슈 p, 요술이 target, JProgressBar target_bar) throws InterruptedException {
		// TODO Auto-generated method stub
		p.라면끓이기(target);
		target_bar.setValue(target.getHp()-p.getHands());
		ta.append(p.이름 + "이(가) 라면을" +p.getHands() +"개 끓입니다. 데미지는 "+p.getHands()+"\n");		
		
		if(target.getHp()<=0) { 
			ta.append(p.이름 + "  Win!!!");
			JOptionPane.showMessageDialog(null,p.이름 + "  Win!!!" );
			target.set돈주머니(target.get돈주머니()-30000);
			JOptionPane.showMessageDialog(null, "악독한 "+p.이름+"이(가) 피해보상금 30,000원을 요구합니다. 현재 돈주머니에는 "+target.get돈주머니()+"원이 남았습니다 ㅠㅠ" );
			dispose();
		}		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWin_battle_구멍가게_슈 frame = new MyWin_battle_구멍가게_슈();
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
	public MyWin_battle_구멍가게_슈() {
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
		label1.setIcon(new ImageIcon(MyWin_battle_구멍가게_슈.class.getResource("/\uC774\uBBF8\uC9C0/Player.png")));
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
					action공격하기_요술이가( p1, p2, bar2);
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
		label2.setIcon(new ImageIcon(MyWin_battle_구멍가게_슈.class.getResource("/\uC774\uBBF8\uC9C0/sue.png")));
		label2.setOpaque(true);
		label2.setBackground(Color.YELLOW);
		label2.setBounds(21, 25, 239, 238);
		panel2.add(label2);
		
		button2 = new JButton("\uACF5\uACA9\uD558\uAE30");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					action공격하기_슈가( p2, p1, bar1);
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
		bar2.setForeground(Color.PINK);
		bar2.setValue(90);
		bar2.setBackground(Color.LIGHT_GRAY);
		bar2.setBackground(Color.LIGHT_GRAY);
		bar2.setBounds(21, 393, 239, 29);
		panel2.add(bar2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(311, 15, 580, 462);
		contentPane.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyWin_battle_구멍가게_슈.class.getResource("/\uC774\uBBF8\uC9C0/\uC0C1\uC810.png")));
		lblNewLabel.setBounds(0, 0, 1209, 533);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}
}
