package ro.ase.cts.command.clase;

public class ComandaRetragere extends Command {

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		//trebuie sa apelez metoda de retragere care se apeleaza din ContBancar
		super.getCont().retragere(super.getSuma());
	}

}
