package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Program {

	public static void main(String[] args) {
		
		ContClient contClient1 = new ContClient("Andrei",22,12);
		ContClient contClient2 = (ContClient) contClient1.copiaza();
		
		System.out.println(contClient1);
		System.out.println(contClient2);
		
		//pe baza acestui prototip ne vom crea alte 2 bilete
		//imi clonez acel prototip
		//validarile le facem DOAR pentru PROTOTIP
		Bilet biletPrototype = new Bilet(1,"Arsenal", "Chelsea", "12/05/2021");
		Bilet bilet1 = (Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(100);
		Bilet bilet2 = (Bilet) biletPrototype.copiaza();
		bilet2.setCodBilet(150);
		
		System.out.println(bilet1);
		System.out.println(bilet2);



	}

}
