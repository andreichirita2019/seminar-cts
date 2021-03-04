package ro.ase.cts.program;

import java.io.FileNotFoundException;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;

import java.util.List;

public class Program {
	
	//nu a fost respectat Dependency Inversion 
	//sa incerci sa nu depinzi de o clasa concreta ci de tipul abstract

	public static void main(String[] args) {
		List<Aplicant> listaAngajati; 
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
