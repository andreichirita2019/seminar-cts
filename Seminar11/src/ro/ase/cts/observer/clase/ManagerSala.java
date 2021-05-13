package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject {
	
	private List<Observer> clienti;
	private final String numeSala;

	public ManagerSala(String numeSala) {
		this.clienti = new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		clienti.add(observer);
	}

	@Override
	public void stergereAbonat(Observer observer) {
		clienti.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(item -> item.receptioneazaMesaj(mesaj));
	}
	
	public void trimiteAnuntImportant(String tipMeci) {
		trimiteMesaj("Astazi se va disputa un meci de " + tipMeci );
	}
	
}
