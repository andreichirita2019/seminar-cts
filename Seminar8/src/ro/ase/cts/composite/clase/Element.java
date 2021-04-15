package ro.ase.cts.composite.clase;

public class Element implements ComponentaMeniu {
	
	//o sa ne folosim doar de printeaza, iar la restul aruncam exceptii
	//aceste metode nu isi au rostul in clasa nod frunza
	//element -> nodFrunza
	
	private String numeElement;

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) throws IllegalArgumentException {
		throw new IllegalArgumentException("Nu este implementata");
	}

	@Override
	public ComponentaMeniu getNod(int index) throws IllegalArgumentException {
		throw new IllegalArgumentException("Nu este implementata");
	}

	@Override
	public void printeaza() {
		
		System.out.println("Element nume: " + numeElement);
	}

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}
	
	
	

}
