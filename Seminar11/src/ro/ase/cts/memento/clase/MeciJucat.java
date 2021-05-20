package ro.ase.cts.memento.clase;

public class MeciJucat {
	
	private String numeGazda;
	private String numeOaspete;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleVandute;
	private int nrStewarzi;
	public MeciJucat(String numeGazda, String numeOaspete, int nrSpectatori, int nrBileteVandute, int nrSticleVandute,
			int nrStewarzi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspete = numeOaspete;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleVandute = nrSticleVandute;
		this.nrStewarzi = nrStewarzi;
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
	public int getNrBileteVandute() {
		return nrBileteVandute;
	}
	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}
	public int getNrSticleVandute() {
		return nrSticleVandute;
	}
	public void setNrSticleVandute(int nrSticleVandute) {
		this.nrSticleVandute = nrSticleVandute;
	}
	public int getNrStewarzi() {
		return nrStewarzi;
	}
	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspete=");
		builder.append(numeOaspete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleVandute=");
		builder.append(nrSticleVandute);
		builder.append(", nrStewarzi=");
		builder.append(nrStewarzi);
		builder.append("]");
		return builder.toString();
	}
	
	public Memento creareMemento() {
		Memento memento = new Memento(numeGazda, numeGazda, nrSpectatori);
		return memento;
	}
	
	public void setMemento(Memento memento) {
		nrSpectatori = memento.getNrSpectatori();
		numeGazda = memento.getNumeGazda();
		numeOaspete = memento.getNumeOaspete();
	}
}
