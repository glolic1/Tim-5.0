package hr.tvz.oop2.java.kviz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Statistika {

	private JFrame frmKvizstatistika;

	/**
	 * Launch the application.
	 */
	public void prikaziEkran() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistika window = new Statistika();
					window.frmKvizstatistika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Statistika() {
		initialize();
	}

	//ne sprema dobro, sort sredit
	 
	    public String ispisIzDat() { 
	    	String txt = null;
	    	try {
	    		 File file = new  File("listaStat.txt");
	             FileReader reader = new FileReader(file);
	             BufferedReader bufferedReader = new BufferedReader(reader);
	             Map<String, Double> rows = new HashMap<String, Double>();
	             String line;
	             
	  
	             while ((line = bufferedReader.readLine()) != null) {
	                rows.put(line, odvajanje(line));  	               
	             }
	             Map<String, Double> r = sort(rows);
	             for (String key : r.keySet()) {
	            	 txt += key + "\n";
	             }
	          
	             reader.close();
	  
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	    	 return txt;
	    }
	    private double odvajanje(String line) {
	    	Double uspjeh=Double.valueOf(line.split(" ")[1]);
	    	return uspjeh;
	    }
	public Map<String, Double> sort(Map<String, Double> rows) {
		 List<Entry<String, Double>> list = new ArrayList<>(rows.entrySet());
	        list.sort(Entry.comparingByValue());
	        Collections.reverse(list);
	        Map<String, Double> result = new LinkedHashMap<>();
	        for (Entry<String, Double> entry : list) {
	            result.put(entry.getKey(), entry.getValue());
	        }
	        return result;
		}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKvizstatistika = new JFrame();
		frmKvizstatistika.setTitle("Kviz/Statistika");
		frmKvizstatistika.setBounds(100, 100, 611, 694);
		frmKvizstatistika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKvizstatistika.getContentPane().setLayout(null);
		
		JLabel stat = new JLabel("Rang lista");
		stat.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		stat.setBounds(38, 62, 258, 43);
		frmKvizstatistika.getContentPane().add(stat);
		
		JButton btnNazad = new JButton("Natrag");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmKvizstatistika.dispose();
				Pocetni_ekran ekran=new Pocetni_ekran();
				
			}
		});
		btnNazad.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		btnNazad.setBounds(198, 507, 172, 43);
		frmKvizstatistika.getContentPane().add(btnNazad);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textPane.setBackground(SystemColor.control);
		
		textPane.setText(ispisIzDat());
		textPane.setBounds(92, 118, 375, 341);
		frmKvizstatistika.getContentPane().add(textPane);
	}
}
