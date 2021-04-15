package ro.ase.cts.decorator.clase;

public class DecoratorNotaPasteFericit  extends DecoratorAbstract {

	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
	}

	@Override
	public void printeazaFelicitare() {
		//este declarata la nivel abstract, dar aceasta este noua functionalitate pe care o aduce si trebuie implementata
		System.out.println("Felicitare -> PASTE FERICIT!!!!!!!!!");
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("Paste Fericit!");
	}
}