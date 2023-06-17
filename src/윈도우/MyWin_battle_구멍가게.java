package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import 무기.뚫어뽕;
import 방어구.갑옷;
import 플레이어.요술이;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWin_battle_구멍가게 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton 철갑옷버튼;
	private JButton 다이아갑옷버튼;
	private JButton 나무갑옷버튼;
	private JButton 다이아뚫어뽕버튼;
	private JButton 철뚫어뽕버튼;
	private JButton 나무뚫어뽕버튼;
	private JLabel 구멍가게간판라벨;
	private JLabel 이미지라벨;
	private JLabel 안내문라벨;
	private 요술이 p1;
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
					MyWin_battle_구멍가게 frame = new MyWin_battle_구멍가게();
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
	public MyWin_battle_구멍가게() {
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
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 19));
		btnNewButton.setBounds(925, 70, 129, 38);
		panel.add(btnNewButton);

		lblNewLabel = new JLabel("\uAC00\uACA9: 30,000\uC6D0, \uACF5\uACA9\uB825: +10");
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		lblNewLabel.setBounds(568, 222, 211, 96);
		panel.add(lblNewLabel);
		this.setTitle("♡♥♡♥♡♥상점 입니다♥♡♥♡♥♡");
		철갑옷버튼 = new JButton("\uCCA0 \uAC11\uC637");
		철갑옷버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				갑옷구매하기(new 갑옷(20,100000,"철 갑옷"));//구매하기 new철갑옷으로 했던 것 갑옷으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		철갑옷버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		철갑옷버튼.setBackground(Color.LIGHT_GRAY);
		철갑옷버튼.setBounds(808, 369, 157, 91);
		panel.add(철갑옷버튼);

		다이아갑옷버튼 = new JButton("\uB2E4\uC774\uC544 \uAC11\uC637");
		다이아갑옷버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				갑옷구매하기(new 갑옷(80,200000,"다이아 갑옷"));//구매하기 new다이아갑옷으로 했던 것 갑옷으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		다이아갑옷버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		다이아갑옷버튼.setBackground(Color.LIGHT_GRAY);
		다이아갑옷버튼.setBounds(1015, 369, 157, 91);
		panel.add(다이아갑옷버튼);

		나무갑옷버튼 = new JButton("\uB098\uBB34 \uAC11\uC637");
		나무갑옷버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				갑옷구매하기(new 갑옷(10,30000,"나무 갑옷"));//구매하기 new나무갑옷으로 했던 것 갑옷으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		나무갑옷버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		나무갑옷버튼.setBackground(Color.LIGHT_GRAY);
		나무갑옷버튼.setBounds(595, 369, 157, 91);
		panel.add(나무갑옷버튼);

		다이아뚫어뽕버튼 = new JButton("\uB2E4\uC774\uC544 \r\n\uB6AB\uC5B4\uBF55");
		다이아뚫어뽕버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				무기구매하기(new 뚫어뽕(80,200000,"다이아 뚫어뽕"));//구매하기 new다이아뚫어뽕으로 했던 것 뚫어뽕으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		다이아뚫어뽕버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		다이아뚫어뽕버튼.setBackground(Color.LIGHT_GRAY);
		다이아뚫어뽕버튼.setBounds(1015, 138, 157, 91);
		panel.add(다이아뚫어뽕버튼);

		철뚫어뽕버튼 = new JButton("\uCCA0 \uB6AB\uC5B4\uBF55");
		철뚫어뽕버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				무기구매하기(new 뚫어뽕(20,100000,"철 뚫어뽕"));//구매하기 new철뚫어뽕으로 했던 것 뚫어뽕으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		철뚫어뽕버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		철뚫어뽕버튼.setBackground(Color.LIGHT_GRAY);
		철뚫어뽕버튼.setBounds(808, 136, 157, 91);
		panel.add(철뚫어뽕버튼);

		나무뚫어뽕버튼 = new JButton("\uB098\uBB34 \uB6AB\uC5B4\uBF55");
		나무뚫어뽕버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				무기구매하기(new 뚫어뽕(10,30000,"나무 뚫어뽕"));//구매하기 new나무뚫어뽕으로 했던 것 뚫어뽕으로 바꿈(상속인 이유가 없던 클래스들 삭제)
			}
		});
		나무뚫어뽕버튼.setBackground(Color.LIGHT_GRAY);
		나무뚫어뽕버튼.setFont(new Font("휴먼매직체", Font.PLAIN, 25));
		나무뚫어뽕버튼.setBounds(595, 136, 157, 91);
		panel.add(나무뚫어뽕버튼);

		구멍가게간판라벨 = new JLabel("   \uAD6C\uBA4D\uAC00\uAC8C");
		구멍가게간판라벨.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		구멍가게간판라벨.setBackground(Color.GREEN);
		구멍가게간판라벨.setOpaque(true);
		구멍가게간판라벨.setBounds(161, 57, 176, 106);
		panel.add(구멍가게간판라벨);

		이미지라벨 = new JLabel("\r\n");
		이미지라벨.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		이미지라벨.setBackground(Color.YELLOW);
		이미지라벨.setIcon(new ImageIcon(MyWin_battle_구멍가게.class.getResource("/\uC774\uBBF8\uC9C0/\uC0C1\uC810.png")));
		이미지라벨.setBounds(0, 0, 479, 533);
		panel.add(이미지라벨);

		안내문라벨 = new JLabel("\uAD6C\uC785\uD560 \uD56D\uBAA9\uC744 \uC120\uD0DD\uD558\uC138\uC694!");
		안내문라벨.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		안내문라벨.setBounds(570, 57, 411, 64);
		panel.add(안내문라벨);

		label = new JLabel("\uAC00\uACA9: 100,000\uC6D0, \uACF5\uACA9\uB825: +20");
		label.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		label.setBounds(787, 222, 211, 96);
		panel.add(label);

		label_1 = new JLabel("\uAC00\uACA9: 200,000\uC6D0, \uACF5\uACA9\uB825: +80");
		label_1.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		label_1.setBounds(998, 222, 211, 96);
		panel.add(label_1);

		label_2 = new JLabel("\uAC00\uACA9: 30,000\uC6D0, \uBC29\uC5B4\uB825: +10");
		label_2.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		label_2.setBounds(570, 437, 211, 96);
		panel.add(label_2);

		label_3 = new JLabel("\uAC00\uACA9: 100,000\uC6D0, \uBC29\uC5B4\uB825: +20");
		label_3.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		label_3.setBounds(787, 437, 211, 96);
		panel.add(label_3);

		label_4 = new JLabel("\uAC00\uACA9: 200,000\uC6D0, \uBC29\uC5B4\uB825: +80");
		label_4.setFont(new Font("휴먼매직체", Font.PLAIN, 16));
		label_4.setBounds(998, 437, 211, 96);
		panel.add(label_4);
	}

	public MyWin_battle_구멍가게(요술이 요술이) { 
		this();
		p1=요술이;
	}
	private void 갑옷구매하기(갑옷 갑옷) {//매개변수타입: 갑옷  //클래스이름만 다르고 기능은 같았던 클래스들 지우고, 갑옷클래스의 가격, 이름, 방어력만 다르게 조정함.
		// TODO Auto-generated method stub
		if(p1.get돈주머니()>=갑옷.get가격()) {
			if(갑옷.get가격()==30000) JOptionPane.showMessageDialog(null, "나무 갑옷을 구입했습니다.");//가격으로 어떤 갑옷인지 구분
			else if(갑옷.get가격()==100000) JOptionPane.showMessageDialog(null, "철 갑옷을 구입했습니다.");
			else if(갑옷.get가격()==200000) JOptionPane.showMessageDialog(null, "다이아 갑옷을 구입했습니다.");

			p1.set돈주머니(p1.get돈주머니()-갑옷.get가격());
			p1.set방어구(갑옷);//갑옷 쥐여주기
			p1.set방어력(p1.get방어구().get방어력());//요술이의 방어구의 방어력만큼 요술이의 방어력을 세팅함.
		}
		else
			JOptionPane.showMessageDialog(null, "돈이 모자랍니다!");
	}
	private void 무기구매하기(뚫어뽕 무기) {//매개변수타입: 뚫어뽕//클래스이름만 다르고 기능은 같았던 클래스들 지우고, 뚫어뽕클래스의 가격, 이름, 공격력만 다르게 조정함.
		// TODO Auto-generated method stub
		if(p1.get돈주머니()>=무기.get가격()) {
			if(무기.get가격()==30000) JOptionPane.showMessageDialog(null, "나무 뚫어뽕을 구입했습니다.");//가격으로 어떤 무기인지 구분
			else if(무기.get가격()==100000) JOptionPane.showMessageDialog(null, "철 뚫어뽕을 구입했습니다.");
			else if(무기.get가격()==200000) JOptionPane.showMessageDialog(null, "다이아 뚫어뽕을 구입했습니다.");

			p1.set돈주머니(p1.get돈주머니()-무기.get가격());
			p1.setWeapon(무기);//무기 쥐여주기
			
		}
		else
			JOptionPane.showMessageDialog(null, "돈이 모자랍니다!");
	}
}
