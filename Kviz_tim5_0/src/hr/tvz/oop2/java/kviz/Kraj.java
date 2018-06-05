package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import hr.tvz.oop2.java.podaci.Pitanja;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class Kraj {

	private JFrame frmKvizjankovi;
	private  String ime;
	private  int brTocnih;
	private  int brPitanja;
	private  double uspjesnost;
	private  List<Pitanja> netocni=new ArrayList<Pitanja>();

	/**
	 * Launch the application.
	 */
	public void prikazi() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kraj window = new Kraj(ime, brTocnih,brPitanja, netocni);
					window.frmKvizjankovi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kraj(String ime, int brTocnih, int brPitanja, List<Pitanja> netocni) {
		this.ime=ime;
		this.brTocnih=brTocnih;
		this.brPitanja=brPitanja;
		this.netocni=netocni;
		this.uspjesnost=brTocnih/brPitanja;
		initialize();
	}

	public void  upisUDat () {
		try {

	        File file = new  File("listaStat.txt");

	        if (!file.exists()) {
	            file.createNewFile();
	        }

	        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	        BufferedWriter bw = new BufferedWriter(fw);
	      //bw.write(ime+" "+ Double.toString(uspjesnost));
	        bw.write(ime+" "+ uspjesnost);
	        bw.newLine();
	        bw.close();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	
		

	}
	  

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKvizjankovi = new JFrame();
		frmKvizjankovi.setTitle("Kviz_Tim_5.0");
		frmKvizjankovi.setBounds(100, 100, 613, 614);
		frmKvizjankovi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKvizjankovi.getContentPane().setLayout(null);
		
		
		  
	
		JLabel ime_vrijeme = new JLabel("Èestitamo "+this.ime +"!" );
		ime_vrijeme.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		ime_vrijeme.setBounds(34, 52, 360, 30);
		frmKvizjankovi.getContentPane().add(ime_vrijeme);
		
		JLabel rjesenost = new JLabel("Vaš rezultat je: " +this.brTocnih +"/"+ this.brPitanja);
		rjesenost.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		rjesenost.setBounds(34, 95, 344, 30);
		frmKvizjankovi.getContentPane().add(rjesenost);
		
		
		
		
		JButton pocetak = new JButton("Po\u010Detak");
		pocetak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				upisUDat();
		       
				
				frmKvizjankovi.dispose();
				Pocetni_ekran.prikazi(5, "hr");
			
			}
		});
		pocetak.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		pocetak.setBounds(215, 493, 112, 41);
		frmKvizjankovi.getContentPane().add(pocetak);
		
		
		//ima bug.. ispisuje samo jedan netocan odg
		JTextArea netocniOdg = new JTextArea();
		netocniOdg.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		if(this.netocni.size()!= 0){
			for(Pitanja pit : netocni) { 
				netocniOdg.setText(pit.getTekst()+" "+pit.getTocanOdg().getTekstOdgovora()+"\n");
				
			}
			};
		netocniOdg.setBackground(SystemColor.control);
		netocniOdg.setBounds(54, 148, 488, 294);
		frmKvizjankovi.getContentPane().add(netocniOdg);
		
		
				
					
						
					
				
	}
}
