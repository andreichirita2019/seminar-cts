package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Program {
	
	
	//primeste acel creditAbstract
	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		
		Leasing leasing1 = new Leasing(100,"John");
		
		//nu putem sa facem asta ptca Leasing nu este de tipul CreditAbstract
		//avem doua clase care nu pot conlucra - exemplu mai jos
		//avem nevoie de un ADAPTER
		//afiseazaInfoCredit(leasing1, leasing1.getSuma());
		
		AdapterCreditObiecte adaptor = new AdapterCreditObiecte(leasing1);
		//adapterul de obiecte - SD Card exemplu
		afiseazaInfoCredit(adaptor, leasing1.getSuma());

	}

}
