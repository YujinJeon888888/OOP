package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 플레이어.Player;
import 플레이어.구름;
import 플레이어.요술이;

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

public class MyWin_battle_숲 extends JFrame {
	public 요술이 p1;
	public 구름 p2;

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
		MyWin_battle_숲.ta = ta;
	}

	/**
	 * Launch the application.
	 */
	public MyWin_battle_숲(요술이 p1,구름 p2) {//인자로 받고
		this();
		this.p1=p1;//가져야하니까 객체만들어서 연결. 클래스자체가 가진것이 아니기 때문(extends가 아니니까)
		this.p2=p2;//연결했으니 이제 이 클래스에서 어디서나 p2.으로 접근 가능
		
		p1.setCount(0);
		p2.setCount(0);
		bar1.setMaximum(3);
		bar2.setMaximum(3);
		bar1.setValue(0);
		bar2.setValue(0);

		this.setTitle(p1.이름+"\tvs\t"+p2.이름);
		this.setVisible(true);//main은 실행하는 클래스에서 불러오는거라 생성자 안에 넣는게 편함. 

		System.out.println(p1.img); 
		System.out.println(p2.img); 
		label1.setIcon(new ImageIcon(MyWin_battle_숲.class.getResource("/이미지/"+p1.img)));
		label2.setIcon(new ImageIcon(MyWin_battle_숲.class.getResource("/이미지/"+p2.img)));

		
		

	}

	public void action타자치기( ) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//이건 view에서 뜨는거
		JOptionPane.showMessageDialog(null, "타자배틀을 시작합니다.! 다음 보이는 문장을 외워서 똑같이 쓰세요...~");
		p2.타자치기();//구름이 문제냄
		
		//구름이 문제낸 문장이 view에도 뜸
		JOptionPane.showMessageDialog(null, p2.s[p2.r]);
		
		//콘솔에서 입력받으려 하니(Scanner) ta에서 입력받는게 안돼서 없앰
		//p1.타자치기();//요술이는 입력을 함.(메소드: 콘솔에서 입력), view에서는 ta에 입력 

	}



	public static void main(String[] args) {

		MyWin_battle_숲 frame = new MyWin_battle_숲();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MyWin_battle_숲() {
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
		label1.setIcon(new ImageIcon(MyWin_battle_숲.class.getResource("/\uC774\uBBF8\uC9C0/Player.png")));
		//label1.setIcon(new ImageIcon(MyWin_battle.class.getResource("/\uC774\uBBF8\uC9C0/\uD50C\uB808\uC774\uC5B4.png")));
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setBounds(21, 25, 239, 238);
		panel1.add(label1);

		button1 = new JButton("\uC2DC\uC791\uD558\uAE30");

		button1.addActionListener(new ActionListener() {//여기질문.동작 안됨문제
			public void actionPerformed(ActionEvent arg0) {
	            t = new Thread(new Timebar(12));
	               t.start();
	               
	            try {
	               action타자치기( );
	            } catch (InterruptedException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	            }
	            //누군가가 이길 때 동작
	            if(p1.getCount()>=3) { //요술이가 이기면
	               ta.append(p1.이름 + "  Win!!!");
	               JOptionPane.showMessageDialog(null,p1.이름 + "  Win!!!" );
	               p1.set돈주머니(p1.get돈주머니()+100000);
	               JOptionPane.showMessageDialog(null,"구름과의 배틀에서 이겨 100,000원을 얻었습니다! 야호!" );
	               dispose();
	            }
	            if(p2.getCount()>=3) {//구름이 이기면 
	               ta.append(p2.이름 + "  Win!!!");
	               JOptionPane.showMessageDialog(null,p2.이름 + "  Win!!!" );
	               if(p1.get방어구()!=null) {
	                  p1.set방어구(null);
	                  JOptionPane.showMessageDialog(null, "구름이 바람을 불어 요술이의 갑옷을 날립니다! 요술이의 갑옷은 날아가 없어졌습니다!" );
	               }
	               dispose();
	            }
	         }
	      });
	
		button1.setFont(new Font("휴먼매직체", Font.PLAIN, 22));

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
		label2.setIcon(new ImageIcon(MyWin_battle_숲.class.getResource("/\uC774\uBBF8\uC9C0/cloud.png")));
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

				if(t.getState()==Thread.State.TERMINATED) {//TERMINATED: 종료됨
		               JOptionPane.showMessageDialog(null, "시간이 초과되어 탈락입니다!");
		               return;//호출로돌아감
		            }
				
				if (p1.정답체크(p2)==1&&p2.정답체크(p1)==1)//요술이가맞으면 
				{
					JOptionPane.showMessageDialog(null, "맞았습니다!"); 
					bar1.setValue(p1.getCount());
				}
				else if(p1.정답체크(p2)==2&&p2.정답체크(p1)==2)//구름이가맞으면
				{
					JOptionPane.showMessageDialog(null, "틀렸습니다!");
					bar2.setValue(p2.getCount());
				}

			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		btnNewButton.setBounds(311, 330, 580, 42);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyWin_battle_숲.class.getResource("/\uC774\uBBF8\uC9C0/\uC232.png")));
		lblNewLabel.setBounds(0, 0, 1209, 533);
		contentPane.add(lblNewLabel);

		setVisible(true);
	}
}
