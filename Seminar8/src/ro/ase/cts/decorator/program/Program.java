package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {

		NotaAbstracta nota = new NotaDePlata(100);
		nota.printeaza();
		
		//Paste
		DecoratorAbstract decoratorPasteFericit = new DecoratorNotaPasteFericit(nota);
		
		decoratorPasteFericit.printeazaFelicitare();
		decoratorPasteFericit.printeaza();
		
		System.out.println();
		
		//LMA
		DecoratorAbstract decoratorLMA = new DecoratorNotaLaMultiAni(nota);
		decoratorLMA.printeaza();
		
		//decorare multipla
		NotaAbstracta notaNoua = new NotaDePlata(36);
		//functionalitate la multi ani
		DecoratorAbstract decoratorLMANou = new DecoratorNotaLaMultiAni(notaNoua);
		//functionalitate paste fericit
		DecoratorAbstract decoratorPaste = new DecoratorNotaPasteFericit(decoratorLMANou);
		//printare
		decoratorPaste.printeaza(); //se va apela decoratorNotaP
		
		
		
	}

}
