package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) throws Exception {
		
		MeciJucat meci1 = new MeciJucat("Dinamo", "FCSB",100,5,7,10);
		
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setNumeGazda("Real Madrid");
		meci1.setNumeOaspete("Barcelona");
		meci1.setNrSpectatori(300);
		meci1.setNrBileteVandute(33);
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		
		
	}

}
