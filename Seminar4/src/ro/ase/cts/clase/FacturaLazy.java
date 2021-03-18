package ro.ase.cts.clase;

public class FacturaLazy {
	
	private int nrCodFactura;
	private String numeFurnizor;
	private double totalPlata;
	

	private static FacturaLazy factura = null;
	
	
	private FacturaLazy(int nrCodFactura, String numeFurnizor, double totalPlata) {
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

	public void setTotalPlata(double totalPlata) {
		this.totalPlata = totalPlata;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FacturaLazy [nrCodFactura=");
		builder.append(nrCodFactura);
		builder.append(", numeFurnizor=");
		builder.append(numeFurnizor);
		builder.append(", totalPlata=");
		builder.append(totalPlata);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized FacturaLazy getInstanta(int codFactura, String numeFurnizor, double totalPlata) {
		if (factura == null) {
			factura = new FacturaLazy (codFactura, numeFurnizor, totalPlata);
		}
		return factura;
	}
	
}
