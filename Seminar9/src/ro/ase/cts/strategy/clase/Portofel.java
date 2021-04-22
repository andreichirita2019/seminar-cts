package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy{
	
	private float sumaDisponibila;

	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}



	@Override
	public void realizeazaPlata(float suma) {
		if(sumaDisponibila >= suma) {
			System.out.println("Tranzactia a fost efectuata cash pentru suma de " + suma + " RON");
			sumaDisponibila-=suma;
			return;
		}
		System.out.println("Fonduri insuficiente");
		
	}

}
