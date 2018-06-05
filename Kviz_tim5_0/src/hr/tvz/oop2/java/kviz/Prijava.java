package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prijava {

	private JFrame frmKvizprijava;
	private JTextField igrac;
	private int brPitanja;
	private String jezik;

	/**
	 * Launch the application.
	 */
	public void prikaziEkran() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prijava window = new Prijava(brPitanja, jezik);
					window.frmKvizprijava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prijava(int brpitanja,String jezik) {
		this.brPitanja=brpitanja;
		this.jezik=jezik;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKvizprijava = new JFrame();
		frmKvizprijava.setTitle("Kviz/Prijava");
		frmKvizprijava.setBounds(100, 100, 450, 300);
		frmKvizprijava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKvizprijava.getContentPane().setLayout(null);
		
		JLabel prijava = new JLabel("Prijava");
		prijava.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		prijava.setBounds(171, 31, 74, 43);
		frmKvizprijava.getContentPane().add(prijava);
		
		JLabel lblUnesiKorisnikoIme = new JLabel("Unesi korisni\u010Dko ime:");
		lblUnesiKorisnikoIme.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblUnesiKorisnikoIme.setBounds(39, 109, 197, 16);
		frmKvizprijava.getContentPane().add(lblUnesiKorisnikoIme);
		
		//korisnicko ime sprema u varijablu igrac
		igrac = new JTextField();
		igrac.setBounds(232, 106, 116, 22);
		frmKvizprijava.getContentPane().add(igrac);
		igrac.setColumns(10);
		
		JButton kreni = new JButton("Kreni");
		kreni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmKvizprijava.dispose();
				//dohvaca ime igraca i proslijeduje ga u konstruktor 
				String ime = igrac.getText();
			EkranSPitanjem ekran= new EkranSPitanjem (brPitanja, jezik, ime );
			ekran.prikaziEkran();
				
			}
		});
		kreni.setBounds(101, 174, 97, 25);
		frmKvizprijava.getContentPane().add(kreni);
		
		JButton odustani = new JButton("Odustani");
		odustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//gasi ekran prijava te se vraca na pocetni ekran 
				frmKvizprijava.dispose();
				//Pocetni_ekran ekran =new Pocetni_ekran();
				Pocetni_ekran.prikazi(brPitanja, jezik);
			}
		});
		odustani.setBounds(220, 174, 97, 25);
		frmKvizprijava.getContentPane().add(odustani);
		
		
		
		
	}

}
