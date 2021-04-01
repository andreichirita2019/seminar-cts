package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype {
	
	private int codBilet;
	private String echipa1;
	private String echipa2;
	private String dataEveniment;
	
	
	public Bilet(int codBilet, String echipa1, String echipa2, String dataEveniment) {
		super();
		this.codBilet = codBilet;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.dataEveniment = dataEveniment;
	}


	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [codBilet=");
		builder.append(codBilet);
		builder.append(", echipa1=");
		builder.append(echipa1);
		builder.append(", echipa2=");
		builder.append(echipa2);
		builder.append(", dataEveniment=");
		builder.append(dataEveniment);
		builder.append("]");
		return builder.toString();
	}
	
	private Bilet() {
		super();
	}


	@Override
	public AbstractPrototype copiaza() {
		
		Bilet bilet = new Bilet();
		bilet.codBilet = this.codBilet;
		bilet.echipa1 = this.echipa1;
		bilet.echipa2 = this.echipa2;
		bilet.dataEveniment = this.dataEveniment;
		return bilet;
	}

}
