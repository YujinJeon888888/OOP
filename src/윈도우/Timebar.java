package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Timebar extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar bar;
	private int timeValue=0;
	private JTextField timeTF;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timebar frame = new Timebar();
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
	public Timebar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 1, 1257, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bar = new JProgressBar();
		bar.setForeground(Color.GREEN);
		bar.setMaximum(10);
		bar.setValue(10);
		bar.setBounds(1, 1, 1229, 25);
		contentPane.add(bar);
		
		timeTF = new JTextField();
		timeTF.setHorizontalAlignment(SwingConstants.CENTER);
		timeTF.setText("10");
		this.timeValue = Integer.parseInt(timeTF.getText());
		timeTF.setFont(new Font("Aladin", Font.BOLD, 50));
		timeTF.setBounds(497, 58, 212, 91);
		contentPane.add(timeTF);
		timeTF.setColumns(10);
		
		lblNewLabel = new JLabel("time");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(301, 58, 184, 91);
		contentPane.add(lblNewLabel);
		this.setVisible(true);
	}
	public Timebar(int time) {
		this();
		this.timeValue = time;
		this.bar.setMaximum(time);
		this.timeTF.setText(Integer.toString(time));
	}
	public void setTime(int value) {
		
		timeTF.setText(Integer.toString(value));		
	}
	public void setBar(int value) {
		bar.setValue(value);
	}

	public JProgressBar getBar() {
		return bar;
	}

	public void setBar(JProgressBar bar) {
		this.bar = bar;
	}

	public int getTimeValue() {
		return timeValue;
	}

	public void setTimeValue(int timeValue) {
		this.timeValue = timeValue;
	}

	public String getTimeTF() {
		return timeTF.getText();
	}

	public void setTimeTF(String time) {
		this.timeTF.setText(time);;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sec= this.timeValue;
		while(true) {
			if(sec<=0) 	break;
			
			sec-=1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setTimeTF(Integer.toString(sec));
			this.setBar(sec);
		}
		JOptionPane.showMessageDialog(null, "시간초과!");
		dispose();  //창 닫기
	}

}
