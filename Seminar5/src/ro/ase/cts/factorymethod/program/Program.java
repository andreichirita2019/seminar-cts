package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AsistentFactory;
import ro.ase.cts.factorymethod.clase.BrancardierFactory;
import ro.ase.cts.factorymethod.clase.FactoryPersonal;
import ro.ase.cts.factorymethod.clase.InfirmierFactory;
import ro.ase.cts.factorymethod.clase.MedicFactory;
import ro.ase.cts.factorymethod.clase.PersonalSpital;

public class Program {
	
	
	private static void printeazaPersonalSpital(FactoryPersonal fabrica, String nume) {
		
		//Dependency inversion - conexiune doar cu tipurile abstracte
		//eu cand il apelez ii dau un tip concret
		//dezavantaj - multe clase
		
		PersonalSpital factoryPersonal = fabrica.getPersonal(nume);
		System.out.println(factoryPersonal.toString());
		
		
	}

	public static void main(String[] args) {
		printeazaPersonalSpital(new MedicFactory(), "John");
		printeazaPersonalSpital(new AsistentFactory(), "Maria");
		printeazaPersonalSpital(new BrancardierFactory(), "Leon");
		printeazaPersonalSpital(new InfirmierFactory(), "Andreea");
	}

}
