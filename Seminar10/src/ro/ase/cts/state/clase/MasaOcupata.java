package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		//trebuie sa verificam daca starea curenta a mesei nu este ocupata
		if(masa.getStareMasa() instanceof MasaOcupata) {
			System.out.println("Masa " + masa.getNrMasa() + " nu se poate ocupa");
		}else {
			masa.setStareMasa(this); //this este un obiect de stare ocupata
			System.out.println("Masa " + masa.getNrMasa() + " este trecuta in stare ocupata!");
		}
		
	}
	

}
