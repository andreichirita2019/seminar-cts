package ro.ase.cts.simplefactory.clase;

public class FactoryPersonal {
	
	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) throws Exception {
		
		//dezavantaj SimpleFactory - faptul ca incalcam principiul Openclosed cand vrem sa adaugam noi tipuri
		
		switch(tipPersonal) {
		
		case MEDIC: 
			return new Medic(nume);
		
		case ASISTENT: 
			return new Asistent(nume);
		
		case BRANCARDIER: 
			return new Brancardier(nume);
		
		default: 
			throw new Exception("Exception");
			
		}
		
		
	}

}
