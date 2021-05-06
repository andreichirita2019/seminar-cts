package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	
	private List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<Command>(); //doar ii alocam spatiu
	}
	
	public void invoke(Command comanda) {
		//trebuie sa adaugam comanda in lista de comenzi
		comenzi.add(comanda); //adauga la sfarsit, dar noi luam de la inceput 
	}
	
	public void executaComanda() {
		//verificam daca sunt comenzi
		if(!comenzi.isEmpty()) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}

}
