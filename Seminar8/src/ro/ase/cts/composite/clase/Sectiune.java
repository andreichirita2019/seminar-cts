package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	
	//composite
	
	private List<ComponentaMeniu> listaComponente;
	private String numeSectiune;
	
	
	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) {
		listaComponente.add(componentaMeniu);
	}
	
	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		listaComponente.remove(componentaMeniu);
	}
	
	@Override
	public ComponentaMeniu getNod(int index) {
		//preiau componenta aflata pe acest index
		//doar daca exista
		if(index < listaComponente.size() && index >=0) {
			return listaComponente.get(index);
		}
		return null;
	}
	
	@Override
	public void printeaza() {
		System.out.println("Sectiunea: " + numeSectiune);
		//pt fiecare componenta din componentaMeniu din lista
		for(ComponentaMeniu componenta:listaComponente) {
			componenta.printeaza();
		}
		
	}
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.listaComponente = new ArrayList<>();
		this.numeSectiune = numeSectiune;
	}
	
	
}
