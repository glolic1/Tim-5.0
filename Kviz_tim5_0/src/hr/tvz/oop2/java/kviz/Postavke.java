package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Postavke {

	private JFrame frmKvizpostavke;
	private JTextField brPitanja;
	private JRadioButton hrv;
	private JRadioButton eng;

	/**
	 * Launch the application.
	 */
	public static void prikaziEkran() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Postavke window = new Postavke();
					window.frmKvizpostavke.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Postavke() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKvizpostavke = new JFrame();
		frmKvizpostavke.setTitle("Kviz/Postavke");
		frmKvizpostavke.setBounds(100, 100, 582, 554);
		frmKvizpostavke.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKvizpostavke.getContentPane().setLayout(null);
		
		//uzima br pitanja 
		brPitanja = new JTextField();
		brPitanja.setBounds(283, 140, 116, 22);
		frmKvizpostavke.getContentPane().add(brPitanja);
		brPitanja.setColumns(10);
		
		
		
		
		
		//vraca na pocetni ekran te, vraca broj pitanja i jezik koji je korisnik odredio
		JButton natrag = new JButton("Natrag");
		natrag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//parsa/casta text u integer za broj pitanja
				//te u konstruktor baca broj pitanja
				int brojPitanja=0;
				try {
					brojPitanja= Integer.parseInt(brPitanja.getText());
					if(brojPitanja>15 || brojPitanja<1) throw new IllegalArgumentException();
					String jezik;
					if (eng.isSelected()) {
						jezik = "en_US";
					} else {
						jezik = "hr";
					}
					frmKvizpostavke.dispose();
					//Pocetni_ekran ekran =new Pocetni_ekran(brojPitanja, jezik);
					Pocetni_ekran.prikazi(brojPitanja, jezik);
				} catch (Exception e){
					JOptionPane.showMessageDialog(frmKvizpostavke, "Unesi broj izmeðu 1 i 15");
				}
				
			}
		});
		natrag.setBounds(225, 422, 97, 25);
		frmKvizpostavke.getContentPane().add(natrag);
		
		JLabel lblPostavke = new JLabel("Postavke");
		lblPostavke.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblPostavke.setBounds(49, 45, 116, 48);
		frmKvizpostavke.getContentPane().add(lblPostavke);
		
		JLabel postavke = new JLabel("Odaberite broj pitanja:");
		postavke.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		postavke.setBounds(54, 134, 217, 34);
		frmKvizpostavke.getContentPane().add(postavke);
		
		JLabel postavke2 = new JLabel("Odaberi jezik:");
		postavke2.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		postavke2.setBounds(56, 212, 167, 16);
		frmKvizpostavke.getContentPane().add(postavke2);
		
		
		
		hrv = new JRadioButton("hrvatski");
		hrv.setBounds(283, 208, 127, 25);
		frmKvizpostavke.getContentPane().add(hrv);
		eng = new JRadioButton("englski");
		eng.setBounds(283, 238, 127, 25);
		frmKvizpostavke.getContentPane().add(eng);
		//grupiranje radio buttona da mozes samo jedan oznaèiti
		ButtonGroup grupa= new ButtonGroup();
		grupa.add(hrv);
		grupa.add(eng);
		
		
		
		
		
	}
}




