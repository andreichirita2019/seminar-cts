package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	
	 public abstract void seAseazaLaCoada();
	 public abstract void prezintaBiletul();
	 public abstract void seFaceControlCorporal();
	 public abstract void ocupaLocul();
	 
	 public final void intrarePeStadion() {
		 //daca nu este FINAL atunci nu se respecta design pattern-ul
		 seAseazaLaCoada();
		 prezintaBiletul();
		 seFaceControlCorporal();
		 ocupaLocul();
	 }
	
}
