package ro.ase.cts.clase;

public class Zookeeper {
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}
	public void feed(Animal a) {
		System.out.println(nume+" hraneste animalul "+a.getName());
	}
}