package ro.ase.cts.flyweight.clase;

public class Client implements Flyweight{
	
	private String numeClient;
	private String nrTelefonClient;
	private String emailClient;
	

	public Client(String numeClient, String nrTelefonClient, String emailClient) {
		super();
		this.numeClient = numeClient;
		this.nrTelefonClient = nrTelefonClient;
		this.emailClient = emailClient;
	}
	
	
	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(this.toString() + rezervare.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrTelefonClient=");
		builder.append(nrTelefonClient);
		builder.append(", emailClient=");
		builder.append(emailClient);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
