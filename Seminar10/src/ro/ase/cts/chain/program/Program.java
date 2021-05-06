package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Program {

	public static void main(String[] args) {

		Cont contEconomii = new ContEconomii(100);
		Cont contCurent = new ContCurent(400);
		Cont contCredit = new ContCredit(300);

		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		//o plateste din contul curent
		contCurent.plateste(50);
		//tot din contul curent
		contCurent.plateste(340);
		//o va plati din contul de economii
		contCurent.plateste(50);
		//o va plati din contul de credit
		contCurent.plateste(200);
		//nu se poate face plata
		contCurent.plateste(150);

		
	}

}
