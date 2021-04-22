package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String, Flyweight> listaClienti;

	public Flyweight getClient(String nrTelefonClient) {
		Flyweight flyweight = listaClienti.get(nrTelefonClient);
		if(flyweight == null) {
			flyweight = new Client("Ion", nrTelefonClient, "ion@gmail.com");
			listaClienti.put(nrTelefonClient, flyweight);
		}
		return listaClienti.get(nrTelefonClient);
	}

	public FlyweightFactory() {
		super();
		this.listaClienti = new HashMap<String, Flyweight>();
	}
	
	

}
