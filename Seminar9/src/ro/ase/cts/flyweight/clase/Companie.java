package ro.ase.cts.flyweight.clase;

public class Companie implements Flyweight{
	
	private String numeCompanie;
	private String nrTelefonCompanie;
	private String CUI;
	
	public Companie(String numeCompanie, String nrTelefonCompanie, String cUI) {
		super();
		this.numeCompanie = numeCompanie;
		this.nrTelefonCompanie = nrTelefonCompanie;
		CUI = cUI;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Companie [numeCompanie=");
		builder.append(numeCompanie);
		builder.append(", nrTelefonCompanie=");
		builder.append(nrTelefonCompanie);
		builder.append(", CUI=");
		builder.append(CUI);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(this.toString() + rezervare.toString());
		
	}
	
	

}
