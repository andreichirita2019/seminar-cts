package ro.ase.cts.flyweight.clase;

public class Rezervare {
	
	private int nrMasa;
	private int nrPersoane;
	private int oraRezervare;
	
	
	public Rezervare(int nrMasa, int nrPersoane, int oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	

}
