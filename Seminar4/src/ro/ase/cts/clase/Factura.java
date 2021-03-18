package ro.ase.cts.clase;

public class Factura {
	
	private int nrCodFactura;
	private String numeFurnizor;
	private double totalPlata;
	
	private static Factura factura = new Factura(1,"Enel", 52.3);
	
	
	private Factura(int nrCodFactura, String numeFurnizor, double totalPlata) {
		super();
		this.nrCodFactura = nrCodFactura;
		this.numeFurnizor = numeFurnizor;
		this.totalPlata = totalPlata;
	}


	public void setNrCodFactura(int nrCodFactura) {
		this.nrCodFactura = nrCodFactura;
	}


	public void setNumeFurnizor(String numeFurnizor) {
		this.numeFurnizor = numeFurnizor;
	}


	public void setTotalPlata(float totalPlata) {
		this.totalPlata = totalPlata;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Factura [nrCodFactura=");
		builder.append(nrCodFactura);
		builder.append(", numeFurnizor=");
		builder.append(numeFurnizor);
		builder.append(", totalPlata=");
		builder.append(totalPlata);
		builder.append("]");
		return builder.toString();
	}
	
	public static Factura getInstanta() {
		return factura;
	}

}
