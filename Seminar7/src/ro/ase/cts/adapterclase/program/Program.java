package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adapterclase.clase.AdapterCreditClase;
import ro.ase.cts.adapterclase.clase.CreditAbstract;

public class Program {

	public static void afiseazaInfoCredit(CreditAbstract credit) {
	
		credit.oferaCredit();
		
	}
	
	public static void main(String[] args) {
		
		AdapterCreditClase adapter1 = new AdapterCreditClase(50,"Andrei"); //imi creez automat in spate si obiectul de tip Leasing
		afiseazaInfoCredit(adapter1);
		
	}

}
