package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	
	private List<Memento> listaMementos = new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		listaMementos.add(memento);
	}
	
	public Memento getMemento(int pos) throws Exception  {
		if(pos>=0 && pos<listaMementos.size()) {
			return listaMementos.get(pos);
		}
		else {
			throw new Exception("Eroare!");
		}
	}
}
