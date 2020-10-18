package Kättöliittymät;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Versiotiedot {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	protected Object setVisible;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Versiotiedot window = new Versiotiedot();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Versiotiedot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("JUOMA-AUTOMAATTI V.1.0");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel.setBounds(126, 112, 231, 13);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tekijä: Emil Brummer");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		lblNewLabel_1.setBounds(126, 148, 231, 28);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}

}
