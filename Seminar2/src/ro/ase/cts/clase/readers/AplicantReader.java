package ro.ase.cts.clase.readers;



import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

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
	
	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		//nu stiu ce fel de Aplicant am - trebuie sa folosim o clasa concreta
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setPunctaj(punctaj);
		aplicant.setVarsta(varsta);
		aplicant.setDenumiriProiecte(nr,vect);
	}
	
}
