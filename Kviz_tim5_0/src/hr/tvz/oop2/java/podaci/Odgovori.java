package hr.tvz.oop2.java.podaci;

public class Odgovori {
	
	private String tekstOdgovora;
	private boolean tocno;
	
	
	public Odgovori(String tekst, boolean odg) {
		this.tekstOdgovora=tekst;
		this.tocno=odg;
	}
	
	public String getTekstOdgovora() {
		return tekstOdgovora;
	}

	public void setTekstOdgovora(String tekst) {
		this.tekstOdgovora = tekst;
	}

	public boolean getTocno() {	//isCorrect, isTocan
		return tocno;	
	}

	public void setTocno(boolean odgovor) {
		this.tocno = odgovor;
	}


}
