package ro.ase.cts.adapter.clase;

public class AdapterCreditObiecte implements CreditAbstract{
	
	private Leasing leasing;
	
	
	public AdapterCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}


	@Override
	public void oferaCredit(float suma) {
		//nu folosim parametrul - deoarece Leasing va avea incorporata acea suma
		//daca il stergem, nu mai respect contractul
		leasing.imprumuta();
	}

}
