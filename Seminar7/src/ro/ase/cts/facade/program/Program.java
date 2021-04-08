package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Program {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("1980512450012", "Andrei");
		
		if(Facade.esteEligibil(persoana)) {
			
			System.out.println("Oferin credit!");
			
		} else {
			
			System.out.println("Nu oferim credit");
		}

	}

}
