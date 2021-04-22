package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {
	
	public static void main (String[] args) {
		
		Rezervare r1 = new Rezervare(5,3,17);
		Rezervare r2 = new Rezervare(4,2,19);
		Rezervare r3 = new Rezervare(10,2,4);
		
		//clientii ii vom crea cu ajutorul unui FlyweightFactory
		
		FlyweightFactory fabrica = new FlyweightFactory();
		
		//fabrica ne va crea clienti pe baza nr de telefon
		fabrica.getClient("071111111").printeazaRezervare(r1);
		fabrica.getClient("072222222").printeazaRezervare(r2);
		fabrica.getClient("071111111").printeazaRezervare(r3);
		
	}
}
