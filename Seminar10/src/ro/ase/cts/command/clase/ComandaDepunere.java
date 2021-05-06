package ro.ase.cts.command.clase;

public class ComandaDepunere extends Command {

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		//punem super pentru a stii clar ca apelam din parinte
		super.getCont().depunere(super.getSuma());
	}
	
	
}
