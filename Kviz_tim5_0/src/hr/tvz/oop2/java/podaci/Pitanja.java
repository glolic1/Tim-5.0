package hr.tvz.oop2.java.podaci;

import java.util.List;


public class Pitanja {
	private String tekst;
	private List<Odgovori> odgovor;

	public Pitanja(String pitanje, List<Odgovori> odgovori) {
		super();
		this.tekst=pitanje;
		this.odgovor=(odgovori);
		
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public List<Odgovori> getOdgovor() {
		return odgovor;
	}

	public void setOdgovor(List<Odgovori> odgovor) {
		this.odgovor = odgovor;
	}
		
	public Odgovori getTocanOdg() {
		for(int i=0; i<odgovor.size();i++) {
			if (odgovor.get(i).getTocno())
				return odgovor.get(i);
			
		}
		return null;
	}
	
//	public Odgovor getTocanOdgovor() {
//		for (Odgovor odg : odgovori) {
//			if (odg.isTocan())
//				return odg;
//		}
//		return null;
//	}

}
