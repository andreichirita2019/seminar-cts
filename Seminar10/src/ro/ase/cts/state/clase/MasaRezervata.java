package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof MasaLibera) {
			System.out.println("Masa " + masa.getNrMasa() + " trece in stare rezervata!");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa " + masa.getNrMasa() + " este deja rezervata!");
		}
	}

}
