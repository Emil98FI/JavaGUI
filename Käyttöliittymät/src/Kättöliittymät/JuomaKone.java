package Kättöliittymät;

import java.awt.EventQueue;



import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;



public class JuomaKone {

	private JFrame frame;
	private JButton CoffeBtn;
	private JButton TeeBtn;
	private JButton HcBtn;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel Kahvilkm;
	private JLabel Teelkm;
	private JLabel Chocolkm;
	private JMenu mnNewMenu;
	private JMenuItem UusiKahvi;
	private JMenuItem UusiTee;
	private JMenuItem UusiKaakao;
	private JMenuItem TallennaTiedot;
	private JMenuItem LataaTiedot;
	private JMenuItem Quit;
	private JMenuBar menuBar_1;
	private JMenu mnNewMenu_1;
	private JMenuItem VersioTiedot;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuomaKone window = new JuomaKone();
					window.frame.setVisible(true);
					
					
			
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public JuomaKone() throws FileNotFoundException {
		initialize();
		
		JuomaAutomaatti JuomaLaite = new JuomaAutomaatti();
		
		
		
			Versiotiedot window = new Versiotiedot();
			
		
		
		
		
		try {
			JuomaLaite.lueTiedostostaKaakao();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		LataaTiedot.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				try {
					JuomaLaite.lueTiedostostaKaakao();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				int Tee = JuomaLaite.getTee();
				
				Teelkm.setText(Integer.toString(Tee));
				
				int Kahvi = JuomaLaite.getKahvi();
				
				Kahvilkm.setText(Integer.toString(Kahvi));
				
				int Kaakao = JuomaLaite.getKaakao();
				
				Chocolkm.setText(Integer.toString(Kaakao));
				
			}
		});
		
		
		
		
		
		CoffeBtn.addActionListener((ActionListener) new ActionListener() { 	
			public void actionPerformed(ActionEvent e) {
				
				
				JuomaLaite.valmistaKahvi();
				
				
				
				int Kahvi = JuomaLaite.getKahvi();
				
				String SKahvi = Integer.toString(Kahvi);
				
				Kahvilkm.setText(SKahvi);
				
				
				if (Kahvi <= 20) {
					
					Kahvilkm.setForeground(Color.RED);
					
				}
				
			try {
				Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
				
			
			}
		});
		
		///////////////
		
		TeeBtn.addActionListener((ActionListener) new ActionListener() { 	
			public void actionPerformed(ActionEvent e) {
				
				
				JuomaLaite.valmistaTee();
				
				
				
				int Tee = JuomaLaite.getTee();
				
				String STee = Integer.toString(Tee);
				
				Teelkm.setText(STee);
				
				if (Tee <= 20) {
					
					Teelkm.setForeground(Color.RED);
					
				}
				
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
	
		
		/////////////
		
		HcBtn.addActionListener((ActionListener) new ActionListener() { 	
			public void actionPerformed(ActionEvent e) {
				
				
				JuomaLaite.valmistaKaakao();
				
				int Kaakao = JuomaLaite.getKaakao();
				
				String SKaakao = Integer.toString(Kaakao);
				
				Chocolkm.setText(SKaakao);
				
				if (Kaakao <= 20) {
					
					Chocolkm.setForeground(Color.RED);
					
				}
				
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	
			}
		});
		/////////////
		UusiKahvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Aseta kahvin määrä");
				
				int uusiKahvi = Integer.parseInt(uusiArvo);
				
				if (uusiKahvi < 0) {
					
					uusiKahvi = 0;
					
					
				}
				
				JuomaLaite.setKahvi(uusiKahvi);
				
				Kahvilkm.setText(Integer.toString(JuomaLaite.getKahvi()));
				
				int color = JuomaLaite.getKahvi();
				
				if (color  > 20) {
					Kahvilkm.setForeground(Color.BLACK);
				}
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				} catch (NumberFormatException b) {
					
					System.out.println("Nothing added");
				}
			}
		});
		/////////////
		UusiTee.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Aseta teen määrä");
				
				int uusiTee = Integer.parseInt(uusiArvo);
				
				if (uusiTee < 0) {
					
					uusiTee = 0;
					
					
				}
				
				JuomaLaite.setTee(uusiTee);
				
				Teelkm.setText(Integer.toString(JuomaLaite.getTee()));
				
				int color = JuomaLaite.getTee();
				
				if (color  > 20) {
					Teelkm.setForeground(Color.BLACK);
				}
				
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
			} catch (NumberFormatException N) {
				
				System.out.println("Nothing added");
				
			}
			}
		});
		UusiKaakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
				String uusiArvo = JOptionPane.showInputDialog(null, "Aseta kaakaon määrä");
				
				int uusiKaakao = Integer.parseInt(uusiArvo);
				
				if (uusiKaakao < 0) {
					
					uusiKaakao = 0;
					
					
				}
				
				
				
				JuomaLaite.setKaakao(uusiKaakao);
				
				Chocolkm.setText(Integer.toString(JuomaLaite.getKaakao()));
				
				int color = JuomaLaite.getKaakao();
				
				if (color  > 20) {
					Chocolkm.setForeground(Color.BLACK);
				}
				
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
			} catch (NumberFormatException N) {
				
				System.out.println("Nothing added");
				
			}
				
			} 
				
		});
		
		TallennaTiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Sarjallistaminen.kirjoitaTiedostoon(JuomaLaite);
					System.out.print("Tiedot tallennettu, talennus tapahtuu myös automaattisesti");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
	
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		
		VersioTiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Versiotiedot ikkuna = new Versiotiedot();
				ikkuna.setVisible(true);
				
			}
		});
		
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		CoffeBtn = new JButton("New button");
		CoffeBtn.setIcon(new ImageIcon(JuomaKone.class.getResource("/Kättöliittymät/assets/coffeeee.PNG")));
		CoffeBtn.setBounds(27, 56, 124, 128);
		frame.getContentPane().add(CoffeBtn);
		
		TeeBtn = new JButton("New button");
		TeeBtn.setIcon(new ImageIcon(JuomaKone.class.getResource("/Kättöliittymät/assets/tea!.PNG")));
		TeeBtn.setBounds(27, 235, 124, 105);
		frame.getContentPane().add(TeeBtn);
		
		HcBtn = new JButton("New button");
		HcBtn.setIcon(new ImageIcon(JuomaKone.class.getResource("/Kättöliittymät/assets/choco.PNG")));
		HcBtn.setBounds(27, 394, 124, 128);
		frame.getContentPane().add(HcBtn);
		
		lblNewLabel = new JLabel("Kahvi");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(37, 194, 57, 31);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tee");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 360, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Kaakao");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(37, 540, 84, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Kahvia jäljellä: ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_3.setBounds(186, 112, 124, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Teetä jäljellä:");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_4.setBounds(186, 281, 108, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Kaakaota jäljellä:");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_5.setBounds(186, 452, 132, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		Kahvilkm = new JLabel("X"); 
		Kahvilkm.setBounds(359, 123, 45, 13);
		frame.getContentPane().add(Kahvilkm);
		
		Teelkm = new JLabel("X");
		Teelkm.setBounds(359, 288, 45, 13);
		frame.getContentPane().add(Teelkm);
		
		Chocolkm = new JLabel("X");
		Chocolkm.setBounds(359, 459, 45, 13);
		frame.getContentPane().add(Chocolkm);
		
		menuBar_1 = new JMenuBar();
		frame.setJMenuBar(menuBar_1);
		
		mnNewMenu = new JMenu("Ylläpito");
		menuBar_1.add(mnNewMenu);
		
		UusiKahvi = new JMenuItem("Aseta kahvin määrä");
		mnNewMenu.add(UusiKahvi);
		
		UusiTee = new JMenuItem("Aseta teen määrä");
		mnNewMenu.add(UusiTee);
		
		UusiKaakao = new JMenuItem("Aseta kaakaon määrä");
		mnNewMenu.add(UusiKaakao);
		
		TallennaTiedot = new JMenuItem("Tallenna automaatin tila");
		mnNewMenu.add(TallennaTiedot);
		
		LataaTiedot = new JMenuItem("Lataa automaatti");
		
		mnNewMenu.add(LataaTiedot);
		
		Quit = new JMenuItem("Lopeta");
		
		
		mnNewMenu.add(Quit);
		
		mnNewMenu_1 = new JMenu("Tietoja ohjelmasta");
		menuBar_1.add(mnNewMenu_1);
		
		VersioTiedot = new JMenuItem("Versiotiedot");
		mnNewMenu_1.add(VersioTiedot);
		
		
	}
}
