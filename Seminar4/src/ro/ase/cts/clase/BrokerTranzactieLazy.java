package ro.ase.cts.clase;

public class BrokerTranzactieLazy {
	
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	
	//trebuie sa fie static deoarece trebuie sa fie gestionat la nivel de clasa
	//acea instanta vreau sa fie unica
	
	private static BrokerTranzactieLazy broker = null;
	
	
	private BrokerTranzactieLazy(String nume, int vechime, int nrTranzactiiEfectuate) {
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
		builder.append("BrokerTranzactieLazy [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	//punem synchronized -- nu o sa am sansa sa apelez acelasi constructor de doua ori pe doua fire de executie
	//thread safe 
	public static synchronized BrokerTranzactieLazy getInstanta(String nume, int vechime, int nrTranzactiiEfectuate) {
		if (broker == null) {
			broker = new BrokerTranzactieLazy (nume, vechime, nrTranzactiiEfectuate);
		}
		return broker;
	}
	

}
