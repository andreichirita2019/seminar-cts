package ro.ase.cts.chain.clase;

public class ContCredit extends Cont {
	
	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() > suma) {
			System.out.println("Plata s-a putut efectua din contul de credit!");
			super.setSold(super.getSold() - suma);
		}
		else {
			if(super.getSuccesor()==null) {
				System.out.println("Plata nu se poate face din contul de credit!");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
		
	}
}
