package Kättöliittymät;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;






public class Sarjallistaminen {
	
	public static int kaakao;
	public static int kahvi;
	public static int tee;
	
	
	public static void kirjoitaTiedostoon(JuomaAutomaatti ja) throws IOException {

		

		FileOutputStream tiedosto = new FileOutputStream("Automaatti.xml");
		XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(tiedosto));

		
		enc.writeObject(ja);

		
		enc.close();
		tiedosto.close();
		
}
	public static JuomaAutomaatti lueTiedostostaKaakao() throws IOException {

		
			FileInputStream fis = new FileInputStream("Automaatti.xml");
			XMLDecoder decoder = new XMLDecoder(fis);
			
			JuomaAutomaatti ja = (JuomaAutomaatti)decoder.readObject();
			
			decoder.close();
			fis.close();
			
			
			int koko = ja.getKaakao();
			
			
			
			return ja;

		


	}
	public static int getKaakao() {
		return kaakao;
	}
	public static void setKaakao(int kaakao) {
		Sarjallistaminen.kaakao = kaakao;
	}
	public static int getKahvi() {
		return kahvi;
	}
	public static void setKahvi(int kahvi) {
		Sarjallistaminen.kahvi = kahvi;
	}
	public static int getTee() {
		return tee;
	}
	public static void setTee(int tee) {
		Sarjallistaminen.tee = tee;
	}

	public static void kerro() {
		System.out.println(tee);
	}

}


