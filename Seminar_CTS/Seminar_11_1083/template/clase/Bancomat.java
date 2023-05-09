package template.clase;

public class Bancomat extends BancomatAbstract{
 
	public Bancomat(String adresa) {
		super(adresa);
	}

	@Override
	protected void introduceCard() {
		System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
	}

	@Override
	protected void introducePin() {
		System.out.println("A fost introdus PIN-ul pentru card in bancoamtul din " + super.getAdresa());
	}

	@Override
	protected void specificareSuma(int suma) {
		System.out.println("A fost specificta pentru retragere suma de " + suma);
	}

	@Override
	protected void retrageSuma() {
		System.out.println("A fost retrasa suma solicitata de la bancomatul din  " + super.getAdresa());
	}

	@Override
	protected void retrageCard() {
		System.out.println("A fost retras cardul din bancomatul din  " + super.getAdresa());
	}

}
