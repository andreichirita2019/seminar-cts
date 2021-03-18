package ro.ase.cts.clase;

public class BrokerTranzactie {
	
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	private static BrokerTranzactie broker = new BrokerTranzactie("Marian", 10, 100);
	
	
	//daca il facem private, nu il mai putem apela in main ( regula Singleton)
	private BrokerTranzactie(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setVechime(int vechime) {
		this.vechime = vechime;
	}


	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactie [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	public static BrokerTranzactie getInstanta() {
		return broker;
	}
}
