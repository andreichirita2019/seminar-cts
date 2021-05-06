package ro.ase.cts.state.clase;

public class Masa {
	
	private int nrMasa;
	private Stare stareMasa;
	
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stareMasa = new MasaLibera();
	}


	protected void setStareMasa(Stare stareMasa) {
		this.stareMasa = stareMasa;
	}


	public int getNrMasa() {
		return nrMasa;
	}


	public Stare getStareMasa() {
		return stareMasa;
	}
	
	public void ocupaMasa() {
		//aici eu imi doresc sa trec aceasta masa in starea ocupata
		//imi creez un obiect de tip masaOcupata si apoi prin intermediul acestui obiect, incerc sa modific starea mesei curente
		MasaOcupata masaOcupata = new MasaOcupata();
		//se fac verificarile
		masaOcupata.modificaStare(this);
	}
	
	public void rezervaMasa() {
		//ii voi schimba starea in Masa Rezervata
		MasaRezervata masaRezervata = new MasaRezervata();
		masaRezervata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		MasaLibera masaLibera = new MasaLibera();
		masaLibera.modificaStare(this);
	}
	
}
