package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.FacturaLazy;

public class Program {

	public static void main(String[] args) {
		
		BrokerTranzactie broker1 = BrokerTranzactie.getInstanta();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstanta();
		
		
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);

		
		//System.out.println(broker1.toString());
		//System.out.println(broker2.toString());
		
		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstanta("Ana", 2, 30);
		BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstanta("Maria", 4, 50);
		//System.out.println(lazy1.toString());
		
		
		
		FacturaLazy factura1 = FacturaLazy.getInstanta(1,"Orange",30);
		FacturaLazy factura2 = FacturaLazy.getInstanta(2,"Vodafone",50);
		System.out.println(factura1.toString());
		System.out.println(factura2.toString());

	}

}
