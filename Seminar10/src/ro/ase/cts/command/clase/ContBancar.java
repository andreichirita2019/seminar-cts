package ro.ase.cts.command.clase;

public class ContBancar {
	
	private String detinator;
	private float sold;
	//sold-ul va fi setat la constituire
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		sold=suma;
		System.out.println("S-a constituit contul cu suma de " + suma);
	}
	
	public void retragere(float suma) {
		if(suma<=sold) {
			sold-=suma;
			System.out.println("S-a retras suma de " + suma);
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
	}
	
	public void depunere(float suma) {
		sold+=suma;
		System.out.println("S-a depus in cont suma de "+ suma);
	}
	
}
