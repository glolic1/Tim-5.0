package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pocetni_ekran {

	private JFrame frmKvizJnkovi;
	private int brojPitanja = 5;
	private String jezik = "hr";
  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		prikazi(5, "hr");
	}
	
	public static void prikazi(int brPitanja, String jezik) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pocetni_ekran window = new Pocetni_ekran(brPitanja, jezik);
					window.frmKvizJnkovi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param brojPitanja 
	 */
	public Pocetni_ekran(int brojPitanja, String jezik) {
		this.brojPitanja=brojPitanja;
		this.jezik=jezik;
		initialize();
	}
	
	//defaultni konstruktor
	public Pocetni_ekran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKvizJnkovi = new JFrame();
		frmKvizJnkovi.setTitle("Kviz \u0160. Tim 5.0");
		frmKvizJnkovi.setBounds(100, 100, 613, 614);
		frmKvizJnkovi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKvizJnkovi.getContentPane().setLayout(null);
		
		JLabel Naslov = new JLabel("Kviz");
		Naslov.setFont(new Font("Sitka Text", Font.BOLD, 40));
		Naslov.setBounds(265, 53, 97, 60);
		frmKvizJnkovi.getContentPane().add(Naslov);
		
		JButton Zapocni = new JButton("Zapo\u010Dni");
		Zapocni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//kreira novi objekt te  otvara prozor prijava metodom
				Prijava ekran= new Prijava(brojPitanja, jezik);
				ekran.prikaziEkran();
				frmKvizJnkovi.dispose();
			}
		});
		Zapocni.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		Zapocni.setBounds(248, 161, 124, 39);
		frmKvizJnkovi.getContentPane().add(Zapocni);
		
		JButton Postavke = new JButton("Postavke");
		Postavke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//kreira novi objekt te  otvara prozor postavke metodom
				Postavke ekran= new Postavke();
				ekran.prikaziEkran();
				frmKvizJnkovi.dispose();
				//frmKvizJnkovi.setVisible(false);
			}
		});
		Postavke.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		Postavke.setBounds(248, 227, 124, 39);
		frmKvizJnkovi.getContentPane().add(Postavke);
		
		JButton Statistika = new JButton("Statistika");
		Statistika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//kreira novi objekt te  otvara prozor postavke metodom
				Statistika ekran= new Statistika();
				ekran.prikaziEkran();
				frmKvizJnkovi.dispose();
			
			}
		});
		Statistika.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		Statistika.setBounds(248, 296, 124, 39);
		frmKvizJnkovi.getContentPane().add(Statistika);
	}
}
