package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements NotaAbstracta{
	//va trebui sa fie abstracta astfel incat sa fie decoratorul concret cel care adauga acea functionalitate ci nu acesta
	
	private NotaAbstracta nota;
	
	public void printeaza() {
		nota.printeaza();
	}

	public DecoratorAbstract(NotaAbstracta nota) {
		super();
		this.nota = nota;
	}
	
	public abstract void printeazaFelicitare(); // o facem in decoratorul concret
	

}
