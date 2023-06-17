package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import 플레이어.Player;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MyWin extends JFrame {

	private JPanel contentPane;
	private JLabel Label1;
	private JButton button1;
	private JProgressBar bar1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWin frame = new MyWin();
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
	
	
	public MyWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label1 = new JLabel("New label");
		Label1.setIcon(new ImageIcon("C:\\Users\\\uC804\uBB38\uACBD\\Desktop\\\uC2A4\uD53C\uB9BF\uD398\uC5B4\uB7EC\uC0AC\uC9C4\\\uC77C\uCD9C.png"));
		Label1.setBounds(17, 5, 353, 159);
		contentPane.add(Label1);
		
		button1 = new JButton("\uB0A0 \uB20C\uB7EC\uBD10");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌렸음!");
				bar1.setValue(bar1.getValue()-10);
				if(bar1.getValue()==0) {
					bar1.setValue(100);
				}
			}
		});
		button1.setBounds(27, 176, 331, 83);
		contentPane.add(button1);
		
		bar1 = new JProgressBar();
		bar1.setBackground(Color.DARK_GRAY);
		bar1.setForeground(Color.RED);
		bar1.setValue(100);
		bar1.setBounds(27, 274, 331, 57);
		contentPane.add(bar1);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		textArea.setBounds(510, 70, 271, 261);
		contentPane.add(textArea);
	}
}
