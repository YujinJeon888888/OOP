package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Main;
import 플레이어.구름;
import 플레이어.문어;
import 플레이어.슈;
import 플레이어.요술이;
import 플레이어.해골;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메인화면 extends JFrame {

	private JPanel panel;
	private JPanel contentPane;
	private JButton 숲버튼;
	private JLabel lblNewLabel;
	private JButton 바다버튼;
	private JButton 광산버튼;
	private JButton 구멍가게버튼;
	private JLabel lbl;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		메인화면 frame = new 메인화면();
		//메인화면 frame = new 메인화면(구름,  문어, 슈 ,요술이 ,  해골);
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
//	Main클래스의  main메소드에서 선언된 변수를 가져오고 싶다면,  인자로 전달을 받아야해요
	public 메인화면(구름 구름, 문어 문어, 슈 슈,요술이 요술이, 해골 해골) {
		//요술이=Main.class.getDeclaredFields(요술이);//getDeclaredFields:요술이클래스에서 선언된 모든 필드를 가져오는 것
		
		this();
		
	
		//this.setVisible(true);
		숲버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MyWin_battle_숲(요술이,구름);
				
				
			}
		});
		
		바다버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MyWin_battle_바다(요술이,문어);
			}
		});
		
		광산버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new MyWin_battle_광산(요술이,해골);
			}
		});
		
		구멍가게버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=(int)(Math.random()*3);
				if(r==0) {//3분의1 확률로 슈 등장
					new MyWin_battle_구멍가게_슈(요술이,슈);
				}
				else
					new MyWin_battle_구멍가게(요술이);
			}
		});
		
	}

	public 메인화면() {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 40, 1231, 589);
		
		this.setTitle("♡♥♡♥♡♥메인 화면 입니다♥♡♥♡♥♡");
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
		
		숲버튼 = new JButton("\uC232");
		
		숲버튼.setFont(new Font("휴먼매직체", Font.BOLD, 22));
		숲버튼.setBounds(110, 388, 172, 85);
		contentPane.add(숲버튼);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 22));
		lblNewLabel.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uC96C\uB2C8\uBC84\uB85C\uACE0.png")));
		lblNewLabel.setBounds(260, 15, 617, 99);
		contentPane.add(lblNewLabel);
		
		바다버튼 = new JButton("\uBC14\uB2E4");
		바다버튼.setFont(new Font("휴먼매직체", Font.BOLD, 22));
		바다버튼.setBounds(616, 388, 172, 85);
		contentPane.add(바다버튼);
		
		광산버튼 = new JButton("\uAD11\uC0B0");
		
		광산버튼.setFont(new Font("휴먼매직체", Font.BOLD, 22));
		광산버튼.setBounds(364, 388, 172, 85);
		contentPane.add(광산버튼);
		
		구멍가게버튼 = new JButton("\uAD6C\uBA4D\uAC00\uAC8C");
		구멍가게버튼.setFont(new Font("휴먼매직체", Font.BOLD, 22));
		구멍가게버튼.setBounds(880, 388, 172, 85);
		contentPane.add(구멍가게버튼);
		
		lbl = new JLabel("\uAC00\uACE0 \uC2F6\uC740 \uC7A5\uC18C\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		lbl.setFont(new Font("휴먼매직체", Font.PLAIN, 35));
		lbl.setBounds(390, 212, 539, 119);
		contentPane.add(lbl);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uC2DC\uB098\uBAA8\uB864.png")));
		lblNewLabel_1.setBounds(0, 0, 742, 533);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uBB34\uC9C0\uAC1C.png")));
		lblNewLabel_2.setBounds(709, 0, 500, 533);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uD558\uD22C.png")));
		lblNewLabel_3.setBounds(135, 92, 978, 140);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uC720\uB2C8\uCF58.png")));
		lblNewLabel_4.setBounds(740, 223, 743, 310);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(메인화면.class.getResource("/\uC774\uBBF8\uC9C0/\uB098\uBE44.png")));
		lblNewLabel_5.setBounds(772, 0, 437, 284);
		contentPane.add(lblNewLabel_5);
		setVisible(true);
	}
}
