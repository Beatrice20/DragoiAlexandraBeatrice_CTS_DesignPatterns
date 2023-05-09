package template.clase;

public class BancomatBitcoin extends BancomatAbstract{

	public BancomatBitcoin(String adresa) {
		super(adresa);
	}

	@Override
	protected void introduceCard() {
		System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
	}

	@Override
	protected void introducePin() {
		System.out.println("A fost introdus PIN-ul pentru card in bancomatul din " + super.getAdresa());
	}

	@Override
	protected void specificareSuma(int suma) {
		System.out.println("A fost specificata suma de criptomoneda de " + super.getAdresa());
	}

	@Override
	protected void retrageSuma() {
		System.out.println("A fost retrasa suma solicitata de criptomoneda de la bancomatul din " + super.getAdresa());
	}

	@Override
	protected void retrageCard() {
		System.out.println("A fost retras cardul de la bancomatul din " + super.getAdresa());
	}

}
