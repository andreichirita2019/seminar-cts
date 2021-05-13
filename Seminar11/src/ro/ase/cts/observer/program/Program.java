package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		
		ManagerSala manager = new ManagerSala("Sala Nr.3");
		Observer client1 = new Client("Alin");
		Observer client2 = new Client("Marius");
		Observer client3 = new Client("Ion");
		
		manager.adaugareAbonat(client1);
		manager.adaugareAbonat(client2);
		manager.adaugareAbonat(client3);
		
		manager.trimiteAnuntImportant("Fotbal");
		manager.trimiteAnuntImportant("Volei");
		manager.stergereAbonat(client3);
		manager.trimiteAnuntImportant("Handbal");

	}

}
