package Kättöliittymät;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class Lämpötilamuunnin {

	private JFrame frame;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lämpötilamuunnin window = new Lämpötilamuunnin();
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
	public Lämpötilamuunnin() {
		try {initialize();
		}
		catch (Exception e) {
            e.printStackTrace();
         
        }}
	
	
	String celsius;
	double farenheit;
	private JTextField textField;
	JButton btnNewButton;
	JLabel lblNewLabel_3;
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(50, 50, 450, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2));
		
		JLabel lblNewLabel_2 = new JLabel("Celsius");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(4);
		
		
		btnNewButton = new JButton("Convert");
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Farenheit");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() { 	
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
				celsius = textField.getText();
				
				Double Celsius = Double.parseDouble(celsius);	
				
				farenheit = (9.0/5.0) * Celsius + 32.0;
				
				String Farenheit = Double.toString(farenheit);
				
				lblNewLabel_3.setText(Farenheit);
				} catch (Exception b) {	
					
					JOptionPane.showMessageDialog(frame, "Try entering a number");
					
				}
				}
				
			});
				
		
}


}

