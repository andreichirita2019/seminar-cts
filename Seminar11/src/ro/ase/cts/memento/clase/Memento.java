package ro.ase.cts.memento.clase;

public class Memento {
	
	private String numeGazda;
	private String numeOaspete;
	private int nrSpectatori;
	
	public Memento(String numeGazda, String numeOaspete, int nrSpectatori) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspete = numeOaspete;
		this.nrSpectatori = nrSpectatori;
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public String getNumeOaspete() {
		return numeOaspete;
	}
	public void setNumeOaspete(String numeOaspete) {
		this.numeOaspete = numeOaspete;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	
	
}
