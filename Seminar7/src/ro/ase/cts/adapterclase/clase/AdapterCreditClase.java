package ro.ase.cts.adapterclase.clase;


public class AdapterCreditClase extends Leasing implements CreditAbstract{

	//acest Adapter are relatie de IS-A ( este si un credit si un leasing)
	//prin aceasta mostenire, eu am adaptat toata clasa LEASING la CREDIT
	
	public AdapterCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}

	@Override
	public void oferaCredit() {
		//va trb sa apelam metoda din Leasing (imprumuta)
		//apelam de la parinte
		
		super.imprumuta();
	}

}
