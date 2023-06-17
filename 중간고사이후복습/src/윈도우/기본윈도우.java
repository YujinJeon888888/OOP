package 윈도우;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class 기본윈도우 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					기본윈도우 frame = new 기본윈도우();
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
	public 기본윈도우() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(17, 15, 247, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("\uC720\uC8001");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 247, 360);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(56, 375, 129, 29);
		panel.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(30);
		progressBar.setMaximum(70);
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(0, 450, 247, 50);
		panel.add(progressBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(292, 15, 287, 359);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(638, 15, 247, 543);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\uC720\uC8002");
		label.setOpaque(true);
		label.setBackground(Color.PINK);
		label.setBounds(0, 0, 247, 360);
		panel_1.add(label);
		
		JButton button = new JButton("New button");
		button.setBounds(56, 375, 129, 29);
		panel_1.add(button);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(30);
		progressBar_1.setMaximum(70);
		progressBar_1.setForeground(Color.GREEN);
		progressBar_1.setBounds(0, 450, 247, 50);
		panel_1.add(progressBar_1);
	}
}
