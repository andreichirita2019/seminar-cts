package ro.ase.cts.decorator.clase;

public class DecoratorNotaLaMultiAni extends DecoratorAbstract {

	public DecoratorNotaLaMultiAni(NotaAbstracta nota) {
		super(nota);
	}

	@Override
	public void printeazaFelicitare() {
		//este declarata la nivel abstract, dar aceasta este noua functionalitate pe care o aduce si trebuie implementata
		System.out.println("Felicitare -> LA MULTI ANI!!!!!!!!!");
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("La Multi Ani!");
	}

}
