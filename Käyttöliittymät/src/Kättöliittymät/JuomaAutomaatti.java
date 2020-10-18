package Kättöliittymät;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;


public class JuomaAutomaatti {
	
	private int tee;
	public int kahvi;
	private int kaakao;
	

	

	public JuomaAutomaatti()  {
		
		
	}

	
	public JuomaAutomaatti lueTiedostostaKaakao() throws IOException {

		
		FileInputStream fis = new FileInputStream("Automaatti.xml");
		XMLDecoder decoder = new XMLDecoder(fis);
		
		JuomaAutomaatti ja = (JuomaAutomaatti)decoder.readObject();
		
		decoder.close();
		fis.close();
		
		
		setKaakao(ja.getKaakao());
		setKahvi(ja.kahvi);
		setTee(ja.getTee());
		
		
		return ja;

	


}


	public int getTee() {
		return tee;
	}

	public void setTee(int tee) {
		this.tee = tee;
	}

	public int getKahvi() {
		return kahvi;
	}

	public void setKahvi(int kahvi) {
		this.kahvi = kahvi;
	}

	public int getKaakao() {
		return kaakao;

	}

	public void setKaakao(int kaakao) {
		this.kaakao = kaakao;
	}

	public void valmistaKahvi() {
		JOptionPane.showMessageDialog(null, "Odota hetki, kahvisi valmistuu.");
		if (this.kahvi - 10 < 0) {
			this.kahvi = 0;
			JOptionPane.showMessageDialog(null, "kahvia ei ole enää jäljellä! Täytä säiliö.");
		}

		else
			this.kahvi -= 10;

		this.toString();
	}

	public void valmistaTee() {
		JOptionPane.showMessageDialog(null, "Odota hetki, teesi valmistuu. ");
		if (this.tee - 10 < 0) {
			this.tee = 0;
			JOptionPane.showMessageDialog(null, "teetä ei ole enää jäljellä! Täytä säiliö.");
		}

		else
			this.tee -= 10;

		this.toString();

	}

 




	public void valmistaKaakao() {
		JOptionPane.showMessageDialog(null, "Odota hetki, kaakaosi valmistuu. ");
		if (this.kaakao - 10 < 0) {
			this.kaakao = 0;
			JOptionPane.showMessageDialog(null, "kaakaota ei ole enää jäljellä! Täytä säiliö.");
		}

		else
			
			
			this.kaakao -= 10;
		
			System.out.println(this.kaakao);
		
		this.toString();
	}

	@Override
	public String toString() {
		return "JuomaAutomaatti [tee=" + tee + ", kahvi=" + kahvi + ", kaakao=" + kaakao + "]";
	}
}
