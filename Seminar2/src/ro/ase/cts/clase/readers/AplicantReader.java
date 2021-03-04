package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {

	//am transformat din interfata in clasa abstracta ca sa respectam DRY 
	
	protected String fileName;
	//il facem protected ca sa aiba acces mai repede
	//acest fileName va fi folosit DOAR in READEREEE (sunt fiii clasei acesteia)
	//relatia mea intre 
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
}
