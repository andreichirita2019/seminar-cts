package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.FactoryPersonal;
import ro.ase.cts.simplefactory.clase.Medic;
import ro.ase.cts.simplefactory.clase.PersonalSpital;
import ro.ase.cts.simplefactory.clase.TipPersonal;

public class Program {

	public static void main(String[] args) {
	
		
		try {
			FactoryPersonal factoryPersonal = new FactoryPersonal();
			PersonalSpital medic = factoryPersonal.getPersonal(TipPersonal.MEDIC, "Ana");
			PersonalSpital asistent = factoryPersonal.getPersonal(TipPersonal.ASISTENT, "Catalin");
			
			System.out.println(medic.toString());
			System.out.println(asistent.toString());
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
