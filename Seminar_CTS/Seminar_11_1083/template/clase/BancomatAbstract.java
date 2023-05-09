package template.clase;

public abstract class BancomatAbstract {
	private String adresa;
	
	public BancomatAbstract(String adresa) {
		this.adresa = adresa;
	}
	
	public String getAdresa() {
		return adresa;
	}
	protected abstract void introduceCard();
	protected abstract void introducePin();
	protected abstract void specificareSuma(int suma);
	protected abstract void retrageSuma();
	protected abstract void retrageCard();
	public final void scoateBaniDeLaBancomat(int suma) {
		introduceCard();
		introducePin();
		specificareSuma(suma);
		retrageSuma();
		retrageCard();
	}
}
