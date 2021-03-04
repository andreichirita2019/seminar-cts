package ro.ase.cts.program;

import java.io.FileNotFoundException;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReader;

import java.util.List;

public class Program {
	
	//nu a fost respectat Dependency Inversion Principle
	//facem clasa abstracta daca avem atribute, altfel putem alege intre clasa abstracta si interfata
	//sa incerci sa nu depinzi de o clasa concreta ci de tipul abstract
	//modificam doar la linia 19
	//ramane totul la fel - LS	
	
	//o metoda mereu trebuie apelata prin intermediul unui Obiect -- sunt in interiorul clasei
	//metoda spre deosebire de functie primeste pe prima pozitie pointerul THIS
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException{
		//!!UPDATEE - PUTEM da un singur parametru, dar trebuie clasa abstracta
		//!!!UPDATE - 
		//trebuie sa punem al doilea parametru de tipul AplicantReader
		return reader.readAplicanti();
		//nu trebuie declarata ci putem returna direct
	}

	public static void main(String[] args) {
		List<Aplicant> listaAngajati; 
		
		try {
			listaAngajati = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}