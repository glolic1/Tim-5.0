package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

import hr.tvz.oop2.java.podaci.Odgovori;
import hr.tvz.oop2.java.podaci.Pitanja;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EkranSPitanjem {

	private JFrame frmPitanje;

	private static String jezik;
	private static int brPitanja;
	private static String ime;
	
	private int redniBrojPitanja=1;
	
	private JRadioButton[] odgovori;
	private Pitanja pitanje;
	private static final int BROJ_ODGOVORA = 4;
	private static int brTocnih;
	
	 private static  List<Pitanja> netocni;

	/**
	 * Launch the application.
	 */
	public void prikaziEkran() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPitanje.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	//konstruktor
public EkranSPitanjem(int brPitanja, String jezik2, String ime) {
	EkranSPitanjem.brPitanja=brPitanja;
	EkranSPitanjem.jezik=jezik2;
	EkranSPitanjem.ime=ime;
	EkranSPitanjem.brTocnih = 0;
	if(netocni ==null) netocni=new ArrayList<>();
	initialize();
		// TODO Auto-generated constructor stub
	}

	public EkranSPitanjem(int i) {
		// TODO Auto-generated constructor stub
		this.redniBrojPitanja=i;
		initialize();
	}

	//PRIVATNA METODA
	private Pitanja generirajPitanje(ResourceBundle rb) {
		
		List<Odgovori> odgovora = new ArrayList<Odgovori>();
		
		Random rand= new Random();
		int redniBrojPitanja=rand.nextInt(15)+1;
				
		String tocanOdgovor="pitanje."+ redniBrojPitanja+".tocan";
		String t = rb.getString(tocanOdgovor);
		int tocan = Integer.parseInt(t);
		
		for(int i=1;i<5;i++) {
			String kljucZaOdgovor = "pitanje." + redniBrojPitanja + ".odgovor."+i;
			String odg = rb.getString(kljucZaOdgovor);
			Odgovori odgovor;
			if (i == tocan) {
				odgovor = new Odgovori(odg, true);	
				 
			}else {
				odgovor = new Odgovori(odg, false);	
				
			}
			odgovora.add(odgovor);
		}
	
		String kljucZaPitanje = "pitanje." + redniBrojPitanja + ".tekst";
		String txt = rb.getString(kljucZaPitanje);
		Pitanja pitanje = new Pitanja(txt, odgovora);
	
		return pitanje;
		}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {
		
		Locale locale = new Locale(jezik);
		final ResourceBundle rb = ResourceBundle.getBundle("Pitanja", locale);
		pitanje = generirajPitanje(rb);
		odgovori = new JRadioButton[BROJ_ODGOVORA];
		
		frmPitanje = new JFrame();
		frmPitanje.setBounds(100, 100, 613, 614);
		frmPitanje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPitanje.getContentPane().setLayout(null);
		
		odgovori[0] = new JRadioButton(pitanje.getOdgovor().get(0).getTekstOdgovora());
		odgovori[0].setBounds(153, 182, 300, 40);
		frmPitanje.getContentPane().add(odgovori[0]);
		
		odgovori[1] = new JRadioButton(pitanje.getOdgovor().get(1).getTekstOdgovora());
		odgovori[1].setBounds(153, 212, 300, 40);
		frmPitanje.getContentPane().add(odgovori[1]);
		
		odgovori[2]= new JRadioButton(pitanje.getOdgovor().get(2).getTekstOdgovora());
		odgovori[2].setBounds(153, 252, 300, 40);
		frmPitanje.getContentPane().add(odgovori[2]);
		
		odgovori[3]= new JRadioButton(pitanje.getOdgovor().get(3).getTekstOdgovora());
		odgovori[3].setBounds(153, 298, 300, 40);
		frmPitanje.getContentPane().add(odgovori[3]);
		
		ButtonGroup grupa =new ButtonGroup();
		grupa.add(odgovori[0]);
		grupa.add(odgovori[1]);
		grupa.add(odgovori[2]);
		grupa.add(odgovori[3]);
		
		JButton odgovoriButton = new JButton("Odgovori!");
		odgovoriButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmPitanje.dispose();
			boolean tocan = false;
	
			for(int i = 0; i < BROJ_ODGOVORA; i++) {
			   if(odgovori[i].isSelected()) {
			   if(pitanje.getOdgovor().get(i).getTocno()) {
			     tocan = true;
			     break;
			  }
			  }
			  }
			  if (tocan) {
				  EkranSPitanjem.brTocnih++;
			   
			  } else {
				 //spremanje u listu netoèno odg pitanja
				  netocni.add(pitanje);
				  
				   
				  
			  };
			  
			    
			  if (redniBrojPitanja == brPitanja) {
				  frmPitanje.dispose();
				  Kraj fin = new Kraj(ime, brTocnih, brPitanja, netocni);
				  fin.prikazi();
						  
			   }
			   else {
			      EkranSPitanjem novoPitanje = new EkranSPitanjem(redniBrojPitanja + 1);
			      novoPitanje.prikaziEkran();
			   }

			  }
			}); 

		odgovoriButton.setBounds(183, 426, 97, 25);
		frmPitanje.getContentPane().add(odgovoriButton);
		
		JLabel lblNewLabel = new JLabel(pitanje.getTekst());
		lblNewLabel.setBounds(150, 75, 284, 38);
		frmPitanje.getContentPane().add(lblNewLabel);
		
		
		
		
	}
}

